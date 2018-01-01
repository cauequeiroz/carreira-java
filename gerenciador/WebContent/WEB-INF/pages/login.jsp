<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Gerenciador</title>
</head>
<body>
	<h1>Login</h1>
	
	<c:choose>
		<c:when test="${not empty usuarioLogado}">
			<p>Bem vindo ${usuarioLogado.email}.</p>
		</c:when>
		<c:otherwise>
			<p>Acesso negado.</p>
		</c:otherwise>
	</c:choose>
	<a href='/gerenciador/'>Voltar</a>
</body>
</html>