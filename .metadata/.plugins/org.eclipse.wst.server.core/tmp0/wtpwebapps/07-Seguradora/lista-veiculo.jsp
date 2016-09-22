<%@page import="br.com.fiap.bean.Veiculo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Veiculo</title>
<link rel="stylesheet" type="text/css" 
								href="css/bootstrap.min.css">
</head>
<body>
<!-- Recupera a lista de veiculo que o servlet passou -->
<%
	List<Veiculo> lista = (List<Veiculo>) 
						request.getAttribute("modeloChave");
%>

<div class="container">
	<h1>Lista de Veiculos</h1>
	<table class="table">
		<tr>
			<th>Modelo</th>
			<th>Ano</th>
			<th>Valor</th>
			<th>Montadora</th>
		</tr>
		<% for (Veiculo v : lista) { %>
			<tr>
				<td><%=v.getModelo() %></td>
				<td><%=v.getAno() %></td>
				<td><%=v.getValor() %></td>
				<td><%=v.getMontadora() %></td>
			</tr>
		<% } %>
	</table>
	<div>
		<a href="cadastro-veiculo.jsp">Cadastrar Veiculo</a>
	</div>	
</div>
</body>
</html>

