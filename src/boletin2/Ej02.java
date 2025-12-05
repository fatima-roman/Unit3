package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lista1[] = new int[10];
		int lista2[] = new int[10];

        // Recorrer cada hueco de la lista y meter un número aleatorio 
        for (int i = 0; i < lista1.length; i++) {
        	System.out.println("Introduce el número "+ (i+1));
            lista1[i] = sc.nextInt();
        }
        for (int i = 0; i < lista2.length; i++) {
        	System.out.println("Introduce el número "+ (i+11));
        	lista2[i] = sc.nextInt();
        }
        
        System.out.println("Lista 1: "+Arrays.toString(lista1));
        System.out.println("Lista 2: "+Arrays.toString(lista2));
        
        sc.close();
        
        
	}

}
