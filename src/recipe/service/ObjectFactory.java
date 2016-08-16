
package recipe.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the recipe.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateRecipeIngredientsResponse_QNAME = new QName("http://service.recipe/", "updateRecipeIngredientsResponse");
    private final static QName _FindRecipeResponse_QNAME = new QName("http://service.recipe/", "findRecipeResponse");
    private final static QName _FindRecipe_QNAME = new QName("http://service.recipe/", "findRecipe");
    private final static QName _CreateInstantRecipe_QNAME = new QName("http://service.recipe/", "createInstantRecipe");
    private final static QName _CreateInstantRecipeResponse_QNAME = new QName("http://service.recipe/", "createInstantRecipeResponse");
    private final static QName _FindIngredient_QNAME = new QName("http://service.recipe/", "findIngredient");
    private final static QName _SaveRecipe_QNAME = new QName("http://service.recipe/", "saveRecipe");
    private final static QName _UpdateRecipeIngredients_QNAME = new QName("http://service.recipe/", "updateRecipeIngredients");
    private final static QName _SaveRecipeResponse_QNAME = new QName("http://service.recipe/", "saveRecipeResponse");
    private final static QName _FindIngredientResponse_QNAME = new QName("http://service.recipe/", "findIngredientResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: recipe.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateInstantRecipe }
     * 
     */
    public CreateInstantRecipe createCreateInstantRecipe() {
        return new CreateInstantRecipe();
    }

    /**
     * Create an instance of {@link CreateInstantRecipeResponse }
     * 
     */
    public CreateInstantRecipeResponse createCreateInstantRecipeResponse() {
        return new CreateInstantRecipeResponse();
    }

    /**
     * Create an instance of {@link FindIngredient }
     * 
     */
    public FindIngredient createFindIngredient() {
        return new FindIngredient();
    }

    /**
     * Create an instance of {@link UpdateRecipeIngredientsResponse }
     * 
     */
    public UpdateRecipeIngredientsResponse createUpdateRecipeIngredientsResponse() {
        return new UpdateRecipeIngredientsResponse();
    }

    /**
     * Create an instance of {@link FindRecipeResponse }
     * 
     */
    public FindRecipeResponse createFindRecipeResponse() {
        return new FindRecipeResponse();
    }

    /**
     * Create an instance of {@link FindRecipe }
     * 
     */
    public FindRecipe createFindRecipe() {
        return new FindRecipe();
    }

    /**
     * Create an instance of {@link FindIngredientResponse }
     * 
     */
    public FindIngredientResponse createFindIngredientResponse() {
        return new FindIngredientResponse();
    }

    /**
     * Create an instance of {@link SaveRecipe }
     * 
     */
    public SaveRecipe createSaveRecipe() {
        return new SaveRecipe();
    }

    /**
     * Create an instance of {@link UpdateRecipeIngredients }
     * 
     */
    public UpdateRecipeIngredients createUpdateRecipeIngredients() {
        return new UpdateRecipeIngredients();
    }

    /**
     * Create an instance of {@link SaveRecipeResponse }
     * 
     */
    public SaveRecipeResponse createSaveRecipeResponse() {
        return new SaveRecipeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRecipeIngredientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipe/", name = "updateRecipeIngredientsResponse")
    public JAXBElement<UpdateRecipeIngredientsResponse> createUpdateRecipeIngredientsResponse(UpdateRecipeIngredientsResponse value) {
        return new JAXBElement<UpdateRecipeIngredientsResponse>(_UpdateRecipeIngredientsResponse_QNAME, UpdateRecipeIngredientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRecipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipe/", name = "findRecipeResponse")
    public JAXBElement<FindRecipeResponse> createFindRecipeResponse(FindRecipeResponse value) {
        return new JAXBElement<FindRecipeResponse>(_FindRecipeResponse_QNAME, FindRecipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRecipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipe/", name = "findRecipe")
    public JAXBElement<FindRecipe> createFindRecipe(FindRecipe value) {
        return new JAXBElement<FindRecipe>(_FindRecipe_QNAME, FindRecipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInstantRecipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipe/", name = "createInstantRecipe")
    public JAXBElement<CreateInstantRecipe> createCreateInstantRecipe(CreateInstantRecipe value) {
        return new JAXBElement<CreateInstantRecipe>(_CreateInstantRecipe_QNAME, CreateInstantRecipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInstantRecipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipe/", name = "createInstantRecipeResponse")
    public JAXBElement<CreateInstantRecipeResponse> createCreateInstantRecipeResponse(CreateInstantRecipeResponse value) {
        return new JAXBElement<CreateInstantRecipeResponse>(_CreateInstantRecipeResponse_QNAME, CreateInstantRecipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindIngredient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipe/", name = "findIngredient")
    public JAXBElement<FindIngredient> createFindIngredient(FindIngredient value) {
        return new JAXBElement<FindIngredient>(_FindIngredient_QNAME, FindIngredient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRecipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipe/", name = "saveRecipe")
    public JAXBElement<SaveRecipe> createSaveRecipe(SaveRecipe value) {
        return new JAXBElement<SaveRecipe>(_SaveRecipe_QNAME, SaveRecipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRecipeIngredients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipe/", name = "updateRecipeIngredients")
    public JAXBElement<UpdateRecipeIngredients> createUpdateRecipeIngredients(UpdateRecipeIngredients value) {
        return new JAXBElement<UpdateRecipeIngredients>(_UpdateRecipeIngredients_QNAME, UpdateRecipeIngredients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRecipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipe/", name = "saveRecipeResponse")
    public JAXBElement<SaveRecipeResponse> createSaveRecipeResponse(SaveRecipeResponse value) {
        return new JAXBElement<SaveRecipeResponse>(_SaveRecipeResponse_QNAME, SaveRecipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindIngredientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipe/", name = "findIngredientResponse")
    public JAXBElement<FindIngredientResponse> createFindIngredientResponse(FindIngredientResponse value) {
        return new JAXBElement<FindIngredientResponse>(_FindIngredientResponse_QNAME, FindIngredientResponse.class, null, value);
    }

}
