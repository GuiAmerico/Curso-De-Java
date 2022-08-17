package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Gui");
		lista.add(new Usuario("Jojo"));
		lista.add(new Usuario("Karen"));
		lista.add(new Usuario("Carla"));
		lista.add(new Usuario("Jordan"));
		lista.add(new Usuario("Menino Ney"));
		
		System.out.println("~~~~~~~" + lista.get(2).nome + " ~~~~~~");
		
		for(Usuario u : lista) {
			System.out.println(u.nome);
		}
		
		
		
		lista.remove(2);
		
		
		
		
	}

}
