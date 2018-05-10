package main.java.jcg.demo.jaxws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * A Simple MathService using the SOAP RPC style which means the message data
 * type must be Primitive types (boolean , byte , char , short , int , long ,
 * float and double)
 * 
 * @author Mary Zheng
 *
 */

@WebService
@SOAPBinding(style = Style.RPC)
public interface MathService {
	@WebMethod
	int sum(@WebParam(name = "int_a") int a, @WebParam(name = "int_b") int b);

	@WebMethod
	boolean isPrimeNumber(@WebParam(name = "number") int number);

}
