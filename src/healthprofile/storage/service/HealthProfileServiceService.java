
package healthprofile.storage.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HealthProfileServiceService", targetNamespace = "http://service.storage.healthprofile/", wsdlLocation = "https://isdemm-hpstorage-service.herokuapp.com?wsdl")
public class HealthProfileServiceService
    extends Service
{

    private final static URL HEALTHPROFILESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException HEALTHPROFILESERVICESERVICE_EXCEPTION;
    private final static QName HEALTHPROFILESERVICESERVICE_QNAME = new QName("http://service.storage.healthprofile/", "HealthProfileServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://isdemm-hpstorage-service.herokuapp.com?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HEALTHPROFILESERVICESERVICE_WSDL_LOCATION = url;
        HEALTHPROFILESERVICESERVICE_EXCEPTION = e;
    }

    public HealthProfileServiceService() {
        super(__getWsdlLocation(), HEALTHPROFILESERVICESERVICE_QNAME);
    }

    public HealthProfileServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HEALTHPROFILESERVICESERVICE_QNAME, features);
    }

    public HealthProfileServiceService(URL wsdlLocation) {
        super(wsdlLocation, HEALTHPROFILESERVICESERVICE_QNAME);
    }

    public HealthProfileServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HEALTHPROFILESERVICESERVICE_QNAME, features);
    }

    public HealthProfileServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HealthProfileServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HealthProfileService
     */
    @WebEndpoint(name = "HealthProfileServicePort")
    public HealthProfileService getHealthProfileServicePort() {
        return super.getPort(new QName("http://service.storage.healthprofile/", "HealthProfileServicePort"), HealthProfileService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HealthProfileService
     */
    @WebEndpoint(name = "HealthProfileServicePort")
    public HealthProfileService getHealthProfileServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.storage.healthprofile/", "HealthProfileServicePort"), HealthProfileService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HEALTHPROFILESERVICESERVICE_EXCEPTION!= null) {
            throw HEALTHPROFILESERVICESERVICE_EXCEPTION;
        }
        return HEALTHPROFILESERVICESERVICE_WSDL_LOCATION;
    }

}
