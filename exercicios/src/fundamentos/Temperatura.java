package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a temperatura em °F para conversão: ");
		int f = sc.nextInt();
		sc.close();
		
		final int SUB = 32;
		final double DIV = 5 / 9.0;
		double c;
		//System.out.println(f);
		
		 c = (f - SUB) * DIV;
		 System.out.println("°F " + f + " em °C é de: " + c);
		
		
		
		
		//System.out.println();
	}

}
