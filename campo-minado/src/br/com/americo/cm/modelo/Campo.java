package br.com.americo.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import br.com.americo.cm.excecao.ExplosaoException;

public class Campo {
	private final int linha;
	private final int coluna;
	
	private boolean aberto;
	private boolean minado;
	private boolean marcado;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = this.linha != vizinho.linha;
		boolean colunaDiferente = this.coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;

		boolean linhaIgual = this.linha == vizinho.linha;
		boolean colunaIgual = this.coluna == vizinho.coluna;
		boolean paralela = linhaDiferente && colunaIgual ||
				linhaIgual && colunaDiferente;;
				
		
		if(Math.abs(this.linha - vizinho.linha) + 
		   Math.abs(this.coluna - vizinho.coluna) == 2
		   && diagonal) {
			
			vizinhos.add(vizinho);
			return true;
		
		}else if(Math.abs(this.linha - vizinho.linha) + 
				 Math.abs(this.coluna - vizinho.coluna) == 1
				 && paralela) {
			
			vizinhos.add(vizinho);
			return true;
		
		}else {
		
			return false;
		}
			
	}
	
	
	void alternarMarcacao() {
		if(!aberto) {
			
			marcado = !marcado;
			
		}
	}
	boolean abrir(){
		if(this.marcado == false && this.aberto == false) {
			aberto = true;
			
			if(minado) {
				throw new ExplosaoException();
				
			}
			
			if(vizinhacaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			
			return true;
			
		}else {
		
		return false;
		}
		
	}
	
	boolean vizinhacaSegura() {
		Predicate<Campo> minados = campo -> campo.minado == true;
		
		return vizinhos.stream().noneMatch(minados);
		
		
	}
	
	public boolean isMarcado() {
		
		return marcado;
	}
	
	void minar() {
		minado = true;	
		
	}
	public boolean isMinado() {
		return minado;
	
	}
	
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public boolean isAberto() {
			return aberto;
		
	}

	public boolean isFechado() {
		return !aberto;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	boolean objetivoAlcacado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		
		return desvendado || protegido;
	}
	
	long minasNaVizinhaca() {
		return vizinhos.stream()
				.filter(v -> v.minado)
				.count();

	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	public String toString() {
		if(marcado) {
			return "X";
		}else if(aberto && marcado){
			return "*";
		}else if(aberto && minasNaVizinhaca() > 0) {
			return Long.toString(minasNaVizinhaca());
		}else if(aberto) {
			return " ";
		}else {
			return "?";
		}
	}
}
