package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {
	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionPool().getConnection();
		Statement stmt = connection.createStatement();
		
		stmt.execute("delete from Produto where id > 3");
		System.out.println(stmt.getUpdateCount() + " linhas removidas!");
		
		stmt.close();		
		connection.close();
		
	}
}
