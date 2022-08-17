package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Gui", 10);
		Aluno a2 = new Aluno("Chris", 5.6);
		Aluno a3 = new Aluno("Math", 7.2);
		Aluno a4 = new Aluno("Joyce", 3.9);
		Aluno a5 = new Aluno("Lu", 8.7);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Predicate<Aluno> conceito = aluno ->
		aluno.nota >= 6;
		Function<Aluno, String> parabens = aluno -> "Parabéns " + aluno.nome + "! Você foi aprovado";
			
		
		alunos.stream().filter(conceito)
		.map(parabens)
		.forEach(System.out::println);;
	}

}
