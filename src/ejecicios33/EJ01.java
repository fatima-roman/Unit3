package ejecicios33;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EJ01 {

	public static void main(String[] args) {
		/*
		 * Implementa una aplicación que cree una lista de números enteros del 1 al 10 y luego la mezcle de forma aleatoria. 
		 * Finalmente, muestra la lista original y la lista mezclada por pantalla.
		 */

		int[] original = new int[10];
        for (int i = 0; i < original.length; i++) {
            original[i] = i + 1;
        }
        
        Integer[] copia = new Integer[10];
        for (int i = 0; i < 10; i++) {
            copia[i] = original[i];
        }
        List<Integer> listaMezclada = Arrays.asList(copia);
        Collections.shuffle(listaMezclada);
        
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Mezclada: " + Arrays.toString(copia));
	}

}
