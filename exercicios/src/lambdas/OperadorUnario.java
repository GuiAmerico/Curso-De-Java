package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = num -> num + 2;
		UnaryOperator<Integer> vezesDois = num -> num * 2;
		UnaryOperator<Integer> aoQuadrado = num -> num * num;
		
		int res1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(3);
		System.out.println(res1);
		
		int res2 = maisDois.compose(vezesDois).compose(aoQuadrado).apply(3);
		System.out.println(res2);

	}

}
