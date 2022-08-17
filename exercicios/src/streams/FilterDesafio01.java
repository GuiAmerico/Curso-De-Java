package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FilterDesafio01 {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Gui", 10);
		Aluno a2 = new Aluno("Chris", 5.6);
		Aluno a3 = new Aluno("Math", 7.2);
		Aluno a4 = new Aluno("Joyce", 3.9);
		Aluno a5 = new Aluno("Lu", 8.7);
		Aluno a6 = new Aluno("Key", 10);
		Aluno a7 = new Aluno("Junior", 8.6);
		Aluno a8 = new Aluno("Jorge", 7.2);
		Aluno a9 = new Aluno("Le", 2.9);
		Aluno a10 = new Aluno("Nana", 1.7);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
		
		Predicate<Aluno> genios = aluno -> aluno.nota >= 9 ;
		Predicate<Aluno> aprovados = aluno -> aluno.nota >= 6;
		Function<Aluno, String> parabens = aluno -> "Parabens " + aluno.nome + "! Você é um(a) gênio(a)";
		
		
		alunos.stream().filter(aprovados).filter(genios).map(parabens).forEach(System.out::println);;
	}

}
