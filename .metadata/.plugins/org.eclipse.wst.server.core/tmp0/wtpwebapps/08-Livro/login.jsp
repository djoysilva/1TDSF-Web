<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
<div class="container">
	<h1>Entre!</h1>
	${mensagem}
	${erro }
	<form action="loginServlet" method="post">
		<div class="form-group">
			<label for="idLogin">Login</label>
			<input type="text" name="login" class="form-control" id="idLogin">
		</div>
		<div class="form-group">
			<label for="idSenha">Senha</label>
			<input type="password" name="senha" class="form-control" id="idSenha">
		</div>
		<div class="form-group">
			<a href="cadastro-usuario.jsp">Registre-se!</a>
			<input type="submit" value="Entrar" class="btn btn-primary">
		</div>
	</form>
</div>
</body>
</html>