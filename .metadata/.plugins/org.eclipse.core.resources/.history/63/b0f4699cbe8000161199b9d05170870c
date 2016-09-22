<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Livro</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container">
	<h1>Cadastro de Livro</h1>
	<%-- <%=request.getAttribute("chave") %> --%>
	${chave }
	<div class="row">
		<div class="col-md-4">
			<form action="livroServlet" method="post">
				<input type="hidden" name="acao" value="cadastrar">
				<div class="form-group">
					<label for="idIsbn">ISBN</label>
					<input type="text" name="isbn" id="idIsbn" class="form-control">
				</div>
				<div class="form-group">
					<label for="idTitulo">Título</label>
					<input type="text" name="titulo" id="idTitulo" class="form-control">
				</div>
				<div class="form-group">
					<label for="idAutor">Autor</label>
					<input type="text" name="autor" id="idAutor" class="form-control">
				</div>
				<div class="form-group">
					<label for="idPagina">Número de Páginas</label>
					<input type="text" name="numero" id="idPagina" class="form-control">
				</div>
				<div>
					<input type="submit" value="Salvar" class="btn btn-primary">
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>