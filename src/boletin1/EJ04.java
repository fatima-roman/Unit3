package boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Inicializar la lista con un tamaño de 5 
        double lista[] = new double[12];

        for (int i =1; i<= lista.length; i++) {
        	System.out.println("Introduce el número "+ i+ ":");
        	lista[i-1]=sc.nextDouble();
        }
        
        
        Arrays.sort(lista);
        

        // Imprimir lista
        System.out.println("Números aleatorios: " + Arrays.toString(lista));
        
        sc.close();
	}

}
