package lambdas;

public class CalcTeste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(5, 4));

		calculo = new Multiplicacao();
		System.out.println(calculo.executar(5, 4));

	}

}
