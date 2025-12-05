package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tananioValor; 
		
		System.out.println("Introduce un tamaño: ");
		tananioValor = sc.nextInt();
		
		int lista[] = new int[tananioValor];
		
		System.out.println("Introduce un valor: ");
		tananioValor = sc.nextInt();
		
		for (int i=0; i<lista.length;i++) {
			lista[i]=tananioValor;
		}
		
		System.out.println(Arrays.toString(lista));
		
		sc.close();
        
	}

}
