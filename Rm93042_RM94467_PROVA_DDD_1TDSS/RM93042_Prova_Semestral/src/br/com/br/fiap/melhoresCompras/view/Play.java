package br.com.br.fiap.melhoresCompras.view;


// Projeto de e-commerce simples


import java.util.Scanner;

import br.com.fiap.melhoresCompras.model.Eletronico;
import br.com.fiap.melhoresCompras.model.Eletroportateis;
import br.com.fiap.melhoresCompras.model.Moveis;
import br.com.fiap.melhoresCompras.model.Pedido;
import br.com.fiap.melhoresCompras.model.Perfumes;
import br.com.fiap.melhoresCompras.model.Produto;

public class Play {

	public static void main(String[] args) {

	Eletronico eletronico = new Eletronico("IPAD", "Apple", 10, 3500.00, "Tablet");
	Eletroportateis eletroportatil = new Eletroportateis("Cafeteira Nesspresso", "Arno", 50,350.00,"Cozinha" ,"110V");
	Moveis movel = new Moveis("Cama Queen Size","Castor",5,2220.20,"Madeira/algodao",30);
	Perfumes perfume = new Perfumes("Sauvage","DIOR",15,349.50,50,"amadeirado");
	
	
	
	Scanner entrada = new Scanner(System.in);
	entrada.useDelimiter("[\r\n]+");
	
	System.out.println("---------------Bem vindo as Melhores Compras--------------------------------------------------------");
	System.out.println("Digite seu nome para Começar:");
	String cliente= entrada.next();
	System.out.println("=========================ESTAS SÃO AS OFERTAS QUE SEPARAMOS PARA VOCE ======================================================");
	System.out.println("1- "+eletronico.getNome()+" "+eletronico.getMarca()+" "+eletronico.getTipo()+": R$ "+eletronico.getValor()+"\n"+
					   "2- "+eletroportatil.getNome()+" "+eletroportatil.getMarca()+" "+eletroportatil.getCategoriaUso()+          ": R$ "+eletroportatil.getValor()+"\n"+
					   "3- "+movel.getNome()+" "+movel.getMarca()+" "+movel.getMaterial()+": R$ "+movel.getValor()+"\n"+
					   "4- "+perfume.getNome()+" "+perfume.getMarca()+" "+perfume.getLitragem()+" ml "+perfume.getAroma()+" :R$ "+perfume.getValor()+"\n");
	System.out.println("-----------------------------------------------------------------------------------------------------");
	
	System.out.println("Digite a opção para realizar seu pedido "+ cliente.toUpperCase()+": ");
	int flag = entrada.nextInt();
	
	
	switch (flag) {
	case 1: {
		
		System.out.println("Digite a Quantidade do produto que quer adquirir");
		int quantidade =entrada.nextInt();
				
		
		System.out.println("Digite a Forma de Pagamento");
		String formapgto=entrada.next();
		
		Pedido pedido = new Pedido(cliente,eletronico,formapgto,quantidade);
		
		System.out.println("Esse é o seu pedido");
		System.out.println(pedido);
		
		double totalPagar=pedido.fechaPedido(); 
				
		
		System.out.println("O valor total é de R$:"+totalPagar );
		
		System.out.println("Pedido realizado com sucesso");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		System.out.println("Informações sobre o estoque atual: "+eletronico.getNome()+" "+eletronico.getEstoque()+" no Estoque");
		
	
		break;
	}
	case 2: {
		
		System.out.println("Digite a Quantidade do produto que quer adquirir");
		int quantidade =entrada.nextInt();
				
		
		System.out.println("Digite a Forma de Pagamento");
		String formapgto=entrada.next();
		
		Pedido pedido = new Pedido(cliente,eletroportatil,formapgto,quantidade);
		
		System.out.println("Esse é o seu pedido");
		System.out.println(pedido);
		
		double totalPagar=pedido.fechaPedido(); 
		
		System.out.println("O valor total é de R$:"+totalPagar );
		
		System.out.println("Pedido realizado com sucesso");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		System.out.println("Informações sobre o estoque atual: "+eletroportatil.getNome()+" "+eletroportatil.getEstoque()+" no Estoque");
	break;
	
	
	
	}
	
	case 3: {
		
		System.out.println("Digite a Quantidade do produto que quer adquirir");
		int quantidade =entrada.nextInt();
				
		
		System.out.println("Digite a Forma de Pagamento");
		String formapgto=entrada.next();
		
		Pedido pedido = new Pedido(cliente,movel,formapgto,quantidade);
		
		System.out.println("Esse é o seu pedido");
		System.out.println(pedido);
		
		double totalPagar=pedido.fechaPedido(0.89,movel.getPeso()); 
		
		System.out.println("O valor total é de R$:"+totalPagar+ " via : "+pedido.getFormapgto());
		
		System.out.println("Pedido realizado com sucesso");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		System.out.println("Informações sobre o estoque atual: "+movel.getNome()+" "+movel.getEstoque()+" no Estoque");
	   
		break;
	
	
	
	}
	
case 4: {
		
		System.out.println("Digite a Quantidade do produto que quer adquirir");
		int quantidade =entrada.nextInt();
				
		
		System.out.println("Digite a Forma de Pagamento");
		String formapgto=entrada.next();
		
		Pedido pedido = new Pedido(cliente,perfume,formapgto,quantidade);
		
		System.out.println("Esse é o seu pedido");
		System.out.println(pedido);
		
		double totalPagar=pedido.fechaPedido(); 
		
		System.out.println("O valor total é de R$:"+totalPagar );
		
		System.out.println("Pedido realizado com sucesso");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		System.out.println("Informações sobre o estoque atual: "+perfume.getNome()+" "+perfume.getEstoque()+" no Estoque");
	   
		break;
	
	
	
	}
			
	default:
		System.err.println("Oferta não Encontrada");
	}
	
	
System.out.println("--------------------------------------------------");
System.out.println("--------------------------------------------------");
System.out.println("--------------------------------------------------");
System.out.println("Criando os objetos pelo input usuário");


//----------------para uso do input ------------------------------------------------------//
	

	
	
	System.out.println("Digite o nome do Produto:");
	String name=entrada.next();
	System.out.println("Digite a marca do Produto:");
	String brand = entrada.next();
	System.out.println("Digite a Quantia no estoque:");
	int stock = entrada.nextInt();
	System.out.println("Digite o Valor:");
	double vl = entrada.nextDouble();
	System.out.println("Digite o Tipo:");
	String type = entrada.next();
	
	Eletronico eletronico2 = new Eletronico(name,brand,stock,vl,type);
	
	
	// pedido baseado no produto incluso
	
	System.out.println("Digite o nome do usuário:");
	 String usuario =entrada.next();
	 System.out.println("Digite o metodo de Pagamento:"); 
	 String pgto=entrada.next();
	 System.out.println("Digite a quantidade a ser comprada:");
	 int qtd=entrada.nextInt();
	 System.out.println("Digite o cumpo de desconto se houver ?:");
	 String cp =entrada.next();
	Pedido pedido2 = new Pedido(usuario,eletronico2,pgto,qtd);
	

double valueSemDesconto = pedido2.fechaPedido();
System.out.println("O valor do produto SEM desconto é : "+ "R$ "+ valueSemDesconto);
double valueDesconto = pedido2.calcularDesconto(cp);

System.out.println("O valor do produto com desconto é : "+ "R$ "+ valueDesconto);

	


System.out.println("Esse é seu Pedido criado: ");
System.out.println(pedido2);

System.out.println("O valor atual do estoque é " + eletronico2.getEstoque());


entrada.close();
	
	
	
	
	
	
	}

	 
	

	
	

}
