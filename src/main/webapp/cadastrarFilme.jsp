<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/tags/client_tags" prefix="mt"%>

<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<link href="/josaflix-ui/resources/css/bootstrap.min.css" rel="stylesheet">
		<link href="/josaflix-ui/resources/css/sistema.css" rel="stylesheet">
		
		<title>Filmes</title>
	</head>

	<body>
		<c:if test="${not empty param.id}">
			<mt:buscarPorId id="${param.id}" />
		</c:if>
		<div class="container">
			<c:choose>
				<c:when test="${empty param.id}">
					<h2>Novo Filme</h2>
				</c:when>
				<c:otherwise>
					<h2>Editar Filme</h2>
				</c:otherwise>
			</c:choose>
	
	
			<form action="/josaflix-ui/confirmacaoSalvar.jsp" method="post">
				<input type="hidden" value="${param.id}" name="id" />
	
				<div class="form-group">
					<label for="titulo">Título</label> <input type="text"
						class="form-control" id="titulo" name="titulo" required="required"
						value="${filme.titulo}">
				</div>
	
				<div class="form-group">
					<label for="genero">Genero</label> <input type="text"
						class="form-control" id="genero" name="genero" required="required"
						value="${filme.genero}">
				</div>
	
				<div class="form-group">
					<label for="ano">Ano</label> <input type="text" class="form-control"
						id="ano" name="ano" required="required" value="${filme.ano}">
				</div>
	
				<c:choose>
					<c:when test="${empty param.id}">
						<button type="submit" class="btn btn-primary">Salvar</button>
					</c:when>
					<c:otherwise>
						<button type="submit" class="btn btn-primary">Atualizar</button>
					</c:otherwise>
				</c:choose>
	
				<a class="btn btn-default" href="/josaflix-ui/listarFilmes.jsp"
					role="button">Listar filmes</a>
			</form>
		</div>
	</body>
</html>