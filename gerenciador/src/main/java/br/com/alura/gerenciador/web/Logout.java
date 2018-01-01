package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout implements Taskable {

	@Override
	public String run(HttpServletRequest req, HttpServletResponse resp) {
		req.getSession().removeAttribute("usuarioLogado");
		return "/WEB-INF/pages/logout.jsp";
	}

}
