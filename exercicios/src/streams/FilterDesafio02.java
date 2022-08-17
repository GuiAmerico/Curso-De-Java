package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto p1 = new Produto("Celular",2004.21,20,0.30);
		Produto p2 = new Produto("Tablet",1876.34,80, 0.15);
		Produto p3 = new Produto("Vinho",120.98,10, 0.25);
		Produto p4 = new Produto("Caderno",27.98,120, 0.25);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		Predicate<Produto> prodComDesc = p -> p.desconto >= 0.30;
		Predicate<Produto> prodComFrete = p -> p.frete <= 30;
		Function<Produto, String> topsProd = p -> "Promoção de hoje " + p.nome + " R$" + (p.preco * (1 - p.desconto) + " Frete: R$" +p.frete);
		
		produtos.stream().filter(prodComDesc)
		.filter(prodComFrete)
		.map(topsProd).forEach(System.out::print);;
	
	}

}
