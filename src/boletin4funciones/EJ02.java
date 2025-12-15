package boletin4funciones;

import java.util.Arrays;
import java.util.Random;

public class EJ02 {

	public static void main(String[] args) {
		Random rand = new Random();
		int t[] = new int[3];
		
		for (int i = 0; i< t.length; i++) {
			t[i] = rand.nextInt(1,10);
		}
		System.out.println("Valores en la tabla = " + Arrays.toString(t));
		
		int valorMax = maximo(t);
		System.out.println("V max= " + valorMax);

	}
	
	public static int maximo(int[]t) {
		if (t == null ) {throw new IllegalArgumentException();}
		if (t.length == 0 ) {throw new IllegalArgumentException();}
		Arrays.sort(t);
		int valorMax = t[t.length-1];
		return valorMax;
	}
	
		
	

}
