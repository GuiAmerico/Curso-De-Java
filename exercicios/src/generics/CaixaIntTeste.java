package generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(123);
		Integer coisaA = caixaA.abrir();
		
		System.out.println(coisaA);
	}

}
