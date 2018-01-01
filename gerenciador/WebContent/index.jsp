<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Gerenciador</title>
</head>
<body>
	<p>Bem vindo ao nosso gerenciador!</p>
	
	<h2>Buscar empresa</h2>
	<form action="busca" method="GET">
		Filtro: <input type="text" name="filtro">
		<input type="submit" value="Buscar">
		<a href="/gerenciador/busca">Todas as empresas</a>
	</form>
	<hr>
	
	<h2>Adicionar empresa</h2>
	<form action="adiciona" method="POST">
		Nome: <input type="text" name="nome">
		<input type="submit" value="Adicionar">
	</form>
	<hr>
	
	<h2>Login</h2>
	<form action="login" method="POST">
		Email: <input type="text" name="email">
		Senha: <input type="password" name="password">
		<input type="submit" value="Logar">
	</form>
	<hr>
	
	<c:if test="${not empty usuarioLogado}">
	<h2>Logout</h2>
	<p>Você esta logado como ${usuarioLogado.email}.</p>
	<form action="logout" method="POST">
		<input type="submit" value="Deslogar">
	</form>
	<hr>
	</c:if>
</body>
</html>
