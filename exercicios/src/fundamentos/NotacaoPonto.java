package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "Texto qualquer";
		texto = texto.toLowerCase();
		System.out.println(texto);
		texto = texto.toUpperCase();
		System.out.println(texto);
		texto = texto.replace("QUALQUER", "atualizado");
		System.out.println(texto);
		texto = texto.concat("...");
		System.out.println(texto);
		texto = texto.replace("...", "!!!").toUpperCase().concat(" Valeu");
		System.out.println(texto);
	}

}
