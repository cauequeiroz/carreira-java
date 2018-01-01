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
	<form action="fazTudo" method="GET">
		Filtro: <input type="text" name="filtro">
		<input type="hidden" name="tarefa" value="BuscaEmpresa">
		<input type="submit" value="Buscar">
		<a href="/gerenciador/fazTudo?tarefa=BuscaEmpresa">Todas as empresas</a>
	</form>
	<hr>
	
	<h2>Adicionar empresa</h2>
	<form action="fazTudo" method="POST">
		Nome: <input type="text" name="nome">
		<input type="hidden" name="tarefa" value="AdicionaEmpresa">
		<input type="submit" value="Adicionar">
	</form>
	<hr>
	
	<c:choose>
		<c:when test="${empty usuarioLogado}">
			<h2>Login</h2>
			<form action="fazTudo" method="POST">
				Email: <input type="text" name="email">
				Senha: <input type="password" name="password">
				<input type="hidden" name="tarefa" value="Login">
				<input type="submit" value="Logar">
			</form>
		</c:when>
		<c:otherwise>
			<h2>Logout</h2>
			<p>Você esta logado como ${usuarioLogado.email}.</p>
			<form action="fazTudo" method="POST">
				<input type="hidden" name="tarefa" value="Logout">
				<input type="submit" value="Deslogar">
			</form>
		</c:otherwise>
	</c:choose>	
</body>
</html>
