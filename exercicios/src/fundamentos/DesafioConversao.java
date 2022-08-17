package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o 1° salario: ");
		String n1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o 2° salario: ");
		String n2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o 3° salario: ");
		String n3 = entrada.nextLine().replace(",", ".");
		
		Double salario1 = Double.parseDouble(n1);
		Double salario2 = Double.parseDouble(n2);
		Double salario3 = Double.parseDouble(n3);
		
		double soma = salario1 + salario2 + salario3;
		double media = soma / 3;
		//System.out.println(media);
		
		entrada.close();
		
	}

}
