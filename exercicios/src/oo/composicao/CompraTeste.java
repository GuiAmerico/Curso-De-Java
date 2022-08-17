package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compra c1 = new Compra();
		c1.cliente = "Guilherme";
		c1.adicionarItem("Shampoo", 1, 10.34);
		c1.adicionarItem("Carne", 1, 40.54);
		c1.adicionarItem("Desodorante", 2, 11.27);
		c1.adicionarItem("Cotonete", 1, 2.67);
		
		System.out.println(c1.itens.size());
		//System.out.println(c1.itens.toString());
		System.out.printf("%.2f",c1.obterValorTotal());
		
	
	}

}
