package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		Produto prod = new Produto("Notebook", 2000.00, 0.10);
		imprimir.accept(prod);
	
	
		Produto prod1 = new Produto("Celular", 2000.00, 0.10);
		Produto prod2 = new Produto("Tablet", 1000.00, 0.10);
		Produto prod3 = new Produto("Fone de ouvido", 20.00, 0.10);
		Produto prod4 = new Produto("Carregador", 40.00, 0.10);
		
		List<Produto> produtos = Arrays.asList(prod1, prod2, prod3, prod4);
		
		produtos.forEach(imprimir);
		System.out.println("\n");
		produtos.forEach(System.out::println);
	}

}
