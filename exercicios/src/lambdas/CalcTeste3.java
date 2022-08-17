package lambdas;

import java.util.function.BinaryOperator;

public class CalcTeste3 {
	public static void main(String[] args) {
		BinaryOperator<Double> calculo = (x, y) -> {return x + y ;};
		System.out.println(calculo.apply(4.0,6.0));
		
		calculo = (a, b) -> {return a * b;};
		System.out.println(calculo.apply(2.0, 4.0));
		
	}
}
