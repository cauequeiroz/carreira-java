package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.model.Produto;

public class ProdutosDAO {
	Connection con;

	public ProdutosDAO(Connection con) {
		this.con = con;
	}

	public void salva(Produto product) throws SQLException {
		String sql = "insert into Produto (nome, descricao) values (?, ?)";

		try (PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			stmt.setString(1, product.getNome());
			stmt.setString(2, product.getDescricao());
			stmt.execute();

			try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
				if (generatedKeys.next())
					product.setId(generatedKeys.getInt("id"));
			}
		}
	}
	
	public List<Produto> lista() throws SQLException {
		List<Produto> produtos = new ArrayList<>();
		String sql = "select * from Produto";
		
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			
			try(ResultSet result = stmt.getResultSet()) {
				while(result.next()) {
					produtos.add(new Produto(result.getInt("id"), result.getString("nome"), result.getString("descricao")));
				}
			}
		}
		
		return produtos;
	}
}
