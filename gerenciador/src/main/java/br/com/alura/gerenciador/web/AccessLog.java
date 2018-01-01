package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import br.com.alura.gerenciador.Usuario;

@WebFilter(urlPatterns = "/*")
public class AccessLog implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) req;
		Usuario user = (Usuario) request.getSession().getAttribute("usuarioLogado");
		
		String username = "<deslogado>";
		if (user != null) {
			username = user.getEmail();
		}
		
		System.out.println("[DEV] > Usuário " + username + " acessando a URI: " + request.getRequestURI());
		chain.doFilter(req, resp);
	}

	@Override
	public void destroy() {

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
