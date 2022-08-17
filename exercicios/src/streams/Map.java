package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> println = System.out::println;
		
		List<String> marcas = Arrays.asList("bmw", "audi", "Honda", "fiat");
		
		marcas.stream().map(s -> s.toUpperCase()).forEach(println);
		
//		UnaryOperator<String> maiusculas = s -> s.toUpperCase();
//		UnaryOperator<String> minusculas = s -> s.toUpperCase();
//		UnaryOperator<String> primeiraLetra = p -> p.charAt(0) + "";
//		UnaryOperator<String> grito = p -> p + "!!!";
//		
		
		//marcas.stream().map(minusculas.andThen(maiusculas).andThen(primeiraLetra).andThen(grito)).forEach(println);
		marcas.stream().map(Utilitarios.minusculas)
		.map(Utilitarios.maiusculas)
		.map(Utilitarios.primeiraLetra)
		.map(Utilitarios.grito).forEach(println);
	}

}
