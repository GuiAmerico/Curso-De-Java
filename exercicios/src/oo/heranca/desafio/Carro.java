package oo.heranca.desafio;

public class Carro {
	
	double veloAtual;
	final int VELOCIDADE_MAXIMA;
	
	Carro(int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(veloAtual + 5 < VELOCIDADE_MAXIMA) {
			this.veloAtual += 5;
		}else {
			this.veloAtual = VELOCIDADE_MAXIMA;
		}
	}
	
	void freiar() {
		if(veloAtual >= 5) {
			this.veloAtual -= 5;
		}
	}

}
