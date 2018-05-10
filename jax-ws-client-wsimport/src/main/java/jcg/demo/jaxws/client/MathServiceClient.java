package jcg.demo.jaxws.client;

import java.util.Map;

import javax.xml.ws.BindingProvider;

import jcg.demo.jaxws.client.math.MathService;
import jcg.demo.jaxws.client.math.MathServiceImplService;

public class MathServiceClient {

	public static void main(String[] args) {
		MathServiceImplService service = new MathServiceImplService();
		MathService pService = service.getMathServiceImplPort();

		Map<String, Object> requestCtx = ((BindingProvider) pService).getRequestContext();
		requestCtx.put(BindingProvider.USERNAME_PROPERTY, "mzheng");
		requestCtx.put(BindingProvider.PASSWORD_PROPERTY, "great");

		requestCtx.put(BindingProvider.SOAPACTION_USE_PROPERTY, Boolean.TRUE);
		requestCtx.put(BindingProvider.SESSION_MAINTAIN_PROPERTY, Boolean.TRUE);
		for (int i = 100000; i < 100100; i++) {
			if (pService.isPrimeNumber(i)){
				System.out.println(i + " is prime number. ");
			}
		}
		System.exit(0);
	}
}
