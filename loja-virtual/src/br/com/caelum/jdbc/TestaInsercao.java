package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
	public static void main(String[] args) throws SQLException {
		
		Connection connection = Database.getConnection();
		Statement stmt = connection.createStatement();
		
		stmt.execute(
			"insert into Produto (nome, descricao) values ('Notebook', 'Notebook i5 8gb 128ssd')",
			Statement.RETURN_GENERATED_KEYS
		);	
		
		ResultSet generatedKeys = stmt.getGeneratedKeys();
		while(generatedKeys.next()) {
			System.out.println(generatedKeys.getInt("id") + " gerado!");
		}
		
		generatedKeys.close();
		stmt.close();
		connection.close();
		
	}
}
