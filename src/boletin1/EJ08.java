package boletin1;

import java.util.Random;
import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		
		int lista[] = new int[100];
		int n;

        // Recorrer cada hueco de la lista y meter un número aleatorio 
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rand.nextInt(1,11);
        }
        
        System.out.println("Introduce un número del 1 al 10");
        n = sc.nextInt();
        
        for (int i=0; i<lista.length;i++ ) {
        	if (lista[i] == n) {
        		System.out.println("El valor " + n+ " esta en la posisción " + i);
        	}
        }
        
        sc.close();
	}

}
