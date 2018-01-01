package br.com.alura.gerenciador.web;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

public class Search implements Taskable {

	@Override
	public String run(HttpServletRequest req, HttpServletResponse resp) {
		
		String filter = req.getParameter("filter");
		String filterMessage = "Filtro está desligado.";
		
		Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filter);
		
		if (filter != null && filter != "") {
			filterMessage = "FIltro está ligado. Buscando por [" + filter + "]";
		}
		
		req.setAttribute("empresas", empresas);
		req.setAttribute("filterMessage", filterMessage);
		return "/WEB-INF/pages/search.jsp";
		
	}

}
