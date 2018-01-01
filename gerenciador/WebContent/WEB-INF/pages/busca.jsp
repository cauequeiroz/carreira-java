<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Gerenciador</title>
</head>
<body>
	<h1>Busca por empresas</h1>
	
	<p>${filtro}</p>
	
	<ul>
		<c:forEach var="empresa" items="${empresas}">
		<li>[${empresa.id}] ${empresa.nome}</li>
		</c:forEach>
	</ul>
	<a href='/gerenciador/'>Voltar</a>
</body>
</html>