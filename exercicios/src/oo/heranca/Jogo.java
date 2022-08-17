package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heroi heroi = new Heroi();
		
		heroi.x = 10;
		heroi.y = 10;
		
		Monstro monstro = new Monstro();
		
		monstro.x = 10;
		monstro.y = 11;
		
		System.out.println(heroi.vida);
		System.out.println(monstro.vida);
		
		heroi.atacar(monstro);
		System.out.println();
		
		System.out.println("Vida do herói -> " + heroi.vida);
		System.out.println("Vida do monstro -> " + monstro.vida);
		
	}

}
