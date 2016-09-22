package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.bean.Usuario;
import br.com.fiap.bo.UsuarioBO;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Recupera as informações do JSP
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		//Instancia o BO
		UsuarioBO bo = new UsuarioBO();
		
		//Chama o método logar da BO
		Usuario usuario = bo.logar(login, senha);
		
		//Validar se encontrou o usuário
		if (usuario == null){
			req.setAttribute("erro", "Usuário e/ou senha inválidos");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}else{
			//Recuperar a sessão do usuário
			HttpSession session = req.getSession();
			session.setAttribute("usuario", usuario.getNome());
			
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
	}
	
}



