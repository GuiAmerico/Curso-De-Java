package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Luci", "Gui", "Ana", "Jane");
		
//		for (int i = 0; i<aprovados.size(); i++) {
//		
//			System.out.println(aprovados.get(i));
//		}
//		
		
		//aprovados.forEach(aprovado  -> System.out.println(aprovado) );
		//aprovados.forEach(System.out::println);
		
//		Iterator<String> it = aprovados.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}

}
