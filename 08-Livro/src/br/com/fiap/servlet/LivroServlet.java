package br.com.fiap.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Livro;
import br.com.fiap.bo.LivroBO;

@WebServlet("/livroServlet")
public class LivroServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Instancia a classe BO
		LivroBO bo = new LivroBO();
		//Buscar os livros cadastrados
		List<Livro> lista = bo.listar();
		//Passar a lista para o JSP
		req.setAttribute("chaveDaLista", lista);
		//Redirecionar para a p�gina JSP
		req.getRequestDispatcher("lista-livro.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Recuperar a a��o
		String acao = req.getParameter("acao");

		//Instanciar o BO
		LivroBO bo = new LivroBO();
		
		switch (acao) {
		case "excluir":
			//Recuperar o ISBN do formul�rio de exclus�o
			long isbnExcluir = Long.parseLong(req.getParameter("isbn"));
			try{
				//Chamar o BO para excluir
				bo.excluir(isbnExcluir);
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				//Buscar os livros cadastrados
				List<Livro> lista = bo.listar();
				//Passar a lista para o JSP
				req.setAttribute("chaveDaLista", lista);
				//Redirecionar para algum lugar...
				req.getRequestDispatcher("lista-livro.jsp").forward(req, resp);
			}
			break;
		case "cadastrar":
			//Recuperar os valores do formul�rio
			String titulo = req.getParameter("titulo");
			long isbn = Long.parseLong(req.getParameter("isbn"));
			String autor = req.getParameter("autor");
			int pagina = Integer.parseInt(req.getParameter("numero"));
			
			//Instanciar o livro
			Livro livro = new Livro(isbn,titulo,pagina,autor);
			
			bo.cadastrar(livro);
			
			//Exibe uma mensagem para a tela
			req.setAttribute("chave", "Cadastro realizado!");
			//Redireciona para uma jsp
			req.getRequestDispatcher("cadastro-livro.jsp").forward(req, resp);
			break;
		default:
			break;
		}
		
		
	}
		
}






