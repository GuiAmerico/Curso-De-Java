package classe;

public class DataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data nascimento1 = new Data();
		
		int d = nascimento1.dia = 28;
		int m = nascimento1.mes = 03;
		int a = nascimento1.ano = 2004;
		
		System.out.println("Eu nasci em " + d +"/"+ m + "/"+ a);
		System.out.println(nascimento1.obterDataFormatada());
		System.out.println("Usando 'String.Format' "+ nascimento1.obterDataFormat());
		
		System.out.printf("%n %n %n");
		
		Data nascimento2 = new Data();
		System.out.println(nascimento2.obterDataFormatada());
		Data nascimento3 = new Data(7,6,1981);
		System.out.println(nascimento3.obterDataFormat());
		
		
	}

}
