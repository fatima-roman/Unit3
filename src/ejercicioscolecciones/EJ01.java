package ejercicioscolecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		/*
		 * Crear una lista de números enteros positivos introducidos por consola hasta que se introduzca uno negativo. 
		 * A continuación, recorrer la lista y mostrar por pantalla los índices de los elementos de valor par.
		 */
		Scanner sc = new Scanner (System.in);
		List<Integer> lista = new ArrayList<>();
		int n;
		do {
			System.out.println("Introduce un número");
			n = sc.nextInt();
			if (n >= 0) {
				lista.add(n);
			}
		}while(n>=0);
		
		System.out.println();
		
		for(int i: lista) {
			System.out.println(i);
		}
		
		sc.close();
	}
	
}
