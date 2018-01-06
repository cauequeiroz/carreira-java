package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
	public static void main(String[] args) throws SQLException {
		
		String nome = "Nintendo Switch 5.5');";
		String descricao = "Console portatil da Nintendo.";
		String sql = "insert into Produto (nome, descricao) values (?, ?)";
		
		Connection connection = Database.getConnection();
		PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
		stmt.setString(1, nome);
		stmt.setString(2, descricao);
		stmt.execute();
		
		ResultSet generatedKeys = stmt.getGeneratedKeys();
		while(generatedKeys.next()) {
			System.out.println(generatedKeys.getInt("id") + " gerado!");
		}
		
		generatedKeys.close();
		stmt.close();
		connection.close();
		
	}
}
