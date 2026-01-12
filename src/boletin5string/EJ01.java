package boletin5string;

public class EJ01 {

	public static void main(String[] args) {
		String frase1 = "Introducir por teclado dos frases e indicar cuál de ellas es la más corta";
		String frase2 = " es decir, la que contiene menos caracteres.";
		
		if (frase1.length()>frase2.length()) {
			System.out.println("La primera frase es más larga.");
		}else {
			System.out.println("La segunda frase es más larga.");
		}
		
	}

}
