package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.println("Valores Formatados: " + 1 + 2 + 3 + 4 + 5 + 6);
		System.out.println("Salario 2 casas decimais:" + 1876.432);
		System.out.println("Funcionário:" + "Gui");
	
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Seu nome é " + nome);
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.println("Voce tem" + idade + "anos");
		
		entrada.close();
	}
}
