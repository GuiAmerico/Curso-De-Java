package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nomes = Arrays.asList("Gui", "Ana", "Thai");
		List<Integer> nums = Arrays.asList(1, 2, 3 ,4);
		List<Boolean> vOuF = Arrays.asList(true, false, true);
		
		String ultimoNome = (String) ListaUtil.getUltimo1(nomes);
		Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
		
		System.out.println(ultimoNome);
		System.out.println(ultimoNumero);
		
		Boolean ultimoLogico = ListaUtil.getUltimo2(vOuF);
		System.out.println(ultimoLogico);

	}

}
