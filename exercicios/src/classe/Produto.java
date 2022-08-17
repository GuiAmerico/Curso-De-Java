package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	double produtoComDesconto() {
		return preco * (1 - desconto);
	}
	
	Produto(){
		
	}
	
//	Produto(String nomeProduto, double precoProduto, double descontoProduto){
//		nome = nomeProduto;
//		preco = precoProduto;
//		desconto = descontoProduto; 
//	}
	
	Produto(String nomeProduto, double precoProduto){
		nome = nomeProduto;
		preco = precoProduto;
	}


}
