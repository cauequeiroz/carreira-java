package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
	public static void main(String[] args) throws SQLException {

		Connection connection = Database.getConnection();
		Statement statement = connection.createStatement();
		
		statement.execute("select * from Produto");
		
		ResultSet result = statement.getResultSet();
		while(result.next()) {
			System.out.print(result.getString("id") + " - ");
			System.out.print(result.getString("nome") + " - ");
			System.out.print(result.getString("descricao") + "\n");
		}
		
		result.close();
		statement.close();
		connection.close();
	}
}
