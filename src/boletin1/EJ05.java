package boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] lista = new double[10];
		double n = 0;

		// Leer números
		for (int i = 0; i < lista.length; i++) {
		    System.out.println("Introduce el número " + (i + 1) + ":");
		    lista[i] = sc.nextDouble();
		}

		// Ordenar
		Arrays.sort(lista);

		// Sumar y detectar min/max
		for (int i = 0; i < lista.length; i++) {
		    n += lista[i];
		}

		System.out.println("Número mínimo: " + lista[0]);
		System.out.println("Número máximo: " + lista[lista.length - 1]);
		System.out.println("Suma de los números: " + n);

		sc.close();

	}

}
