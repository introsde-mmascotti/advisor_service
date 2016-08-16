
package healthprofile.storage.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the healthprofile.storage.service package. 
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

    private final static QName _GetHealthProfileResponse_QNAME = new QName("http://service.storage.healthprofile/", "getHealthProfileResponse");
    private final static QName _UpdateMeasureResponse_QNAME = new QName("http://service.storage.healthprofile/", "updateMeasureResponse");
    private final static QName _Person_QNAME = new QName("http://service.storage.healthprofile/", "person");
    private final static QName _UpdateMeasure_QNAME = new QName("http://service.storage.healthprofile/", "updateMeasure");
    private final static QName _GetMeasure_QNAME = new QName("http://service.storage.healthprofile/", "getMeasure");
    private final static QName _Measure_QNAME = new QName("http://service.storage.healthprofile/", "measure");
    private final static QName _GetMeasureHistory_QNAME = new QName("http://service.storage.healthprofile/", "getMeasureHistory");
    private final static QName _GetPersonById_QNAME = new QName("http://service.storage.healthprofile/", "getPersonById");
    private final static QName _GetMeasureHistoryResponse_QNAME = new QName("http://service.storage.healthprofile/", "getMeasureHistoryResponse");
    private final static QName _GetPersonByIdResponse_QNAME = new QName("http://service.storage.healthprofile/", "getPersonByIdResponse");
    private final static QName _AddMeasureToHealthprofile_QNAME = new QName("http://service.storage.healthprofile/", "addMeasureToHealthprofile");
    private final static QName _CreatePerson_QNAME = new QName("http://service.storage.healthprofile/", "createPerson");
    private final static QName _GetMeasureResponse_QNAME = new QName("http://service.storage.healthprofile/", "getMeasureResponse");
    private final static QName _AddMeasureToHealthprofileResponse_QNAME = new QName("http://service.storage.healthprofile/", "addMeasureToHealthprofileResponse");
    private final static QName _GetHealthProfile_QNAME = new QName("http://service.storage.healthprofile/", "getHealthProfile");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://service.storage.healthprofile/", "createPersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: healthprofile.storage.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHealthProfile }
     * 
     */
    public GetHealthProfile createGetHealthProfile() {
        return new GetHealthProfile();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link AddMeasureToHealthprofileResponse }
     * 
     */
    public AddMeasureToHealthprofileResponse createAddMeasureToHealthprofileResponse() {
        return new AddMeasureToHealthprofileResponse();
    }

    /**
     * Create an instance of {@link GetMeasureResponse }
     * 
     */
    public GetMeasureResponse createGetMeasureResponse() {
        return new GetMeasureResponse();
    }

    /**
     * Create an instance of {@link AddMeasureToHealthprofile }
     * 
     */
    public AddMeasureToHealthprofile createAddMeasureToHealthprofile() {
        return new AddMeasureToHealthprofile();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link GetMeasureHistoryResponse }
     * 
     */
    public GetMeasureHistoryResponse createGetMeasureHistoryResponse() {
        return new GetMeasureHistoryResponse();
    }

    /**
     * Create an instance of {@link GetPersonByIdResponse }
     * 
     */
    public GetPersonByIdResponse createGetPersonByIdResponse() {
        return new GetPersonByIdResponse();
    }

    /**
     * Create an instance of {@link GetMeasureHistory }
     * 
     */
    public GetMeasureHistory createGetMeasureHistory() {
        return new GetMeasureHistory();
    }

    /**
     * Create an instance of {@link GetPersonById }
     * 
     */
    public GetPersonById createGetPersonById() {
        return new GetPersonById();
    }

    /**
     * Create an instance of {@link GetMeasure }
     * 
     */
    public GetMeasure createGetMeasure() {
        return new GetMeasure();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link UpdateMeasure }
     * 
     */
    public UpdateMeasure createUpdateMeasure() {
        return new UpdateMeasure();
    }

    /**
     * Create an instance of {@link UpdateMeasureResponse }
     * 
     */
    public UpdateMeasureResponse createUpdateMeasureResponse() {
        return new UpdateMeasureResponse();
    }

    /**
     * Create an instance of {@link GetHealthProfileResponse }
     * 
     */
    public GetHealthProfileResponse createGetHealthProfileResponse() {
        return new GetHealthProfileResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHealthProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "getHealthProfileResponse")
    public JAXBElement<GetHealthProfileResponse> createGetHealthProfileResponse(GetHealthProfileResponse value) {
        return new JAXBElement<GetHealthProfileResponse>(_GetHealthProfileResponse_QNAME, GetHealthProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "updateMeasureResponse")
    public JAXBElement<UpdateMeasureResponse> createUpdateMeasureResponse(UpdateMeasureResponse value) {
        return new JAXBElement<UpdateMeasureResponse>(_UpdateMeasureResponse_QNAME, UpdateMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "updateMeasure")
    public JAXBElement<UpdateMeasure> createUpdateMeasure(UpdateMeasure value) {
        return new JAXBElement<UpdateMeasure>(_UpdateMeasure_QNAME, UpdateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "getMeasure")
    public JAXBElement<GetMeasure> createGetMeasure(GetMeasure value) {
        return new JAXBElement<GetMeasure>(_GetMeasure_QNAME, GetMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Measure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "measure")
    public JAXBElement<Measure> createMeasure(Measure value) {
        return new JAXBElement<Measure>(_Measure_QNAME, Measure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "getMeasureHistory")
    public JAXBElement<GetMeasureHistory> createGetMeasureHistory(GetMeasureHistory value) {
        return new JAXBElement<GetMeasureHistory>(_GetMeasureHistory_QNAME, GetMeasureHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "getPersonById")
    public JAXBElement<GetPersonById> createGetPersonById(GetPersonById value) {
        return new JAXBElement<GetPersonById>(_GetPersonById_QNAME, GetPersonById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "getMeasureHistoryResponse")
    public JAXBElement<GetMeasureHistoryResponse> createGetMeasureHistoryResponse(GetMeasureHistoryResponse value) {
        return new JAXBElement<GetMeasureHistoryResponse>(_GetMeasureHistoryResponse_QNAME, GetMeasureHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "getPersonByIdResponse")
    public JAXBElement<GetPersonByIdResponse> createGetPersonByIdResponse(GetPersonByIdResponse value) {
        return new JAXBElement<GetPersonByIdResponse>(_GetPersonByIdResponse_QNAME, GetPersonByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMeasureToHealthprofile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "addMeasureToHealthprofile")
    public JAXBElement<AddMeasureToHealthprofile> createAddMeasureToHealthprofile(AddMeasureToHealthprofile value) {
        return new JAXBElement<AddMeasureToHealthprofile>(_AddMeasureToHealthprofile_QNAME, AddMeasureToHealthprofile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "getMeasureResponse")
    public JAXBElement<GetMeasureResponse> createGetMeasureResponse(GetMeasureResponse value) {
        return new JAXBElement<GetMeasureResponse>(_GetMeasureResponse_QNAME, GetMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMeasureToHealthprofileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "addMeasureToHealthprofileResponse")
    public JAXBElement<AddMeasureToHealthprofileResponse> createAddMeasureToHealthprofileResponse(AddMeasureToHealthprofileResponse value) {
        return new JAXBElement<AddMeasureToHealthprofileResponse>(_AddMeasureToHealthprofileResponse_QNAME, AddMeasureToHealthprofileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHealthProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "getHealthProfile")
    public JAXBElement<GetHealthProfile> createGetHealthProfile(GetHealthProfile value) {
        return new JAXBElement<GetHealthProfile>(_GetHealthProfile_QNAME, GetHealthProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.storage.healthprofile/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

}
