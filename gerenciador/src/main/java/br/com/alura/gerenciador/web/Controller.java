package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/run")
public class Controller extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String taskName = req.getParameter("task");
		String className = "br.com.alura.gerenciador.web." + taskName;

		if (taskName == null) {
			throw new IllegalArgumentException("You must pass a task to /run URI.");
		}

		try {
			Taskable classInstance = (Taskable) Class.forName(className).newInstance();
			String path = classInstance.run(req, resp);
			req.getRequestDispatcher(path).forward(req, resp);
		} catch (Exception error) {
			throw new ServletException(error);
		}
	}

}
