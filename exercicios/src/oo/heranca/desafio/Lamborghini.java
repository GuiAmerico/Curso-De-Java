package oo.heranca.desafio;

public class Lamborghini extends Carro implements Esportivo, Luxo{
	public int delta = 15;
	public boolean arLigado;
	Lamborghini(int veloMaxima){
		super(veloMaxima);
	}
	
	void acelerar() {
			if(veloAtual < 315) {
				this.veloAtual += delta;
			}
	}

	@Override
	public void ligarTurbo() {
		delta = 35;
		
	}

	@Override
	public void desligarTurbo() {
		delta = 15;
	}

	@Override
	public void ligarAr() {
		arLigado = true;
		
	}

	@Override
	public void desligarAr() {
		// TODO Auto-generated method stub
		arLigado = false;
	}
}
