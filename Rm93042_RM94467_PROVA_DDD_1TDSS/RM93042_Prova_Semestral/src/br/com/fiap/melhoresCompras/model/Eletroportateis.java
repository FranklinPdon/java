package br.com.fiap.melhoresCompras.model;

public class Eletroportateis extends Produto {

	private String categoriaUso;
	private String voltagem;
	

	// Construtores
	

	public Eletroportateis(String nome, String marca, int estoque, double valor,String categoria ,String voltagem) {
		super(nome, marca, estoque, valor);
		this.categoriaUso=categoria;
		this.voltagem=voltagem;
	
	}

	public Eletroportateis() {
		
	}
	
	

	// Getters and Setters
	public String getCategoriaUso() {
		return categoriaUso;
	}

	

	public void setCategoriaUso(String categoriaUso) {
		this.categoriaUso = categoriaUso;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}
	
	

}
