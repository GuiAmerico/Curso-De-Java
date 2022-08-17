package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer,String> usuarios = new HashMap<>();
		usuarios.put(1,"Guerrero");
		usuarios.put(2,"Escobar");
		usuarios.put(3,"Nacho");
		usuarios.put(4,"Hermano");
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Nacho"));
		System.out.println(usuarios.containsValue("Zaracho"));
		
		System.out.println();
		
		System.out.println(usuarios.get(2));
		System.out.println(usuarios.get(1));
		System.out.println();
		for(int chave : usuarios.keySet()){
			System.out.println(chave);
		}
		System.out.println();
		
		for(String valor : usuarios.values()) {
			
			System.out.println(valor);
		}
		System.out.println();
		
		for(Entry<Integer,String> keysAndValues : usuarios.entrySet()) {
				System.out.print(keysAndValues.getKey()+ ": ");
				System.out.println(keysAndValues.getValue());
		}
		
		
	}

}
