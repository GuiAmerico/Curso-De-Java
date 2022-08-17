package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamborghini lambo = new Lamborghini(315);
		lambo.ligarTurbo();
		lambo.acelerar();
		lambo.acelerar();
		lambo.acelerar();
		lambo.acelerar();
		lambo.desligarTurbo();
		lambo.acelerar();
		lambo.acelerar();
		lambo.acelerar();
		lambo.acelerar();
		lambo.acelerar();
		lambo.acelerar();
		System.out.println(lambo.veloAtual);
		lambo.freiar();
		lambo.freiar();
		lambo.freiar();
		lambo.freiar();
		System.out.println(lambo.veloAtual);
		
		System.out.println();
		
		Corsa corsa = new Corsa(120);
		corsa.acelerar();
		corsa.acelerar();
		corsa.acelerar();
		corsa.acelerar();
		corsa.acelerar();
		corsa.acelerar();
		
		System.out.println(corsa.veloAtual);
	}

}
