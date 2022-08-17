package excecao;

public class Basico {

	public static void main(String[] args) {
		Aluno a1 = null;
		try {
			imprimirAluno(a1);
		} catch(Exception e) {
			System.out.println("Ocorreu um erro ao tentar imprimir o aluno");
		}
		
		try {
			System.out.println(7 / 0);
		
		}catch(ArithmeticException e) {
			System.out.println("Ocorreu o erro: " + e.getMessage());

		}
		System.out.println("FIM");
	}
	
	public static void imprimirAluno(Aluno aluno) {
		
		System.out.println(aluno.nome);
		
	}

}
