package br.com.fiap.bean;

public class Livro {

	private long isbn;
	
	private String titulo;
	
	private int numeroPagina;
	
	private String autor;
	
	public Livro() {
		super();
	}

	public Livro(long isbn, String titulo, int numeroPagina, String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.numeroPagina = numeroPagina;
		this.autor = autor;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroPagina() {
		return numeroPagina;
	}

	public void setNumeroPagina(int numeroPagina) {
		this.numeroPagina = numeroPagina;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
