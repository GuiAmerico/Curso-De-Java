package streams;

public class MediaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Media m1 = new Media().adicionar(7.8).adicionar(6.7);		
		m1.adicionar(9.6);
		Media m2 = new Media().adicionar(6.8).adicionar(7.7);		
		m1.adicionar(5.6);
		
		Media total = new Media();
		System.out.println(Media.combinar(m1, m2).getValor());
		
		System.out.println(m1.getValor());
		
		Media media = new Media();
		System.out.println(media);
	
	}

}
