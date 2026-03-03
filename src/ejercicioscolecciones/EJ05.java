package ejercicioscolecciones;

import java.util.LinkedHashSet;
import java.util.Set;

public class EJ05 {

	public static void main(String[] args) {
		/*
		 * Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres, que se insertarán en una colección,
		 *  de forma que se conserve el orden de inserción y que no puedan repetirse.
		 * Al final, la colección se mostrará por pantalla.
		 */
		
		String fin = "fin";
		String finaliza;
		Set<String> lista = new LinkedHashSet<>();
		do {
			System.out.println("Introduzaca nombres (fin para terminar):");
			finaliza = EJ02.sc.next();
			if (!finaliza.equalsIgnoreCase(fin)) {
				lista.add(finaliza);
			}
		}while(!fin.equalsIgnoreCase(finaliza));

		System.out.println(lista);
	}

}
