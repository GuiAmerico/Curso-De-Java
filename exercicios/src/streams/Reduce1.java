package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		BinaryOperator<Integer> numbers = (n,i) -> n + i;
		int total = nums.stream().reduce(numbers).get();
		System.out.println(total);
		
		Integer total2 = nums.parallelStream().reduce(100,numbers);
		System.out.println(total2);
		
		nums.stream().filter(n -> n>5)
		.reduce(numbers)
		.ifPresent(System.out::println);;
	}

}
