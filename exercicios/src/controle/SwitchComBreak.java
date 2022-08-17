package controle;

public class SwitchComBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String conceito = "";
		
		int nota = 10;
		
		switch(nota) {
		case 10:
		case 9:
		case 8:
			System.out.println("Excelente!");
			break;
		case 7:
		case 6:
		case 5:
			System.out.println("Aprovado");
			break;
		
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Reprovado");
			break;
		default: System.out.println("NOTA INVALIDA!");
			
		}

	}

}
