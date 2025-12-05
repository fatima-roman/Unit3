package boletin1;

import java.util.Scanner;

public class EJ07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lista[] = new int[12];
		String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        // Recorrer cada hueco de la lista y meter un número aleatorio 
        for (int i = 0; i < lista.length; i++) {
        	System.out.println("Introduce la temperatura del mes "+ (i+1));
            lista[i] = sc.nextInt();
        }
        
        for (int i =0; i<lista.length;i++) {
        	System.out.print(meses[i] + ":");
        	for (int o = lista[i];o>0;--o) {
        		System.out.print("*");
        	}
        	System.out.print(" "+lista[i]);
        	System.out.println();
        }
        
        sc.close();
	}

}
