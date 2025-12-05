package boletin1;

import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lista[] = new int[8];

        // Recorrer cada hueco de la lista y meter un número aleatorio 
        for (int i = 0; i < lista.length; i++) {
        	System.out.println("Introduce el número "+ (i+1));
            lista[i] = sc.nextInt();
        }
        
        for (int i =0; i< lista.length; i++) {
        	if (lista[i] % 2 ==0) {
        		System.out.println(lista[i] + " par");
        	}else {
        		System.out.println(lista[i] + " impar");
        	}
        }
        
        sc.close();
	}

}
