package classe;

public class Escopo {
	int a = 3;
	
	static int b = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Escopo n1 = new Escopo();
		System.out.println(n1.a);
		System.out.println(b);
		
	}

}
