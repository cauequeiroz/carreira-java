package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		System.out.println("[DEV] Conexão aberta.\n");

		Statement statement = connection.createStatement();
		boolean result = statement.execute("SELECT * FROM Produto");
		ResultSet resultSet = statement.getResultSet();

		while (resultSet.next()) {
			System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("nome") + ": "
					+ resultSet.getString("descricao"));
		}
		
		statement.close();
		resultSet.close();
		connection.close();
		System.out.println("\n[DEV] Conexão fechada.");
	}
}
