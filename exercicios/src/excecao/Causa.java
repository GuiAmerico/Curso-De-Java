package excecao;

public class Causa {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Gui", 8);
		metodoA(a1);
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}

	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}

	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno está nulo");
		}
		System.out.println(aluno.nome);
	}

}
