package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Gui", 10);
		Aluno a2 = new Aluno("Chris", 5.6);
		Aluno a3 = new Aluno("Math", 7.2);
		Aluno a4 = new Aluno("Joyce", 3.9);
		Aluno a5 = new Aluno("Lu", 8.7);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Predicate<Aluno> aprovado = aluno -> aluno.nota >= 6;
		Function<Aluno, Double> apenasNota = aluno -> aluno.nota;
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) ->
		media.adicionar(nota);
		BinaryOperator<Media> combinarMedia = (m1,m2) -> Media.combinar(m1, m2);
		
		
		Media media = alunos.stream()
		.filter(aprovado)
		.map(apenasNota)
		.reduce(new Media(),calcularMedia, combinarMedia);
		
		System.out.println(media.getValor());
	}
}
