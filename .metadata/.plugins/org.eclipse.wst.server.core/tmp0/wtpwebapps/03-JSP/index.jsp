<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World - JSP</title>
</head>
<body>
	<h1>Index</h1>
	<%-- Incluir um arquivo jsp (Diretivas) --%>
	<%@ include file="topo.jsp" %>
	
	<%-- Comentário JSP (Não aparece no hmtl final)--%>
	<!-- Comentário HTML (Aparece no html final)-->
	<ul>		
		<% for(int i=0; i<10; i++) { %>
			<li><%=i %></li>
		<% } //fechamento do for %>
	</ul>

	<%@ include file="rodape.jsp" %>
	
</body>
</html>




