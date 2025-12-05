package boletin2;

import java.util.Arrays;
import java.util.Random;

public class EJ03 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int lista[] = new int[30];

        // Recorrer cada hueco de la lista y meter un número aleatorio 
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rand.nextInt(0,10);
        }
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));
	}

}
