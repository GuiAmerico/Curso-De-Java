package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); //double -> Double
		
		Integer coisaA = (Integer) caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("olá");
		
		Integer coisaB = (Integer) caixaA.abrir();
		System.out.println(coisaB);
		
	}
}
