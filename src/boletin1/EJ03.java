package boletin1;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Inicializar la lista con un tamaño de 5 
        double lista[] = new double[5];

        for (int i =1; i<= lista.length; i++) {
        	System.out.println("Introduce el número "+ i+ ":");
        	lista[i-1]=sc.nextDouble();
        }
        
        // Imprimir lista
        System.out.println("\nNúmeros en orden inverso:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(lista[i]);
        }
        
        sc.close();
	}

}
