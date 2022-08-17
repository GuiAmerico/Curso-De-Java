package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		//Offer e Add -> adiocionam elementos na fila
		//A diferenca é o comportamento com a fila está cheia!
		
		fila.add("Ana"); // retorna false
		fila.offer("Bia");// Lança uma exceção
		fila.add("Caio");
		fila.offer("Gui");
		fila.add("Gleyce");
		fila.offer("Thanos");
		fila.add("Zezé");
		fila.offer("Mion");
		
		
		//peek e elemenet -> obter o proximo elemento sem remover
		//A diferenca é o comportamento com a fila está vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.element()); // Lança uma exceção
		
		//Pool e Remove -> obter o proximo elemento e remove
		//A diferenca é o comportamento com a fila está vazia!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); //Lança uma exceção

		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
	}

}
