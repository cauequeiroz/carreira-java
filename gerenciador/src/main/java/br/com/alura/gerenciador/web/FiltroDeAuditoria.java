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
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = "/*")
public class FiltroDeAuditoria implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		String username = "<deslogado>";
		
		Cookie cookie = new Cookies(req.getCookies()).getUsuarioLogado();	
		
		if (cookie != null) {
			Integer TEN_MINUTES = 10 * 60;
			cookie.setMaxAge(TEN_MINUTES);
			resp.addCookie(cookie);
			
			username = cookie.getValue();
		}		
		
		System.out.println("Usuário " + username + " passando por " + req.getRequestURI());
		
		chain.doFilter(request, response);
	}
	
	@Override
	public void destroy() {

	}


	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
