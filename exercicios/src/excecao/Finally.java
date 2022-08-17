package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.print(": ");
			System.out.println(20 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally...");
			entrada.close();
		}
		
		System.out.println("FIM");
	}

}
