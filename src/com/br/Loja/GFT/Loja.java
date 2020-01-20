package com.br.Loja.GFT;
import java.util.List;



public class Loja {

	private String nome;

	private String cnpj;

	List<Livro> livros;

	List<VideoGame> games;



//	Construtor

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> games) {

		super();

		this.nome = nome;

		this.cnpj = cnpj;

		this.livros = livros;

		this.games = games;

	}

	

	//Getters e Setters 

	public String getNome() {

		return nome;

	}





	public void setNome(String nome) {

		this.nome = nome;

	}





	public String getCnpj() {

		return cnpj;

	}





	public void setCnpj(String cnpj) {

		this.cnpj = cnpj;

	}





	public List<Livro> getLivros() {

		return livros;

	}





	public void setLivros(List<Livro> livros) {

		this.livros = livros;

	}





	public List<VideoGame> getGames() {

		return games;

	}





	public void setGames(List<VideoGame> games) {

		this.games = games;

	}



//Métodos 

	public void listaLivros() {

		 System.out.printf("A loja Americanas posssui estes livros para vendas \n");

		    int n = livros.size();

		    for (int i=0; i<n ; i++) {

		      System.out.printf("Titulo :" +  livros.get(i).nome + ", "  + "  Preço: "+ livros.get(i).preco + ", " + "  Quantidade: " + livros.get(i).qtd + "  em estoque. \n "  );

		    

		    }

		    System.out.println("-------------------------------------------------");



		

	}

	public void ListaVideoGames() {

		 System.out.printf("A loja Americanas posssui estes Videos-games para vendas \n");

		    int n = games.size();

		    for (int i=0; i<n ; i++) {

		      System.out.printf("Titulo :" +  games.get(i).nome +", " + "  Preço: " + games.get(i).preco + ", "+ "  Quantidade: " + games.get(i).qtd +  "  em estoque. \n "  );

		      

			    

		    }

		    System.out.println("-------------------------------------------------");

		    

	}

	

	

	

	public double calculaPatrimonio() {

	

			

			

		double n = games.size();

		double  a = livros.size();

		double result = 0;

		double resulta = 0;

		

		for(int i=0; i<n ; i++) {

			result += (int) games.get(i).getPreco() * games.get(i).getQtd();

			}

		

		for(int i=0; i<a ; i++) {

	

				resulta += (int) livros.get(i).getPreco() * livros.get(i).getQtd();

				

					}

			System.out.println(resulta);

			System.out.println(result );

			System.out.println(resulta + result);

				

		return resulta + result;

		

		

	

	}

	

}