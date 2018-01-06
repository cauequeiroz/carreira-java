package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.caelum.jdbc.dao.ProdutosDAO;
import br.com.caelum.jdbc.model.Produto;

public class TestaProdutoDAO {
	public static void main(String[] args) throws SQLException {
		
		Produto product = new Produto("PS4", "Playstation 4");
		
		try(Connection con = new ConnectionPool().getConnection()) {
			
			ProdutosDAO produtosDAO = new ProdutosDAO(con);
			
			produtosDAO.salva(product);
			
			List<Produto> produtos = produtosDAO.lista();
			produtos.stream().forEach(System.out::println);
		}
		
	}
}
