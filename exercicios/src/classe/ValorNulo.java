package classe;

public class ValorNulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = ""; // Valor vazio
		System.out.println(s1.concat("=-=-=-=-=-=-=-=-=-=-=-=-=-")); // Vai Funcionar
		
		
		String s2 = null;
		System.out.println(s2.concat("!~!~!~!~!~!~!~!")); // Não vai funcionar

	}

}
