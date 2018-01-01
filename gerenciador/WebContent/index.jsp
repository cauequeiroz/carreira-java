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
	
	<h2>Login</h2>
	<p>Digite seu email e senha para logar.</p>
	<form action="run" method="POST">
		Email: <input type="text" name="email">
		Password: <input type="password" name="password">
		
		<input type="hidden" name="task" value="Login">
		<input type="submit" value="Login">
	</form>
	
	<p>Você está logado: ${usuarioLogado.email}</p>
	<form action="run" method="POST">
		<input type="hidden" name="task" value="Logout">
		<input type="submit" value="Logout">
	</form>
	
</body>
</html>
