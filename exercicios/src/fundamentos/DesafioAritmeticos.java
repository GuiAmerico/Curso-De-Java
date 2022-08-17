package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 6 * (3 + 2);
		int n1Elev = (int) Math.pow(n1, 2);
		int n1Div = n1Elev / (3*2);
		
		int n2 = (1 - 5) * (2 - 7);
		int n2Div = n2 / 2;
		int n2Elev = (int) Math.pow(n2Div, 2);
		
		int numTotal1 = n1Div - n2Elev;
		int numTotal2 = (int) Math.pow(numTotal1, 3);
		int numTotal3 = numTotal2 / (int) Math.pow(10, 3);  
		System.out.println(numTotal3);
	
	
	}

}
