package boletin4funciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor final (int) ");
		int fin = sc.nextInt();
		
		System.out.println("Introduce el valor de longitud (int) ");
		int longitud = sc.nextInt();
		
		sc.close();
		
		int[] t = rellenaPares(longitud, fin);
		System.out.println("Valores en la tabla = " + Arrays.toString(t));
		

	}
	
	public static int[] rellenaPares(int longitud, int fin) {
		  int t[] = new int[longitud];
		  Random rand = new Random();
	        for (int i = 0; i < t.length; i++) {
	            int num;
	            do {
	                num = rand.nextInt(2, fin + 1);
	            } while (num % 2 != 0);
	            t[i] = num;
	        }
	        return t;
	}
	
}


