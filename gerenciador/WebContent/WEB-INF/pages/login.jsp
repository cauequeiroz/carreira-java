<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
</head>
<body>
	<h1>Login</h1>
	
	<c:choose>
		<c:when test="${empty usuarioLogado}">
			<p>Acesso negado.</p>
		</c:when>
		<c:otherwise>
			<p>Bem vindo ao sistema! - ${usuarioLogado.email}</p>
		</c:otherwise>
	</c:choose>
	
	<a href="/gerenciador/">Voltar</a>
</body>
</html>