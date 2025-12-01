package boletin1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Inicializar la lista con un tamaño de 10 
        int lista[] = new int[10];

        // Recorrer cada hueco de la lista y meter un número aleatorio 
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rand.nextInt(1,101); 
        }

        // Imprimir lista
        System.out.println("Números aleatorios: " + Arrays.toString(lista));
        
        sc.close();
		
	}

}
