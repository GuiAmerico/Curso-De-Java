package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class CriandoStrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String txt = "Olá mundo";
//		Consumer<String> print = System.out::println;
//		print.accept(txt);
//				
		Stream<String> langs = Stream.of("Java","JavaScript","C#");
		Consumer<String> print = System.out::println;
		langs.forEach(print);
		
		String[] outrasLangs = {"Assembly", "Lua", "Python"};
		Stream.of(outrasLangs).forEach(print);;
		
		String[] maisLangs = {"Go", "Cobol", "PHP"};
		Arrays.stream(maisLangs).forEach(print);;
		
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		List<String> maisLinguasAinda = Arrays.asList("C", "Kotlin", "Ruby");
		maisLinguasAinda.stream().forEach(print);
		
		maisLinguasAinda.parallelStream().forEach(print);
		
//		Stream.generate(() -> "a").forEach(print);
		//Stream.iterate(0, n -> n+1).forEach(print);
	}

}
