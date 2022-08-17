package streams;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UtlitariosDesafio {
	
	public  final static Function<Integer, String> paraStringBinaria = num
			-> {
				String str = Integer.toBinaryString(num);
				return str;
			};
			
	public final static UnaryOperator<String> inverter = str ->
	{
		new StringBuilder(str).reverse();
		return str;
	};
	
	public final static Function<String, Integer> paraInteiro = str ->
	{
		Integer num;
		num = Integer.parseInt(str, 2);
		return num;
	};

}
