package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto : produtos) {
			System.out.println(produto.getNome() + " - " + produto.getPreco());
			
		}
		
		double precoTotal = produtos.stream().map(p -> p.getPreco())
		.reduce(0.0 , (vi, vf) -> vi + vf).doubleValue();
		
		System.out.printf("Preço total: %.2f",precoTotal);
	}

}
