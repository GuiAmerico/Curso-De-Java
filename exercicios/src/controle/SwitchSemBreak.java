package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String faixa = "preta";
		switch(faixa.toLowerCase()) {
		case "preta": System.out.println("Sei o Bassai-Dai");
		
		case "marrom": System.out.println("Sei o Tekki Shodan");
		case "roxa": System.out.println("Sei o Heian Godan");
		case "laranja": System.out.println("Sei o Heian Yodan");
		case "verde": System.out.println("Sei o Heian Sandan");
		case "vermelha": System.out.println("Sei o Heian Nidan");
		case "amarela": System.out.println("Sei o Heian Shodan");
		//case "branca": System.out.println("Não sei nada ainda");
		//default: System.out.println("Não conheco essa faixa");
		
		}
		
		
		
	}

}
