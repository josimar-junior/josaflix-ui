<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/tags/client_tags" prefix="mt" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<link href="/josaflix-ui/resources/css/bootstrap.min.css" rel="stylesheet">
		<title>Confirmação deletar</title>
	</head>
	
	<body>
		<mt:deletar id="${param.id}" />
		
	
		<div class="container">
			<br />
			<div class="alert alert-success" role="alert">
				Filme deletado com sucesso. <a href="/josaflix-ui/listarFilmes.jsp"
					class="alert-link"> Voltar para a listagem de filmes. </a>
			</div>
		</div>
	</body>
</html>