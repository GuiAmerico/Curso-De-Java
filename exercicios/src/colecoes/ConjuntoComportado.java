package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Gui");
		listaAprovados.add("Math");
		listaAprovados.add("Karol");
		listaAprovados.add("Kimberlly");
		
		for(String aprovado : listaAprovados) {
			
			System.out.println("Foi Aprovado(a): " + aprovado);
		}
	}

}
