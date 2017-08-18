<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/tags/client_tags" prefix ="mt" %>

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
		<div class="container">
			<h2>Listagem de Filmes</h2>
			
			<br />
		
			<table class="table table-striped">
				<thead>
					<tr>
						<th class="text-center">#ID</th>
						<th>Título</th>
						<th class="text-center">Genero</th>
						<th class="text-center">Ano</th>
						<th class="text-center">Editar</th>
						<th class="text-center">Deletar</th>
					</tr>
				</thead>
				
				<tbody>
					<mt:listar />
					
					<c:forEach var="filme" items="${filmes}">
						<tr>
							<td class="text-center">${filme.id}</td>
							<td>${filme.titulo}</td>
							<td class="text-center">${filme.genero}</td>
							<td class="text-center">${filme.ano}</td>
							<td class="text-center">
								<c:url value="/cadastrarFilme.jsp" var="link">
									<c:param name="id" value="${filme.id}"/>
								</c:url>
								<a href="${link}"><i class="glyphicon glyphicon-edit"></i></a>
							</td>
							
							<td class="text-center">
								<c:url value="/confirmacaoDeletar.jsp" var="link">
									<c:param name="id" value="${filme.id}"/>
								</c:url>
								<a href="${link}"><i class="glyphicon glyphicon-trash"></i></a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<a class="btn btn-default" href="/josaflix-ui/cadastrarFilme.jsp" role="button">Novo filme</a>
		</div>
	</body> 
</html>