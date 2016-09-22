package br.com.fiap.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logar")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Recuperar as informações da tela
		String usuario = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		//Validar o usuário e senha
		//Devolver uma informação para o usuário
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		if (usuario.equals("FIAP") && senha.equals("2016")){
			out.println("<html><head><title>"
					+ "</title></head><body>"
					+ "<h1>Bem Vindo!</h1></body></html>");
		}else{
			out.println("<html><head><title>"
					+ "</title></head><body>"
					+ "<h1>Errou!</h1></body></html>");
		}
		
	}
	
}
