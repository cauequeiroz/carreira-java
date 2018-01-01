package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = "/*")
public class FiltroDeAuditoria implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		String uri = req.getRequestURI();
		String username = this.getUserName(req);
		
		System.out.println("Usuário " + username + " passando por " + uri);
		
		chain.doFilter(request, response);
	}
	
	public String getUserName(HttpServletRequest request) {
		String defaultUsername = "<deslogado>";
		
		Cookie[] cookies =  request.getCookies();
		if (cookies == null) return defaultUsername;
		
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("usuario.logado"))
				return cookie.getValue();
		}
		
		return defaultUsername;
	}
	
	@Override
	public void destroy() {

	}


	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
