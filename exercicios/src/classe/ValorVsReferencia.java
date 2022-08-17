package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // Atribuição por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		alterarPrimitivo(a);
		alterarPrimitivo(b);

		System.out.println(a + " " + b);
		
		Data d1 = new Data(24,6,2021);
		Data d2 = d1; // Atribuição por referência (Objeto)
		
		d1.dia = 25;
		d2.mes = 7;
		d1.ano = 2022;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		voltarDataParaValorPadrao(d2);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
	}
	
	static void alterarPrimitivo(double num) {
		num++;
	}
	
	static void voltarDataParaValorPadrao(Data padrao) {
		padrao.dia = 1;
		padrao.mes = 1;
		padrao.ano = 1970;
	}
}
