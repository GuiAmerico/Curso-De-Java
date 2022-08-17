package excecao;

public class CheckadaVsNaoCheckada {

	public static void main(String[] args) {
		// Não é obrigatorio tratar o erro
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//É obrigatorio tratar o erro
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("FIM");
	}
	//Exceção NÃO checada ou NÃO verificada
	private static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #01");
	}
	// Exceção checada ou verificada
	private static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro #02");
	}

	
}
