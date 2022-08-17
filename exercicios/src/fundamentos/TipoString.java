package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Olá pessoal".charAt(2));
		
		String texto = "Boa Tarde";
		
		System.out.println(texto.concat("!!!"));
		
		System.out.println(texto.startsWith("Boa")); //True
		System.out.println(texto.startsWith("boa")); //False
		System.out.println(texto.endsWith("Tarde")); //True
		System.out.println(texto.length());
		System.out.println(texto.equalsIgnoreCase("boa tarde")); //True
		
		String nome = "Gui";
		String sobrenome = "Américo";
		int idade = 18;
		double salario = 4327.23421;
		
		//System.out.println("O aluno %s %s tem %d anos \ne quer ganhar %.2f",
		//		nome, sobrenome, idade, salario);
	
	}

}
