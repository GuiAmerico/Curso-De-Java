package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) > 1000;
		
		Produto produto = new Produto("Smartphone", 1500.23, 0.25);
		
		System.out.println(isCaro.test(produto));
	}

}
