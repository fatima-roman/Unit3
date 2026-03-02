package ejercicioscolecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EJ02 {
	public static Scanner sc = new Scanner(System.in);
	public static Random rd = new Random();
	
	public static void main(String[] args) {
		/*
		 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList
		 *  y que luego calcule la suma, la media, el máximo y el mínimo de esos números. 
		 * El tamaño de la lista también será aleatorio y podrá oscilar entre 5 y 10 elementos ambos inclusive.
		 */
		
		List<Integer> lista = new ArrayList<>();
		int sumTotal=0;
		int tamLista = rd.nextInt(5,11);
		
		for(int i = 0; i<tamLista; i++) {
			lista.add(rd.nextInt(0,101));
		}
		
		for(int i : lista) {
			sumTotal += i;
		}
		
		int max = Collections.max(lista);
		int min = Collections.min(lista);
		
		System.out.println("Suma total:" + sumTotal);
		System.out.println("Media:" + (sumTotal/lista.size()));
		System.out.println("Máximo:" + max);
		System.out.println("Mínimo:" + min);
		

	}

}
