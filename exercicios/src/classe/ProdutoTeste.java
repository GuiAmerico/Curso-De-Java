package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.nome = "Notebook";
		produto1.preco = 3543.23;
		Produto.desconto = 0.30;
		
		Produto produto2 = new Produto("Smartphone", 2387.23);
		double precoFinal1 =  produto1.produtoComDesconto();
		double precoFinal2 =  produto2.produtoComDesconto();
		
		System.out.println("O produto "+ produto1.nome);
//		System.out.println("Com o desconto de "+ produto1.desconto * 100 + "%");
		System.out.println("Com o desconto de "+ Produto.desconto * 100 + "%");
		System.out.println("Saiu de " + produto1.preco + " para " + precoFinal1);
		

		System.out.println("O produto "+ produto2.nome);
		//System.out.println("Com o desconto de "+ produto2.desconto * 100 + "%");
		System.out.println("Com o desconto de "+ Produto.desconto * 100 + "%");
		System.out.println("Saiu de " + produto2.preco + " para " + precoFinal2);
		
	}
}
