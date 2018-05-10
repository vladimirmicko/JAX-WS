package main.java.jcg.demo.jaxws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import main.java.jcg.demo.jaxws.model.Book;



/**
 * A Simple BookService using the SOAP Document style which means the message
 * data can be any user defined POJO data type
 * 
 * @author Mary Zheng
 *
 */

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface BookService {
	@WebMethod
	Book getBook(@WebParam(name = "bookId") Integer id);
}
