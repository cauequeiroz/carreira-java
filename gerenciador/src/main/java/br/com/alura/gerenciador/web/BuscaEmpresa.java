package br.com.alura.gerenciador.web;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

public class BuscaEmpresa implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		String filtro = request.getParameter("filtro");
		String message = "Filtro está desligado";
		Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
		
		if (filtro != null && filtro != "")
			message = "Filtro está ligado: " + filtro;
		
		request.setAttribute("filtro", message);		
		request.setAttribute("empresas", empresas);
		
		return "WEB-INF/pages/busca.jsp";
	}
	
}
