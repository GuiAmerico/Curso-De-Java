 package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		double nota;
		double soma = 0;
		double media;
		String aluno = "";
		int contador = 0;
		while(!aluno.equalsIgnoreCase("nao")) {
			System.out.print("Digite a nota do " + ++contador + "º aluno: ");
			nota = entrada.nextDouble();
			if(nota >= 0 && nota <=10) { 
				
				soma += nota;
			}else {
				System.out.println("NOTA INVÁLIDA!");
				--contador;
			}
			System.out.print("Quer adicionar mais um aluno?");
			aluno = entrada.next();
		}
		entrada.close();
		media = soma / contador;
		System.out.print(media);
	}

}
