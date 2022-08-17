package lambdas;

public class CalcTeste2 {
	public static void main(String[] args) {
		Calculo calculo = (x, y) -> {return x + y ;};
		System.out.println(calculo.executar(4,6));
		
		calculo = (a, b) -> {return a * b;};
		System.out.println(calculo.executar(2, 4));
		
		System.out.println(Calculo.legal());
	}
}
