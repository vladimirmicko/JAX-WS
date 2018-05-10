package jcg.demo.jaxws.client;

import java.util.Map;

import javax.xml.ws.BindingProvider;

import jcg.demo.jaxws.client.book.BookService;
import jcg.demo.jaxws.client.book.BookServiceImplService;

public class BookServiceClient {

	public static void main(String[] args) {
		BookServiceImplService service = new BookServiceImplService();
		BookService pService = service.getBookServiceImplPort();

		Map<String, Object> requestCtx = ((BindingProvider) pService).getRequestContext();
		requestCtx.put(BindingProvider.USERNAME_PROPERTY, "mzheng");
		requestCtx.put(BindingProvider.PASSWORD_PROPERTY, "great");

		String productionUrl = "http://localhost:9980/bookServer?wsdl";
		requestCtx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, productionUrl);

		for (int i = 1; i < 6; i++) {
			System.out.println(pService.getBook(i).getName());
		}
	}
}
