package br.com.fiap.melhoresCompras.model;

public class Perfumes extends Produto {

	private int litragem; // definida em mililitros 
	private String aroma;

	public Perfumes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perfumes(String nome, String marca, int estoque, double valor, int litros, String aroma) {
		super(nome, marca, estoque, valor);
		this.litragem = litros;
		this.aroma = aroma;

	}

	// Getters and Setters
	public int getLitragem() {
		return litragem;
	}

	public void setLitragem(int litragem) {
		this.litragem = litragem;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

}
