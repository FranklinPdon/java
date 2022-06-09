package br.com.fiap.melhoresCompras.model;

public class Eletronico extends Produto {

	private String tipo;

	public Eletronico(String nome, String marca, int estoque, double valor, String tipo) {
		super(nome, marca, estoque, valor);
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}

	public Eletronico() {

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
