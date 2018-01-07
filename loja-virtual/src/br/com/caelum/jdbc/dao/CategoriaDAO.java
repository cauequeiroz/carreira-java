package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.model.Categoria;
import br.com.caelum.jdbc.model.Produto;

public class CategoriaDAO {
	Connection con;
	
	public CategoriaDAO(Connection con) {
		this.con = con;
	}

	public List<Categoria> lista() throws SQLException {
		List<Categoria> categorias = new ArrayList<>();
		String sql = "select * from Categoria";
		
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			
			try(ResultSet result = stmt.getResultSet()) {
				while(result.next()) {
					Categoria categoria = new Categoria(result.getInt("id"), result.getString("nome"));
					categorias.add(categoria);
				}
			}
		}
		
		return categorias;
	}

	public List<Categoria> listaComProduto() throws SQLException {
		List<Categoria> categorias = new ArrayList<>();
		Categoria ultima = null;
		String sql = "select c.id as c_id, c.nome as c_nome, p.id as p_id, p.nome as p_nome, p.descricao as p_descricao from Categoria as c join Produto as p on p.categoria_id = c.id";
		
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			
			try(ResultSet result = stmt.getResultSet()) {
				while(result.next()) {
					Integer categoriaId = result.getInt("c_id");
					String categoriaNome = result.getString("c_nome");
					
					if ( ultima == null || !ultima.getNome().equals(categoriaNome) ) {
						Categoria categoria = new Categoria(categoriaId, categoriaNome);
						categorias.add(categoria);
						ultima = categoria;
					}
					
					Integer produtoId = result.getInt("p_id");
					String produtoNome = result.getString("p_nome");
					String produtoDescricao = result.getString("p_descricao");
					
					Produto p = new Produto(produtoId, produtoNome, produtoDescricao);
					ultima.adicionaProduto(p);
				}
			}
		}
		
		return categorias;
	}

}
