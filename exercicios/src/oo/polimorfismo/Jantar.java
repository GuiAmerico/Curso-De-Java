package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa esfomeado = new Pessoa(88.9);
		
		Arroz arroz = new Arroz(0.40);
		Feijao feijao = new Feijao(0.30);
		Sorvete sorvete = new Sorvete(0.60);
		Carne carne = new Carne(0.30);

		System.out.println(esfomeado.getPeso());
		
		esfomeado.comer(arroz);
		esfomeado.comer(feijao);
		esfomeado.comer(sorvete);
		esfomeado.comer(carne);
		System.out.println(esfomeado.getPeso());
	}

}
