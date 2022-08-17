package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("oi");
		double raio = 5.3;
		final double PI = 3.1415;
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 3.7;
		area = PI * raio * raio;
		
		System.out.println("A área calculada foi de: " + area + "m2.");
	}

}
