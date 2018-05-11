
package jcg.demo.jaxws.client.book;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BookServiceImplService", targetNamespace = "http://impl.service.jaxws.demo.jcg.java.main/", wsdlLocation = "http://localhost:9980/bookServer?wsdl")
public class BookServiceImplService
    extends Service
{

    private final static URL BOOKSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(jcg.demo.jaxws.client.book.BookServiceImplService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = jcg.demo.jaxws.client.book.BookServiceImplService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:9980/bookServer?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:9980/bookServer?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        BOOKSERVICEIMPLSERVICE_WSDL_LOCATION = url;
    }

    public BookServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookServiceImplService() {
        super(BOOKSERVICEIMPLSERVICE_WSDL_LOCATION, new QName("http://impl.service.jaxws.demo.jcg.java.main/", "BookServiceImplService"));
    }

    /**
     * 
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServiceImplPort")
    public BookService getBookServiceImplPort() {
        return super.getPort(new QName("http://impl.service.jaxws.demo.jcg.java.main/", "BookServiceImplPort"), BookService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServiceImplPort")
    public BookService getBookServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.jaxws.demo.jcg.java.main/", "BookServiceImplPort"), BookService.class, features);
    }

}
