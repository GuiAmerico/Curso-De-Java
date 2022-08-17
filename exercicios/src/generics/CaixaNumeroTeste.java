package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaixaNumero<Integer> caixaA = new CaixaNumero<>();
		CaixaNumero<Float> caixaB = new CaixaNumero<>();
		CaixaNumero<Double> caixaC = new CaixaNumero<>();
		
		caixaA.guardar(123);
		caixaB.guardar(123.21f);
		caixaC.guardar(123.1223);
	}

}
