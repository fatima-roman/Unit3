package ejercicioscolecciones;

import java.util.HashSet;
import java.util.Set;

public class EJ06 {

	public static void main(String[] args) {
		/*
		 * Repite la actividad anterior de forma que se inserten los nombres manteniendo el orden alfabético.
		 */

		String fin = "fin";
		String finaliza;
		Set<String> lista = new HashSet<>();
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
