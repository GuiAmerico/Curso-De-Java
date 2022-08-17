package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 53234;
		long pontosAcumluados = 2_134_845_223;
		
		float salario = 11_445.44F;
		double vendasAcumuladas =2_345_564.32;
		
		
		boolean estaDeFerias = false; // false
		boolean trabalhaBem = true;
		
		char status = 'A';
		
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumluados / vendasAcumuladas);
		System.out.println(id + " : ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Trabalha bem? " + trabalhaBem);
		System.out.println("Status: " + status);
		
		
		
	}

}
