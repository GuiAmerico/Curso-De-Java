package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	public final static UnaryOperator<String> maiusculas = s -> s.toUpperCase();
	public final static UnaryOperator<String> minusculas = s -> s.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = p -> p.charAt(0) + "";
	public final static UnaryOperator<String> grito = p -> p + "!!!";
	

}
