package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Taskable {
	String run(HttpServletRequest req, HttpServletResponse resp);
}
