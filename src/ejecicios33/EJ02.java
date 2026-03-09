package ejecicios33;

import java.util.LinkedHashSet;
import java.util.Random;

public class EJ02 {
	public static void main(String[] args) {
		/*
		 * Implementa una aplicación que genere 10 números enteros aleatorios distintos en el rango del 1 al 20 
		 * y los guarde en una implementación que no permita que se dupliquen números en el caso de que se repitan 
		 * y que garantice un orden basado en inserción.
		 * Luego, muestra los números únicos generados por pantalla.
		 */

		 	LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
		 	Random rand = new Random();
	        
	        while (numeros.size() < 10) {
	            int num = rand.nextInt(20) + 1;
	            numeros.add(num);
	        }
	        
	        System.out.println("Números únicos (orden inserción):");
	        for (int num : numeros) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	}

}
