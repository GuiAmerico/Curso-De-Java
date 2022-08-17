package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o dia da semana: ");
		String diaSemana = entrada.nextLine();
		entrada.close();
		diaSemana.toLowerCase().trim();
		if(diaSemana.equals("domingo")) {
			System.out.println("1° dia da semana");
		}else if(diaSemana.equals("segunda")) {
			System.out.println("2° dia da semana");
		}else if(diaSemana.equals("terça") || diaSemana.equals("terca")) {
			System.out.println("3° dia da semana");
		}else if(diaSemana.equals( "quarta")) {
			System.out.println("4° dia da semana");
		}else if(diaSemana.equals( "quinta")) {
			System.out.println("5° dia da semana");
		}else if(diaSemana.equals("sexta")) {
			System.out.println("6° dia da semana");
		}else if(diaSemana.equals("sabado") || diaSemana.equals("sábado")) {
			System.out.println("7° dia da semana");
		}else {
			System.out.println("DIA INVALIDO!");
		}
		

	}

}
