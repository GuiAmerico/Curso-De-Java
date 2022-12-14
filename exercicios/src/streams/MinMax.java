package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Gui", 10);
		Aluno a2 = new Aluno("Chris", 5.6);
		Aluno a3 = new Aluno("Math", 7.2);
		Aluno a4 = new Aluno("Joyce", 3.9);
		Aluno a5 = new Aluno("Lu", 8.7);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		
		};
		
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			if(aluno1.nota < aluno2.nota) return 1;
			if(aluno1.nota > aluno2.nota) return -1;
			return 0;
		
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());

		System.out.println(alunos.stream().max(piorNota).get());
			
		
		
	
	}


}
