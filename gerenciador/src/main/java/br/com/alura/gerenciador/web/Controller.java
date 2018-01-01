package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/executa")
public class Controller extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tarefa = request.getParameter("tarefa");
		String className = "br.com.alura.gerenciador.web." + tarefa;
		
		if (tarefa == null) {
			throw new IllegalArgumentException("Você precisa passar uma tarefa.");
		}
		
		try {
			Tarefa task = (Tarefa) Class.forName(className).newInstance();
			String page = task.executa(request, response);
			request.getRequestDispatcher(page).forward(request, response);
		} catch(Exception e) {
			throw new ServletException(e);
		}
		
	}
}
