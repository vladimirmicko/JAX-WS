package main.java.jcg.demo.jaxws;

import javax.xml.ws.Endpoint;
import main.java.jcg.demo.jaxws.service.impl.MathServiceImpl;



public class MathApp {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9991/mathServer", new MathServiceImpl());
	}
}
