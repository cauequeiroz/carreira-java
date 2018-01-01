package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;

public class Login implements Taskable {

	@Override
	public String run(HttpServletRequest req, HttpServletResponse resp) {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Usuario user = new UsuarioDAO().buscaPorEmailESenha(email, password);
		
		if (user != null) {
			req.getSession().setAttribute("usuarioLogado", user);
		}
		
		return "/WEB-INF/pages/login.jsp";
	}

}
