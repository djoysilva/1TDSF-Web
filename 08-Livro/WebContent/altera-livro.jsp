<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<title>Altera Livro</title>
</head>
<body>
	<%@ include file="navbar.jsp" %>
	<div class="container">
		<h1>Atualização de Livro</h1>
		<div class="form-group">
			<div class="row">
				<div class="col-md-4">
					<form action="livroServlet" method="post">
						<input type="hidden" name="acao" value="alterar">
						<div class="form-group">
							<label for="idIsbn">ISBN</label>
							<input value="${livro.isbn}"type="text" name="isbn" id="idIsbn" class="form-control">
						</div>
						<div class="form-group">
							<label for="idTitulo">Título</label>
							<input value="${livro.titulo}" type="text" name="titulo" id="idTitulo" class="form-control">
						</div>
						<div class="form-group">
							<label for="idAutor">Autor</label>
							<input value="${livro.autor}" type="text" name="autor" id="idAutor" class="form-control">
						</div>
						<div class="form-group">
							<label for="idPagina">Número de Páginas</label>
							<input value="${livro.numeroPaginas}"type="text" name="numero" id="idPagina" class="form-control">
						</div>
						<div>
							<input type="submit" value="Salvar" class="btn btn-primary">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>