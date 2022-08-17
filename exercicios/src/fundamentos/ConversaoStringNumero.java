package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor1 = JOptionPane.
				showInputDialog
				("Digite o primeiro numero: ");
		String valor2 = JOptionPane.
				showInputDialog
				("Digite o segundo numero: ");
	
		
		double n1 = Double.parseDouble(valor1);
		double n2 = Double.parseDouble(valor2);
		
		double soma = n1 + n2;
		
		System.out.println(soma);
		
		
		
		
		
		
		
	}

}
