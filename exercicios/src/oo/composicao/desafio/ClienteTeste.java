package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Gui");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caderno",35.4 ,2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caneta",2.50, 3);
		compra2.adicionarItem("Lápis",2.50, 2);
		
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		
		System.out.println(cliente1.obterValorTotal());
	
		
	}

}
