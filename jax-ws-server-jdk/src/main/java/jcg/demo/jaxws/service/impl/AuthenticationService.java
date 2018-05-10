package main.java.jcg.demo.jaxws.service.impl;

import java.util.Base64;
import java.util.LinkedList;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

public class AuthenticationService {
	public void authentication(WebServiceContext wsctx) {
		printoutSessionId(wsctx);
		MessageContext mctx = wsctx.getMessageContext();
		Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);

		LinkedList list = (LinkedList) http_headers.get("Authorization");
		if (list == null || list.size() == 0) {
			throw new RuntimeException("Authentication failed! This WS needs BASIC Authentication!");
		}

		String userpass = (String) list.get(0);
		userpass = userpass.substring(5);
		validateUserPwd(userpass);
	}

	private void validateUserPwd(String userpass) {
		String credentials = new String(Base64.getMimeDecoder().decode(userpass.getBytes()));

		String username = null;
		String password = null;
		int colonPos = credentials.indexOf(":");
		if (colonPos > -1) {
			username = credentials.substring(0, colonPos);
			password = credentials.substring(colonPos + 1);

			if (!(username.equals("mzheng") && password.equals("great"))) {
				throw new RuntimeException("Not Authentication for " + username + ":" + password);
			}
		} else {
			throw new RuntimeException("There was an error while decoding the Authentication!");
		}
	}

	private void printoutSessionId(WebServiceContext wsctx) {
		MessageContext mc = wsctx.getMessageContext();
		Object servletRequest = mc.get(MessageContext.SERVLET_REQUEST);
		if (servletRequest != null) {
			HttpSession session = ((javax.servlet.http.HttpServletRequest) servletRequest).getSession();
			if (session != null)
				System.out.println("sessionId =" + session.getId());
		}
	}
}
