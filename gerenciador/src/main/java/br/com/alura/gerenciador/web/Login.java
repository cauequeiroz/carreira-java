package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;

public class Login implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Usuario user = new UsuarioDAO().buscaPorEmailESenha(email, password);
		
		if (user != null) {			
			request.getSession().setAttribute("usuarioLogado", user);	
		}
		
		return "/WEB-INF/pages/login.jsp";
	}
	
}
