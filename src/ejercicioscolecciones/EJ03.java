package ejercicioscolecciones;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EJ03 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que genere 30 números enteros aleatorios, con valores comprendidos entre 1 y 10.
		 * Se deben almacenar en una colección de forma ordenada. Pinta la colección por consola una vez rellena.
		 */
		
		List<Integer> lista = new LinkedList<>(); 
		
		final int TAM_LISTA = 30; 
		
		for (int i = 0; i<TAM_LISTA; i++) {
			lista.add(EJ02.rd.nextInt(1,11));
		}
		
		Collections.sort(lista);
		System.out.println(lista);
	}

}
