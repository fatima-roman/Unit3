package boletin5string;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String contrasenia; 
		String contraseniaIntento; 
		String mayorMenor; 
		boolean acierto = true; 
		
		System.out.print("Jugador 1 introduce la contraseña: ");
		contrasenia = sc.next();
		
		while(acierto) {
			System.out.println("\nJugador 2 adivina la contraseña: ");
			contraseniaIntento = sc.next();
			
			if (contrasenia.length()>contraseniaIntento.length()) {
				mayorMenor = " menor";
			}else {
				mayorMenor = " mayor";
			}
			
			if (contrasenia.equalsIgnoreCase(contraseniaIntento)) {
				System.out.println("Has acertado :)");
				acierto = false; 
			}else {
				System.out.println("Has fallado la longitud de tu contraseña es " +
			(mayorMenor.equalsIgnoreCase(" menor")?contrasenia.length()-contraseniaIntento.length():contraseniaIntento.length()-contrasenia.length())
			+ " letras" + mayorMenor);
			}
			
			if (contraseniaIntento.equals("SALIR")) {acierto = false;}
		}
		
		sc.close();
	}

}
