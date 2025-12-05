package boletin2;

import java.util.Random;
import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int lista[] = new int[1000];
		int n=0;
		int n2;

        // Recorrer cada hueco de la lista y meter un número aleatorio 
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rand.nextInt(0,100);
        }
        
        System.out.println("Introduce un número: ");
        n2 = sc.nextInt();
        
        for (int i = 0; i<lista.length;i++) {
        	if (lista[i]==n2) {n++;}
        }
        if(n==0) {System.out.println("El valor no existe en la lista. ");
        }else {
        	System.out.println("El valor esta en la lista " + n+ " veces.");
        }
        
        
        sc.close();
	}

}
