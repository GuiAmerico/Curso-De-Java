package classe;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa1 = new Pessoa("Gui", 80.0);
		System.out.printf("O nome da pessoa 1 é %s %ne antes de comer está pesando %.2f %n",
				pessoa1.nome, pessoa1.peso);
		Comida comida1 = new Comida("Strogonoff", 0.5);
		Comida comida2 = new Comida("Pudim",0.3);
		pessoa1.comer(comida1.pesoComida);
		pessoa1.comer(comida2.pesoComida);
		System.out.println("Após comer, meu peso atual é de: "+ pessoa1.peso); 
	}

}
