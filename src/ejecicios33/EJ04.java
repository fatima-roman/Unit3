package ejecicios33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EJ04 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Realiza un programa que cree una lista de nombres de personas vacía. 
		 * A continuación, mostrará el siguiente menú. Atendiendo a la opción seleccionada por el usuario 
		 * el programa debe realizar la operación concreta:
			1. Añadir nuevo nombre a la lista.
			2. Elimina un nombre específico.
			3. Ordena la lista alfabéticamente.
			4. Busca si un nombre específico está en la lista.
			5. Salir.
		 */
		
		ArrayList<String>  nombres = new ArrayList<>();
		
		int eleccion =0; 
		
		do {
			System.out.println("1. Añadir nuevo nombre a la lista.\r\n"
					+ "2. Elimina un nombre específico.\r\n"
					+ "3. Ordena la lista alfabéticamente.\r\n"
					+ "4. Busca si un nombre específico está en la lista.\r\n"
					+ "5. Salir.");
			
			eleccion = sc.nextInt();
			
			if (eleccion == 1) {
				System.out.println("Introduce el nombre a añadir. ");
				String nombre = sc.next();
				if (aniadir(nombres, nombre)) {
					nombres.add(nombre);
				}
			}
			
			if (eleccion == 2) {
				System.out.println("Introduce nombre a eliminar.");
				String nombre = sc.next();
				if (eliminar(nombres, nombre)) {
					nombres.remove(nombre);
				}
			}
			
			if (eleccion == 3) {
				System.out.println("Lista ordenada. ");
				Collections.sort(nombres);
				System.out.println(nombres);
			}
			
			if (eleccion == 4) {
				System.out.println("Introduce nombre a buscar.");
				String nombre = sc.next();
				buscar(nombres, nombre);
			}
			
			System.out.println();
		}while (eleccion != 5);
		System.out.println("\n\n\nCerrando programa....");
		
				
		
	

	}
	
	public static boolean aniadir(List<String> nombres, String nombre) {
		if (nombres.contains(nombre)) {
			System.out.println("Ese nombre ya lo contiene la agenda ");
			return false; 
		} else {
			System.out.println("Nombre añadido");
			return true; 
		}

	}
	
	public static boolean eliminar(List<String> nombres, String nombre) {
		if (nombres.contains(nombre)) {
			System.out.println("Nombre eliminado");
			return true; 
		} else {
			System.out.println("Nombre no encontrado. ");
			return false; 
		}
		
	}
	
	public static boolean buscar(List<String> nombres, String nombre) {
		if (nombres.contains(nombre)) {
			System.out.println("Nombre encontrado");
			return true; 
		} else {
			System.out.println("Nombre no encontrado. ");
			return false; 
		}
		
	}
}
