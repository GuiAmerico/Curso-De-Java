package oo.composicao;

import java.util.ArrayList;

public class Aluno {

	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<>();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome;
	}
	
	Curso obterCursoPorNome(String nome) {
		for(Curso curso : this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		
		return null;
	}
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
}
