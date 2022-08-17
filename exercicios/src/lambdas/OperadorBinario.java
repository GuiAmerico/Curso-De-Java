package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryOperator<Double> media = (n1,n2) -> (n1 + n2) / 2;
		Function<Double, String> conceito = m -> m >= 6 ? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(conceito).apply(4.6, 3.8));
		
		System.out.println();
		
		BiFunction<Double, Double, String> resultado = (x, y) ->
		((x + y) / 2) > 6 ? "Aprovado" : "Reprovado";
		
		System.out.println(resultado.apply(7.0, 5.2));
		
	}

}
