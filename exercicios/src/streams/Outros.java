package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Gui", 10);
		Aluno a2 = new Aluno("Chris", 5.6);
		Aluno a3 = new Aluno("Math", 7.2);
		Aluno a4 = new Aluno("Joyce", 3.9);
		Aluno a5 = new Aluno("Lu", 8.7);
		Aluno a6 = new Aluno("Gui", 10);
		Aluno a7 = new Aluno("Chris", 5.6);
		Aluno a8 = new Aluno("Math", 7.2);
		Aluno a9 = new Aluno("Joyce", 3.9);
		Aluno a10 = new Aluno("Lu", 8.7);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/limit");
		alunos.stream().skip(2).limit(2).forEach(System.out::println);
		

		System.out.println("\nTakeWhile");
		alunos.stream().takeWhile(a -> a.nota >=7).forEach(System.out::println);
	
	
	
	
	
	
	}

}
