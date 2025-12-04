package boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Inicializar la lista con un tamaño de 5 
        double lista[] = new double[10];
        int n =0; 

        for (int i =1; i<= lista.length; i++) {
        	System.out.println("Introduce el número "+ i+ ":");
        	lista[i-1]=sc.nextDouble();
        }
        
        Arrays.sort(lista);
        
        
        for (int i=0;i<=lista.length;i++) {
        	n+= lista[i];
        	if (lista[i] == lista[0]) {
        		System.out.println("Número min: " + lista[i]);
        	}else if (lista[i] == lista[9]) {
        		System.out.println("Número max: " + lista[i]);
        	}
        }
        

        // Imprimir lista
        System.out.println("Suma de los números: "+n);
        
        sc.close();
	}

}
