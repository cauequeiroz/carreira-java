<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
</head>
<body>
	<!--
		Gerenciador 2.0
		-----------------------------
		
		Crie um sistema que:
		
		- cadastre empresas
		- liste empresas
		- filtre as empresas listadas
		- login
		- logout
		- log de acesso do usuario
		
		
		Tudo isso usando MVC, JSP e um unico servlet.
		
		:)
	-->
	<h1>Gerenciador 2.0</h1>
	<hr>
	
	<c:choose>
		<c:when test="${empty usuarioLogado}">
			<p>Digite seu email e senha para logar.</p>
			<form action="run" method="POST">
				Email: <input type="text" name="email">
				Password: <input type="password" name="password">
				
				<input type="hidden" name="task" value="Login">
				<input type="submit" value="Login">
			</form>
		</c:when>
		<c:otherwise>
			<p>Buscar empresas</p>
			<form action="run" method="GET">
				Filtro: <input type="text" name="filter">
				
				<input type="hidden" name="task" value="Search">
				<input type="submit" value="Buscar">
				
				<a href="/gerenciador/run?task=Search">Listar todas</a>
			</form>
			
			<hr>
			<p>Adicionar empresa</p>
			<form action="run" method="POST">
				Nome: <input type="text" name="nome">
				
				<input type="hidden" name="task" value="Add">
				<input type="submit" value="Adicionar">
			</form>
			
			<hr>
			<p>Você está logado: ${usuarioLogado.email}</p>
			<form action="run" method="POST">
				<input type="hidden" name="task" value="Logout">
				<input type="submit" value="Logout">
			</form>
		</c:otherwise>
	</c:choose>
</body>
</html>
