package main.java.jcg.demo.jaxws;

import javax.xml.ws.Endpoint;
import main.java.jcg.demo.jaxws.service.impl.BookServiceImpl;


public class BookApp {

	public static void main(String[] args) {
		Endpoint ep = Endpoint.create(new BookServiceImpl());
		ep.publish("http://localhost:9981/bookServer");
	}
}
