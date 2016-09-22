package br.com.fiap.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Veiculo;
import br.com.fiap.bo.VeiculoBO;

@WebServlet("/veiculo")
public class VeiculoServlet  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Recuperar as informações do formulario HTML
		String model = req.getParameter("modelo");
		String monta = req.getParameter("montadora");
		int ano = Integer.parseInt(req.getParameter("ano"));
		double preco = Double.parseDouble(req.getParameter("valor"));
		
		//Cadastra o veiculo no Banco de Dados
		Veiculo veiculo = new Veiculo(0, model, preco, monta, ano);
		VeiculoBO bo = new VeiculoBO();
		bo.cadastrar(veiculo);
		
		//Retorna para a página de cadastro com uma 
		//mensagem de sucesso
		//Mensagem que será exibida na página JSP
		req.setAttribute("mensagem", "Cadastrado com sucesso");
		//Redirecionar para a página de cadastro
		req.getRequestDispatcher("cadastro-veiculo.jsp")
										.forward(req, resp);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Lista de Veiculos
		//Buscar os veiculos cadastrados no Banco de dados
		VeiculoBO bo = new VeiculoBO();
		List<Veiculo> lista = bo.listar();
		
		//Passa a lista para a JSP
		req.setAttribute("modeloChave", lista);
		//Redirecionar para a página JSP
		req.getRequestDispatcher("lista-veiculo.jsp")
			.forward(req, resp);
		
	}	
}





