<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Veiculo</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>

	<div class="container">

		<div class="row">
			<div class="col-md-6">
				<h1>Cadastro de Veiculo</h1>

				<%
					if (request.getAttribute("mensagem") != null) {
				%>
				<div class="alert alert-success">
					<%=request.getAttribute("mensagem")%>
				</div>
				<%
					}
				%>

				<form action="veiculo" method="post">
					<div class="form-group">
						<label for="id-modelo">Modelo</label> <input class="form-control"
							type="text" name="modelo" id="id-modelo">
					</div>
					<div class="form-group">
						<label for="id-valor">Valor</label> <input class="form-control"
							type="text" name="valor" id="id-valor">
					</div>
					<div class="form-group">
						<label for="id-ano">Ano</label> <input class="form-control"
							type="text" name="ano" id="id-ano">
					</div>
					<div class="form-group">
						<label for="id-montadora">Montadora</label> <select
							class="form-control" name="montadora" id="id-montadora">
							<option>Selecione</option>
							<option>FORD</option>
							<option>FIAT</option>
							<option>Mercedez</option>
						</select>
					</div>
					<div>
						<input type="submit" value="Salvar" class="btn btn-primary">
						<!-- @WebServlet("/veiculo") Aciona a servlet -->
						<a href="veiculo">Lista de Veiculos</a>
					</div>
				</form>
			</div>
			<div class="col-md-6"></div>
		</div>

	</div>
</body>
</html>



