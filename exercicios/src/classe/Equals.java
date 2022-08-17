package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Math";
		u1.email = "Math123@hotmail.com";
		

		Usuario u2 = new Usuario();
		u2.nome = "Math";
		u2.email = "Math123@hotmail.com";
		

		System.out.println(u1 == u2); // false
		System.out.println(u1.equals(u2)); // antes da definição do metodo: false
		System.out.println(u1.equals(u2)); // depois da definição do metodo: true
		
		
		//System.out.println(u1.nome == u2.nome);
		
	}

}