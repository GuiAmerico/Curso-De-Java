package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String pergunta = entrada.nextLine();
		int n1;
		int n2;
		int soma;
		while(!pergunta.equalsIgnoreCase("nao")){
			System.out.print("Infome o primeiro numero: ");
			n1 = entrada.nextInt();
			System.out.print("Infome o segundo numero numero: ");
			n2 = entrada.nextInt();
			soma = n1 + n2;
			System.out.println(soma);
			
			System.out.print("Quer continuar?");
			pergunta = entrada.next();
		}
		entrada.close();
	}

}
