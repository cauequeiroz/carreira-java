package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/logout")
public class Logout extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getSession().removeAttribute("usuario.logado");

		PrintWriter writer = resp.getWriter();
		writer.println("<html><body>");
		writer.println("<h1>Logout</h1>");
		writer.println("<p>Usuario deslogado com sucesso!</p>");
		writer.println("<a href='/gerenciador/'>Voltar</a>");
		writer.println("</body></html>");

	}

}
