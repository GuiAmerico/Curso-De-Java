package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Digite um numero: ");
			n = entrada.nextInt();
			if(n != 0) {
				System.out.println("digite 0 para sair /n");
			}
		}while(n != 0);
		System.out.println("FIM!");
	}

}
