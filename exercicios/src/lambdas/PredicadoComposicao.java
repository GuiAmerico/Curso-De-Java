package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> isPar = num -> num % 2 == 0;
		System.out.println(isPar.test(2));
		
		Predicate<Integer> tem3Num = num -> num>=100 && num <=999;
		System.out.println(tem3Num.test(1000));
		
		System.out.println(isPar.and(tem3Num).test(100));
		System.out.println(isPar.or(tem3Num).test(100));
		
	}

}
