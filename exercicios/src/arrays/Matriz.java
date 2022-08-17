package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de alunos: ");
		int qntdAlunos = entrada.nextInt();
		System.out.print("Informe a quantidade de notas por aluno: ");
		int qntdNotas = entrada.nextInt();
		double total = 0;
		
		double[][] notasTurma = new double[qntdAlunos][qntdNotas];
		
		for (int i = 0; i < notasTurma.length; i++) {
			for (int j = 0; j < notasTurma.length; j++) {

				System.out.printf("Digite a %d° nota do %dº aluno: ", j+1, i+1);
				notasTurma[i][j] += entrada.nextDouble();
				total += notasTurma[i][j];
			}
		}
		
		
		double mediaTurma = total / (qntdAlunos *qntdNotas);
		System.out.printf("%nA media da turma foi: %.1f %n%n", mediaTurma);
		
		for (int i = 0; i < notasTurma.length; i++) {
			System.out.printf("Notas do %d° aluno: ", i+1);
			for (int j = 0; j < notasTurma.length; j++) {
				System.out.print(notasTurma[i][j] + " ");
			}
			System.out.println();
		}
		
//		
//		for(double[] arrayNotas : notasTurma) {
//			System.out.println(Arrays.toString(arrayNotas));
//		}
		
		entrada.close();
	}

}
