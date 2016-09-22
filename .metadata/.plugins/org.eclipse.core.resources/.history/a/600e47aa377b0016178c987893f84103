<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastre-se!</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>

<div class="container">
	<h1>Cadastre-se! É grátis!</h1>
	
	<c:if test="${not empty erro}">
		<div class="alert alert-danger">
			${erro}
		</div>
	</c:if>
	
	<form action="usuarioServlet" method="post">
		<div class="form-group">
			<label for="nomeId">Nome</label>
			<input type="text" name="nome" id="nomeId" class="form-control">
		</div>
		<div class="form-group">
			<label for="loginId">Login</label>
			<input type="text" name="login" id="loginId" class="form-control">
		</div>
		<div class="form-group">
			<label for="senhaId">Senha</label>
			<input type="password" name="senha" id="senhaId" class="form-control">
		</div>
		<div class="form-group">
			<label for="repitaId">Repita a senha</label>
			<input type="password" name="repita" id="repitaId" class="form-control">
		</div>
		<div class="form-group">
			<input type="submit" value="Cadastrar" class="btn btn-primary">
		</div>
	</form>
</div>

</body>
</html>