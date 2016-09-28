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
		//Recuperar a a��o
		String acao = req.getParameter("acao");
		//Instancia a classe BO
		LivroBO bo = new LivroBO();
		switch (acao) {
		case "listar":
			listarLivro(req, bo);
			//Redirecionar para a p�gina JSP
			req.getRequestDispatcher("lista-livro.jsp").forward(req, resp);	
			break;
		case "abrirForm":
			//Recuperar o ISBN do link
			long isbn = Long.parseLong(req.getParameter("isbn"));
			//Busca o livro no Banco (BO) usando o isbn
			Livro livro = bo.buscarPorIsbn(isbn);
			//Passa o livro para a JSP
			req.setAttribute("livro", livro);
			//Encaminha o usuario para o JSP
			req.getRequestDispatcher("altera-livro.jsp")
												.forward(req, resp);
			break;
		default:
			break;
		}
	}

	private void listarLivro(HttpServletRequest req, LivroBO bo) {
		//Buscar os livros cadastrados
		List<Livro> lista = bo.listar();
		//Passar a lista para o JSP
		req.setAttribute("chaveDaLista", lista);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Recuperar a a��o
		String acao = req.getParameter("acao");

		//Instanciar o BO
		LivroBO bo = new LivroBO();
		
		switch (acao) {
		case "alterar":
			//Recuperar as informa��es do formul�rio
			Livro li = carregarLivroForm(req);
			try{
				//chama o metodo e atualiza o BO
				bo.atualizar(li);
				//Mensagem de sucesso
				req.setAttribute("mensagem", "Livro atualizado");
				//Manda a lista de livros para a tabela no JSP
				listarLivro(req,bo);
				//Redirecionar para a pag de listagem
				req.getRequestDispatcher("lista-livro.jsp").forward(req,resp);
				
			}catch (Exception e){
				e.printStackTrace();
				//Mensagem de erro
				req.setAttribute("mensagem", e.getMessage());
				//Redireciona para pag de atualiza��o
				req.getRequestDispatcher("altera-livro.jsp").forward(req, resp);
				
			}
			break;
			
		case "excluir":
			//Recuperar o ISBN do formul�rio de exclus�o
			long isbnExcluir = Long.parseLong(req.getParameter("isbn"));
			try{
				//Chamar o BO para excluir
				bo.excluir(isbnExcluir);
				//Passar a mensagem para a JSP
				req.setAttribute("mensagem", "Livro excluido!");
			}catch(Exception e){
				e.printStackTrace();
				//Passar a mensagem para a JSP
				req.setAttribute("mensagem", e.getMessage());
			}finally {
				listarLivro(req, bo);				
				//Redirecionar para algum lugar...
				req.getRequestDispatcher("lista-livro.jsp").forward(req, resp);
			}
			break;
		case "cadastrar":
			Livro livro = carregarLivroForm(req);
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

	private Livro carregarLivroForm(HttpServletRequest req) {
		//Recuperar os valores do formul�rio
		String titulo = req.getParameter("titulo");
		long isbn = Long.parseLong(req.getParameter("isbn"));
		String autor = req.getParameter("autor");
		int pagina = Integer.parseInt(req.getParameter("numero"));
		
		//Instanciar o livro
		Livro livro = new Livro(isbn,titulo,pagina,autor);
		return livro;
	}
		
}






