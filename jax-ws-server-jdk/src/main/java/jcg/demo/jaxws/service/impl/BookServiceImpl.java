package main.java.jcg.demo.jaxws.service.impl;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import main.java.jcg.demo.jaxws.model.Book;
import main.java.jcg.demo.jaxws.model.BookUtil;
import main.java.jcg.demo.jaxws.service.BookService;



@WebService(endpointInterface = "main.java.jcg.demo.jaxws.service.BookService")
public class BookServiceImpl implements BookService {

	@Resource
	private WebServiceContext wsctx;

	@Override
	public Book getBook(Integer id) {

		AuthenticationService authService = new AuthenticationService();
		authService.authentication(wsctx);

		return BookUtil.getBook(id);
	}
}