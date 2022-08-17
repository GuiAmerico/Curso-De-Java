package controle;

import java.util.Scanner;

public class Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int n1 = entrada.nextInt();
		
		if(n1 % 2 == 0) {
			System.out.println("É PAR!");
			
		}else {
			System.out.println("É IMPAR!");
		}
		
		
		
		
	}

}
