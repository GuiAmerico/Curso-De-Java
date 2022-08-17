package arrays;

import java.util.Arrays;

public class Exercicio01 {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.6;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 5.6;
		
		//System.out.println( Arrays.toString(notasAlunoA));
		double acumuladorAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			acumuladorAlunoA += notasAlunoA[i];
		}
		System.out.println(acumuladorAlunoA / notasAlunoA.length);
		
		double[] notasAlunoB = {6.7, 7.4, 9.0};
		
		double acumuladorAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			acumuladorAlunoB += notasAlunoB[i];
		}
		System.out.println(acumuladorAlunoB / notasAlunoB.length);
	
	}

}
