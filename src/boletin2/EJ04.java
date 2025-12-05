package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lista[] = new int[8];
		int jugador = 0;

        // Recorrer cada hueco de la lista y meter un número aleatorio 
        for (int i = 0; i < lista.length; i++) {
        	System.out.println("Introduce el puntaje del jugador "+ (i+1)+ " :");
            lista[i] = sc.nextInt();
        }
        
        Arrays.sort(lista);
        
        for (int i = lista.length-1; i>0; --i) {
        	jugador++;
        	System.out.println("Jugador "+ jugador+ ": " + lista[i]);
        }
        
        sc.close();
	}

}
