package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
	public static void main(String[] args) throws SQLException {

		try (Connection connection = Database.getConnection()) {
			connection.setAutoCommit(false);
			String sql = "insert into Produto (nome, descricao) values (?, ?)";

			try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
				adiciona("Nintendo Switch", "Teste de SQL Injection'); delete from Produto", stmt);
				adiciona("Caue", "Queiroz", stmt);
				connection.commit();
			} catch(Exception error) {
				error.printStackTrace();
				connection.rollback();
				System.out.println("Rolback efetuado");
			}
		}

	}

	private static void adiciona(String nome, String descricao, PreparedStatement stmt) throws SQLException {

		if (nome.equals("Caue")) {
			throw new IllegalArgumentException("Erro proposital.");
		}

		stmt.setString(1, nome);
		stmt.setString(2, descricao);
		stmt.execute();

		try(ResultSet generatedKeys = stmt.getGeneratedKeys()) {
			while (generatedKeys.next()) {
				System.out.println(generatedKeys.getInt("id") + " gerado!");
			}			
		}
	}
}
