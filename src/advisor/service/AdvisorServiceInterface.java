package advisor.service;

import healthprofile.storage.service.Person;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import recipestorage.service.Recipe;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface AdvisorServiceInterface {
	
	@WebMethod
	public String getFitnessAdvice(Integer person_id );
	
	@WebMethod
	public String getWeightAdvice(
			Integer person_id);
	
	@WebMethod
	public Double getRecommendedIntake(@WebParam(name="person") Person p); 
	
	@WebMethod
	public String getMealAdvice(
			@WebParam(name="person") Person p, 
			@WebParam(name="meals") List<Recipe> meals);
}
