package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe quantas notas deseja inserir: ");
		int qntdNotas = entrada.nextInt();
		double[] notas = new double[qntdNotas];
		double soma = 0;
		double media;
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d° nota: ", i+1);
			notas[i] = entrada.nextDouble();
		}
		
		entrada.close();
		
		for(double nota : notas) {
			soma += nota;
		}
		
		media = soma / notas.length;
		System.out.printf("A media das %s notas é de: %n %.2f", notas.length, media);
		
	}

}
