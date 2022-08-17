package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

@SuppressWarnings("unused")
public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print;
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		//  Sem google kk
//		Function<Integer, String> paraString = num -> num + " ";
//		UnaryOperator<String> paraBinario = str -> {
//			
//			if(str.trim().equals("1")) {
//				str = "1 ";
//			}
//			else if(str.trim().equals("2")) {
//				str = "10 ";
//				
//			}
//			else if(str.trim().equals("3")) {
//				str = "11 ";
//				
//			}else if(str.trim().equals("4")) {
//				str = "100 ";
//				
//			}else if(str.trim().equals("5")) {
//				str = "101 ";
//				
//			}else if(str.trim().equals("6")) {
//				str = "110 ";
//				
//			}else if(str.trim().equals("7")) {
//				str = "111 ";
//				
//			}else if(str.trim().equals("8")) {
//				str = "1000 ";
//				
//			}else if(str.trim().equals("9")) {
//				str = "1001 ";
//				
//			}
//			return str;
//			
//		};
//		
//		UnaryOperator<String> reveter = str -> {
//			
//			
//			
//			return new StringBuilder(str).reverse().toString();
//			
//		};
//		
//		Function<String, Integer> paraInteiro = str -> {
//			
//			
//			
//			Integer num;
//			
//			
//			
//			if(str.trim().equals("1")) {
//				str = "1";
//			}
//			else if(str.trim().equals("01") ) {
//				str = "2";
//			}
//			else if(str.trim().equals("11")) {
//				str = "3";
//			}
//			else if(str.trim().equals("001")) {
//				str = "4";
//			}
//			else if(str.trim().equals("101")) {
//				str = "5";
//			}
//			else if(str.trim().equals("011")) {
//				str = "6";
//			}
//			else if(str.trim().equals("111")) {
//				str = "7";
//			}
//			else if(str.trim().equals("0001")) {
//				str = "8";
//			}
//			else if(str.trim().equals("1001")) {
//				str = "9";
//			}
//			
//			num = Integer.parseInt(str);
//			
//			return num;
//			
//			
//		} ;
//		
		Function<Integer, String> espaco = num -> num + " ";
//		
//		nums.stream()
//		.map(paraString)
//		.map(paraBinario)
//		.map(reveter)
//		.map(paraInteiro)
//		.map(espaco)
//		.forEach(print);
//		
		System.out.println();
		// Com google
		nums.stream().map(UtlitariosDesafio.paraStringBinaria)
		.map(UtlitariosDesafio.inverter)
		.map(UtlitariosDesafio.paraInteiro)
		.map(espaco)
		.forEach(print);
		
		
		
		
		
		
		
		
		
		
		
	}

}
