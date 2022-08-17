package oo.heranca;

public class Jogador {
	int vida = 100;
	int x;
	int y;
	
	boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;		
		}
		
		
		return true;
	}
	
	boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(x - oponente.y);
		
		if(deltaX == 0 && deltaY == 1 || deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		}else {
			return false;
		}
		
	}

}
