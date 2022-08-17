package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o segundo valor: ");
		double n2 = entrada.nextDouble();
		System.out.print("Qual operação você quer realizar: + - * / %");
		String operacao = entrada.nextLine();
		
		
		double resultado = "+".equals(operacao) ? n1 + n2 : 0 ;
		 resultado = "-".equals(operacao) ? n1 - n2 : resultado ;
		 resultado = "*".equals(operacao) ? n1 * n2 : resultado ;
		 resultado = "/".equals(operacao) ? n1 / n2 : resultado;
		 resultado = "%".equals(operacao) ? n1 % n2 : resultado;
		 System.out.println(resultado);
		
		
		entrada.close();
		

	}

}
