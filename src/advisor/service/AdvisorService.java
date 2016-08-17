package advisor.service;

import healthprofile.storage.service.HealthProfileService;
import healthprofile.storage.service.HealthProfileServiceService;
import healthprofile.storage.service.Measure;
import healthprofile.storage.service.Person;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.glassfish.jersey.client.ClientConfig;

import recipestorage.service.Recipe;

@WebService
public class AdvisorService  implements AdvisorServiceInterface{
	private static final String CAL_CALC_URL = "https://isdemm-calcalc.herokuapp.com/harris-benedict/bmr";

	private static final Logger logger = LogManager.getFormatterLogger("AdvisorService");

	private static final double PAL_LOW = 1.2;
	private static final double PAL_LITTLE = 1.375;
	private static final double PAL_MODERATE = 1.55;
	private static final double PAL_HEAVY = 1.725;
	private static final double PAL_VERYHEAVY = 1.9;
	
	private static final double BMI_UNDERWEIGHT = 18.5;
	private static final double BMI_NORMAL = 25.0;
	private static final double BMI_OVERWEIGHT = 30;
	
	private static final double DAILY_CALORY_DEFICIT = 300;
	private static final double CALORY_DIFF_TOLERANCE = 30;
	
	private static final String HEIGHT = MeasureTypes.HEIGHT.getType();
	private static final String WEIGHT = MeasureTypes.WEIGHT.getType();
	private static final String PAL_FACTOR = MeasureTypes.PAL_FACTOR.getType();

	private static final int PAL_HISTORY_BACK = 7;

	@Override
	public String getFitnessAdvice(Integer person_id) {
		HealthProfileServiceService hpss = new HealthProfileServiceService();
		HealthProfileService hpservice = hpss.getHealthProfileServicePort();
		
		double avg = 0;
		
		GregorianCalendar from = new GregorianCalendar();
		GregorianCalendar to = new GregorianCalendar();
		from.add(Calendar.DATE, -PAL_HISTORY_BACK);		
		
		List<Measure> pal_factor_history = hpservice.getMeasureHistory(person_id, PAL_FACTOR, toXMLCal(from), toXMLCal(to));
		logger.debug("PAL factor history for person %d: %s", person_id, pal_factor_history);
		
		if (pal_factor_history.isEmpty()){
			logger.debug("Average PAL factor cannot be calculated: no history.");
			return "There are no data about your activity.";
		}
		
		for (int i = 0; i < pal_factor_history.size(); i++)
			avg += pal_factor_history.get(i).getValue();
		
		avg = avg / pal_factor_history.size();
		logger.debug("Average PAL factor: " + avg);
		
		String result = "Your activity has been evaluated based on the history: ";
		if (avg < PAL_LOW)
			result = "You should do more exercise.";
		else if (isBetween(avg, PAL_LOW, PAL_MODERATE))
			result = "Try to plan a little bit more activity!";
		else if (isBetween(avg, PAL_MODERATE, PAL_HEAVY))
			result = "You are very active, thats great!";
		else
			result = "You are very active, thats great! Maybe you can slow down sometimes";
		
		logger.debug(result);
		return result;
	}

	private XMLGregorianCalendar toXMLCal(GregorianCalendar from) {		
		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(from);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getWeightAdvice(Integer person_id) {
		HealthProfileServiceService hpss = new HealthProfileServiceService();
		HealthProfileService hpservice = hpss.getHealthProfileServicePort();
		
		Measure weight = hpservice.getMeasure(person_id, WEIGHT);
		Measure height = hpservice.getMeasure(person_id, HEIGHT);
		
		if(weight == null || height == null){
			String ret = "No weight advice can be given, because the following data are missing in your healthprofile:\n";
			
			if (weight == null) {
				ret +=  "weight\n";
				logger.debug("Weight not found. BMI cannot be calculated.");	
			}
			if (height == null){
				ret +=  "height\n";
				logger.debug("Height not found. BMI cannot be calculated.");
			}			
			return ret;
		}
		
		double bmi = bmi(weight.getValue(), height.getValue());
		
		logger.debug("BMI for person %d is %f:", person_id, bmi);
		
		String result = null;
		if (bmi < BMI_UNDERWEIGHT)
			result = "You are underweight. Try to eat more. If you have an eating disorder look for professional help.";
		else if (isBetween(bmi, BMI_UNDERWEIGHT, BMI_NORMAL))
			result = "You have a healthy weight.";
		else if (isBetween(bmi, BMI_NORMAL, BMI_OVERWEIGHT))
			result = "You are overweight. Try to be active and take a look  at your meals.";
		else 
			result = "You are obese. Ask a professional dietist.";
		
		logger.debug(result);
		return result;
	}

	@Override
	public Double getRecommendedIntake(Person p) {
		HealthProfileServiceService hpss = new HealthProfileServiceService();
		HealthProfileService hpservice = hpss.getHealthProfileServicePort();
		
		logger.debug("Getting actual weight and height");
		Measure weight = hpservice.getMeasure(p.getId(), WEIGHT);
		Measure height = hpservice.getMeasure(p.getId(), HEIGHT);
		int age = age(p);
		
		if(weight == null || height == null){
			if (weight == null)
				logger.debug("Weight not found. BMI cannot be calculated.");	
			if (height == null)
				logger.debug("Height not found. BMI cannot be calculated.");
			return null;
		}
		
		double intake = recommendedIntake((char) p.getSex(), weight.getValue(), height.getValue()*100, age);
		
		double bmi = bmi(weight.getValue(), height.getValue()); 
		if (bmi > BMI_NORMAL) {
			logger.debug("BMI (%f) too high (limit = %f) ", bmi, BMI_NORMAL);
			logger.debug("Reducing recomended intake %f by %f", intake, DAILY_CALORY_DEFICIT);
			
			intake -= DAILY_CALORY_DEFICIT;
		}
		
		logger.debug("Recommended intake for person %s is %f:", p, intake);
		return intake;
	}

	@Override
	public String getMealAdvice(Person p, List<Recipe> meals) {
		logger.debug("Person %s has the following daily menu: %s", p, meals);
		
		StringBuilder ret = new StringBuilder();
		Double recommended_cal = getRecommendedIntake(p);
		double meals_cal = 0;
		
		if (recommended_cal == null){
			ret.append("There is no information about the recommended intake. ");
			ret.append("No meal advice can be given.");
			logger.debug("Recommended intake is 'null'. Meal validation terminated.");
			return ret.toString();
		}
		
		for (int i = 0; i < meals.size(); i++){
			Recipe r = meals.get(i);
			meals_cal += r.getKcal() /r.getNumServings();
		}
	
		logger.debug("Selected meals have total calories of %fkcal (per serving)", meals_cal);
		
		String calory_str = "Recommended calories: %.2f\n";
		ret.append(String.format(calory_str, recommended_cal));
		
		ret.append("Your selected meals (kcal per serving):\n");
		for (int i = 0; i < meals.size(); i++){
			Recipe r = meals.get(i);
			String recipe_txt = String.format("%s (%.2f)kcal\n", r.getName(), r.getKcal()/r.getNumServings());
			ret.append(recipe_txt);
		}
		ret.append(String.format("Total calories of the selected meals: %.2f kcal\n", meals_cal));		
		
		double cal_diff = meals_cal - recommended_cal;
		if (cal_diff > CALORY_DIFF_TOLERANCE)			
			ret.append("Try to find lighter meals or reduce your portions.");
		else if (cal_diff < CALORY_DIFF_TOLERANCE)
			ret.append("You should not eat less than the recommended daily calory intake, even if you are going on a diet!");
		else
			ret.append("Your daily menu is ok. Enjoy it!");		
		
		logger.debug(ret.toString());
		
		return ret.toString();
	}

	private boolean isBetween(double number, double min, double max){
		return min < number && number < max;
	}
	
	private double bmi(double weight, double height){
		return weight/(height*height);
	}
	
	private double recommendedIntake(char sex, double weight, double height_in_cm, int age){
		logger.debug("Getting recommended intake");
		ClientConfig clientConfig = new ClientConfig();
        Client client = ClientBuilder.newClient(clientConfig);
        WebTarget service = client.target(CAL_CALC_URL);
        
        service = service
        		.queryParam("sex", sex)
        		.queryParam("weight", weight)
        		.queryParam("height", height_in_cm)
        		.queryParam("age", age);
        
        String ret = service.request().accept(MediaType.TEXT_PLAIN).get(String.class);
        
        return Double.parseDouble(ret);        
	}
	
	private int age(Person p){
		int birthyear =  p.getBirthdate().getYear();
		Calendar now = Calendar.getInstance();
		
		int age =  now.get(Calendar.YEAR) - birthyear;
		logger.trace("Person %s has %d years.", p, age);
		return age;
	}
}
