package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Guilherme");
		Aluno aluno2 = new Aluno("Math");
		Aluno aluno3 = new Aluno("Isa");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("JavaScript");
		Curso curso3 = new Curso("React.JS");
		
		aluno1.adicionarCurso(curso1);
		curso1.adicionarAluno(aluno2);
		
		aluno2.adicionarCurso(curso1);
		aluno2.adicionarCurso(curso3);
		
		curso2.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno3);
		
		System.out.println(aluno1.cursos);
		System.out.println();
		for(Curso curso : aluno1.cursos) {
			
			System.out.println(curso.nome);
		}
	
		
	}

}
