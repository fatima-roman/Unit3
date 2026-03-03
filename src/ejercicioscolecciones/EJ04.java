package ejercicioscolecciones;

import java.util.TreeSet;

public class EJ04 {

	public static void main(String[] args) {
		/*
		 * Implementa una aplicación donde se insertan 20 números enteros aleatorios distintos, menores que 100, en una colección.
		 * Hay que asegurarse de que se guardan 20.
		 * Deben guardarse ordenados a medida que se vayan generando, y se mostrará la colección resultante por pantalla.
		 */
		TreeSet<Integer> lista = new TreeSet<>();
		final int TAM_LIST= 20; 
		for (int i =0; i< TAM_LIST; i++) {
			lista.add(EJ02.rd.nextInt(0,100));
		}
		
		System.out.println(lista);
		
	}

}
