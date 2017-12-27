package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String usuario = req.getParameter("usuario");
		String password = req.getParameter("password");

		Usuario user = new UsuarioDAO().buscaPorEmailESenha(usuario, password);

		PrintWriter writer = resp.getWriter();

		if (user == null) {
			writer.println("<html><body>Usuário ou senha inválidos.</body></html>");
		} else {
			Cookie cookie = new Cookie("usuario.logado", usuario);
			resp.addCookie(cookie);
			
			writer.println("<html><body>Bem vindo " + user.getEmail() + ".</body></html>");
		}

	}

}
