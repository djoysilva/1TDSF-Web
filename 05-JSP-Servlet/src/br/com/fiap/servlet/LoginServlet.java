package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logar")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Recuperar as informações da página JSP
		String usuario = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		//Validar 
		if (usuario.equals("fiap") && senha.equals("1234")){
			req.setAttribute("olalogin", usuario);
			//Redireciona para a página home.jsp
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}else{
			//Passar informação para a página
			req.setAttribute("qualquer", "Usuário e/ou senha inválidos");
			//Redirecionar o usuário para a página de Login
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
	
}









