package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, String> parOuImpar = 
				n -> n % 2 == 0 ? "Par" : "Impar" ; 
				
		System.out.println(parOuImpar.apply(4));
		
		Function<String, String> getResultado = valor -> "O resultado é: " + valor;
		
		
		String resultadoFinal = 
				parOuImpar.andThen(getResultado).apply(41);
		System.out.println(resultadoFinal);
		
		
		Function<String, String> empolgado = 
				valor -> valor + "!!!";
				
				
				
				
				

		String resultadoFinalAtt = 
		parOuImpar.andThen(getResultado).andThen(empolgado).apply(41);
		System.out.println(resultadoFinalAtt);
				
				
				
				
				
		}

}
