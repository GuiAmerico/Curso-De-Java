package controle;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	System.out.print("DIGITE A NOTA: ");
	double nota = entrada.nextDouble();
	
	if(nota < 0 || nota > 10) {
		System.out.println("NOTA INVALIDA!");
	}else if(nota >=8.0) {
		
		
		System.out.println("Conceito A");
		
	
		}else {
			System.out.println("Conceito B");
		}
	
	
		System.out.println("FIM");
	
	
	}

}
