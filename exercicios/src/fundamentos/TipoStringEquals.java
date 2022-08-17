package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "2";
		Scanner entrada = new Scanner(System.in);
		System.out.print(": ");
		String b = entrada.nextLine();
		
		System.out.println(a == b);
		System.out.println(a.equals(b.trim()));
		entrada.close();
	
	
	
	
	}

	
}
