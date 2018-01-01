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
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Usuario user = new UsuarioDAO().buscaPorEmailESenha(email, password);
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html><body>");
		writer.println("<h1>Login</h1>");
		
		if (user == null) {
			writer.println("<p>Acesso negado.</p>");
		} else {
			writer.println("<p>Bem vindo " + user.getEmail() + ".</p>");
			req.getSession().setAttribute("usuarioLogado", user);			
		}
	
		writer.println("<a href='/gerenciador/'>Voltar</a>");
		writer.println("</body></html>");		
		
	}
	
}
