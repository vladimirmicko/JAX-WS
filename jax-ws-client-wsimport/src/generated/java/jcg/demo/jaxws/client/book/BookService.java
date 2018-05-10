
package jcg.demo.jaxws.client.book;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BookService", targetNamespace = "http://service.jaxws.demo.jcg/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookService {


    /**
     * 
     * @param bookId
     * @return
     *     returns jcg.demo.jaxws.client.book.Book
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBook", targetNamespace = "http://service.jaxws.demo.jcg/", className = "jcg.demo.jaxws.client.book.GetBook")
    @ResponseWrapper(localName = "getBookResponse", targetNamespace = "http://service.jaxws.demo.jcg/", className = "jcg.demo.jaxws.client.book.GetBookResponse")
    public Book getBook(
        @WebParam(name = "bookId", targetNamespace = "")
        Integer bookId);

}