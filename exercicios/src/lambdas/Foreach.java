package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		

		// Forma tradicional
		for(String aprovado : aprovados) {
			System.out.println(aprovado);
		}
		
		System.out.println("\n \n \n");
		System.out.println("----------------------------------");
		// Usando lambda #01
		aprovados.forEach(aprovado -> System.out.print("- " + aprovado + " - "));
		
		System.out.println("\n \n \n");
		System.out.println("_________________________________________");
		// Usando Method Reference #01
		aprovados.forEach(System.out::println);
		
		System.out.println("\n \n \n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// Usando lambda #02
		aprovados.forEach(aprovado -> meuImprimir(aprovado));
		
		System.out.println("\n \n \n");
		System.out.println("==================================");
		// Usando Method Reference #02
		aprovados.forEach(Foreach::meuImprimir);
		
		
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}

}
