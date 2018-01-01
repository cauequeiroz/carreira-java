package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

@WebServlet(urlPatterns = "/busca")
public class BuscaEmpresa extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String filtro = req.getParameter("filtro");
		String message = "Filtro está desligado";
		Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
		
		if (filtro != null && filtro != "")
			message = "Filtro está ligado: " + filtro;
		
		req.setAttribute("filtro", message);		
		req.setAttribute("empresas", empresas);
		req.getRequestDispatcher("WEB-INF/pages/busca.jsp").forward(req, resp);
	}
	
}
