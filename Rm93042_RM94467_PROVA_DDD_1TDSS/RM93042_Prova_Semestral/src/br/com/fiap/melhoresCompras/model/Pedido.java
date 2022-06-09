package br.com.fiap.melhoresCompras.model;



public class Pedido {
	
	
	private String cliente;
	private Produto produto;
	private String formapgto;
	private int quantidade; 

	
	//construtores
	public Pedido(String cliente, Produto produto, String formapgto, int quantidade) {
		this.cliente = cliente;
		this.produto = produto;
		this.formapgto = formapgto;
		this.quantidade = quantidade;
	}


	public Pedido() {
		
	}

	
	
	//tira o valor do estoque do Produto e rerorna o valor a Ser pago
	public double fechaPedido() {
		getProduto().setEstoque(getProduto().getEstoque()- quantidade);
		return getProduto().getValor() * quantidade;

		
	}
	//tira o valor do estoque do produto e retorna o valor mais frete baseado no peso
	public double fechaPedido(double frete , double peso) {
		getProduto().setEstoque(getProduto().getEstoque()- quantidade);
		double totalFrete = frete*peso;
		return getProduto().getValor() * quantidade + totalFrete;

		
	}
	
		
	public double calcularDesconto(String cupom) {
		//Converter as letras para maiusculas
		cupom = cupom.toUpperCase();
		//Validar se é FIAP20
		if (cupom.equals("FIAP20")) {
			return getProduto().getValor() * 0.8;
		} else if (cupom.equals("FIAP30")) {
			return getProduto().getValor() * 0.7;
		}
		return getProduto().getValor();
	}
	
	
	
	
	@Override
	public String toString() {
		
		return cliente + "- Produto "+getProduto().getNome()+"-QTD :"+ quantidade +" Pago por: "+formapgto ; 
	}
	
	
	//Setters and getters
	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public String getFormapgto() {
		return formapgto;
	}


	public void setFormapgto(String formapgto) {
		this.formapgto = formapgto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	

	
	
	
	
	

}






	
