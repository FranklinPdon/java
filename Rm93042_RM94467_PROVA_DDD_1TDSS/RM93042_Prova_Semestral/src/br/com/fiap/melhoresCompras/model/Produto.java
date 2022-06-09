package br.com.fiap.melhoresCompras.model;

public class Produto {

	private String nome;
	private String marca;
	private int estoque;
	private double valor;

	// Costrutor classe Pai Produto

	
	public Produto(String nome, String marca, int estoque, double valor) {

		this.nome = nome;
		this.marca = marca;
		this.estoque = estoque;
		this.valor = valor;
	}


	public Produto() {
		
	}
	

	//Getters and Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	
	

}
