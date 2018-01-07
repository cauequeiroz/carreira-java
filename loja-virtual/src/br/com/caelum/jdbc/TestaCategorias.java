package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.caelum.jdbc.dao.CategoriaDAO;
import br.com.caelum.jdbc.model.Categoria;
import br.com.caelum.jdbc.model.Produto;

public class TestaCategorias {
	public static void main(String[] args) throws SQLException {
		
		try(Connection con = new ConnectionPool().getConnection()) {
			List<Categoria> categorias = new CategoriaDAO(con).listaComProduto();
			
			for (Categoria categoria : categorias) {
				System.out.println("\n" + categoria);
				
				for (Produto produto : categoria.getProdutos()) {
					System.out.println(produto);
				}
			}			
		}
		
	}
}
