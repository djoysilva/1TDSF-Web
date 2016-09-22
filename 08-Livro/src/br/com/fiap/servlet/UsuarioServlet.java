package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.fiap.bean.Usuario;
import br.com.fiap.bo.UsuarioBO;

@WebServlet("/usuarioServlet")
public class UsuarioServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Recuperar os valores do formulário HTML
		String nome = req.getParameter("nome");
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		String repitaSenha = req.getParameter("repita");
		
		//Instanciar o BO
		UsuarioBO bo = new UsuarioBO();
		
		//Instanciar um Usuario
		Usuario usuario = new Usuario(nome, login, senha);
		
		//Chamar o método cadastrar do BO
		try{
			bo.cadastrar(usuario, repitaSenha);
			//Colocar uma mensagem para o JSP
			req.setAttribute("mensagem", "Usuario Cadastrado!");
			//Redirecionar para o JSP
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}catch(Exception e){
			e.printStackTrace();
			//Erro.. volta para a tela de cadastro com uma mensagem
			req.setAttribute("erro", e.getMessage());
			req.getRequestDispatcher("cadastro-usuario.jsp").forward(req, resp);
		}
	}
	
}
