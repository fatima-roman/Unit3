package boletin4funciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); 
		
		System.out.println("Introduce el valor clave (int del 1 al 100):");
		int clave = sc.nextInt();
		System.out.println("Introduce el valor de longitud (int):");
		int longitud = sc.nextInt();
		
		sc.close();
		int tabla[] = new int[longitud];
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rand.nextInt(1, 10);
		}
		
		int[] resultado = buscar(tabla, clave);
		System.out.println("Posiciones encontradas: ");
		System.out.print(Arrays.toString(resultado) + " ");
		
	}
	
	public static int[] buscar(int t[], int clave) {
	    if (t == null || t.length == 0) {
	        throw new IllegalArgumentException("Array no válido");
	    }
	    int contador = 0;
	    for (int i = 0; i < t.length; i++) {
	        if (t[i] == clave) {
	            contador++;
	        }
	    }

	    if (contador == 0) {
	        return new int[]{-1};
	    }

	    int[] posiciones = new int[contador];
	    int u = 0;
	    for (int i = 0; i < t.length; i++) {
	        if (t[i] == clave) {
	            posiciones[u++] = i;
	        }
	    }

	    return posiciones;
	}


}
