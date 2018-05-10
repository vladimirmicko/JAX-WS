package main.java.jcg.demo.jaxws.service.impl;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import main.java.jcg.demo.jaxws.service.MathService;


@WebService(endpointInterface = "main.java.jcg.demo.jaxws.service.MathService")
public class MathServiceImpl implements MathService {
	@Resource
	private WebServiceContext wsctx;

	@Override
	public int sum(int a, int b) {
		AuthenticationService authService = new AuthenticationService();
		authService.authentication(wsctx);
		return a + b;
	}

	@Override
	public boolean isPrimeNumber(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
