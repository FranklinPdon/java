package br.com.fiap.melhoresCompras.model;

public class Moveis extends Produto {
	
	
	private String material; 
	private double peso;
	
	
	

	public Moveis(String nome, String marca,int estoque, double valor, String material , double peso ) {
		super(nome, marca, estoque, valor);
		this.material=material;
		this.peso=peso;
	}
	
		
	public Moveis() {
		
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
	
	
	
}
