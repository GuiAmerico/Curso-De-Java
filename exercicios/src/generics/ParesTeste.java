package generics;

public class ParesTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		resultadoConcurso.adicionar(1, "Gi");
		resultadoConcurso.adicionar(2, "Cabron");
		resultadoConcurso.adicionar(3, "Mammamia");
		resultadoConcurso.adicionar(1, "Gui");
		resultadoConcurso.adicionar(3, "Babu");
		resultadoConcurso.adicionar(4, "JaCabouJessica");
		resultadoConcurso.adicionar(2, "Cabra");
		
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(1));
	}

}
