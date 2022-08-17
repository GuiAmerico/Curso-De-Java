package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média:");
		
		double media = entrada.nextDouble();
		
		if(media >= 7) {
			
			System.out.println("Aprovado!");
		}else{
			System.out.println("Reprovado!");
		}
		
		entrada.close();
		
		
		
	}

}
