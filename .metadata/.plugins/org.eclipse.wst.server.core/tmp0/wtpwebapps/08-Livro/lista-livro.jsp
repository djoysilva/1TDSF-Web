<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Taglib para utilizar a biblioteca de tags do JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biblioteca</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container">
	<h1>Lista de Livros</h1>
	<table class="table">
		<tr>
			<th>T�tulo</th>
			<th>Autor</th>
			<th>N�mero de P�ginas</th>
			<th>ISBN</th>
			<th></th>
		</tr>
		<!-- Utiliza a tag de foreach para percorrer a lista
		recuperada da servlet -->
		<c:forEach var="risos" items="${chaveDaLista }">
			<tr>
				<td>${risos.titulo }</td>
				<td>${risos.autor }</td>
				<td>${risos.numeroPagina }</td>
				<td>${risos.isbn }</td>
				<td>
					<button onclick="idIsbn.value = ${risos.isbn}" type="button" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#myModal">
					  	Remover
					</button>
				</td>
			</tr>
		</c:forEach>
	</table>
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">Confirma��o</h4>
	      </div>
	      <div class="modal-body">
	        Voc� realmente deseja excluir o livro?
	      </div>
	      <div class="modal-footer">
	      	<form action="livroServlet" method="post">
	      		<input type="hidden" name="isbn" id="idIsbn">
	      		<input type="hidden" name="acao" value="excluir">
		        <button type="button" class="btn btn-default" data-dismiss="modal">N�o</button>
		        <button type="submit" class="btn btn-danger">Sim</button>
	        </form>
	      </div>
	    </div>
	  </div>
</div>
</div>	
</body>
</html>







