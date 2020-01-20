package com.br.Loja.GFT;

public class Livro extends Produto {

	

	String autor;

	String tema;

	int qtdPag;

	

	

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {

		super(nome, preco, qtd);

		this.autor = autor;

		this.tema = tema;

		this.qtdPag = qtdPag;

	}

	public String getAutor() {

		return autor;

	}

	public void setAutor(String autor) {

		this.autor = autor;

	}

	public String getTema() {

		return tema;

	}

	public void setTema(String tema) {

		this.tema = tema;

	}

	public int getQtdPag() {

		return qtdPag;

	}

	public void setQtdPag(int qtdPag) {

		this.qtdPag = qtdPag;

	}

	

	@Override

	public double calculeImposto( ){

		

		if(tema == "educativo" ) {

			System.out.println("Livro educativo não tem imposto :  " + nome);

			return (0);

			

		}else {

		double novoPreco= preco * 0.10;

		System.out.println("R$: " + novoPreco + " de impostos sobre o livro " + nome );

			return (0);

		}

	}



}