package aceptaelreto;

import java.awt.event.ComponentAdapter;
import java.util.Scanner;

public class EJ144 {

	public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
		/*
		 * - = Inicio 
		 * 3 = Supr
		 * * = flecha derecha 
		 * + = Fin  
		 */
		
		String entrada; 
		String salida; 
		String txt = ""; 
		
		System.out.println("Bienvenido al teclado de Ramiro. "
				+ " \n- = Inicio "
				+ "\n+ = Fin"
				+ "\n* = Flecha derecha"
				+ "\n+ = Fin"
				+ "\nDespués de mostrar esto ya puedes escribir texto.");
		entrada = sc.next();
		txt = entrada; 
		
		for (int i = 0; i<entrada.length(); i++) {
			salida = String.valueOf(entrada.charAt(i));
			for (int j = 0; i<entrada.length(); j++) {
				if (salida.equals("-")) {
					j = 0; 
				}
				if ()
			}
			/*if (salida.equals("-")) {
				txt += String.valueOf(entrada.charAt(0));
			}else if (salida.equals("+")) {
				txt += String.valueOf(entrada.charAt(entrada.length()));
			}else if (salida.equals("3")) {
				txt += String.valueOf(entrada.charAt(entrada.length()));
			}*/
		}
		
		
		sc.close();
	}
	

}
