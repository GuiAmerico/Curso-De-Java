package oo.composicao;

import java.util.ArrayList;

public class Curso {
	
	Curso(String nome){
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome;
	}
	
	
	final String nome;
	final ArrayList<Aluno> alunos = new ArrayList<>();
	
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
		}
}
