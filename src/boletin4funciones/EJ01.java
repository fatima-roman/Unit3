package boletin4funciones;

public class EJ01 {

	public static void main(String[] args) {
		int[] tabla = {1,10,5};
		
		int sumaTotal = sumarTabla(tabla);
		System.out.println("La suma de los números es: " + sumaTotal);
		
		
	}
	public static int sumarTabla(int[]tabla) {
		int sumaTotal =0;
		if (tabla == null ) {throw new IllegalArgumentException();}
		for (int i =0; i<tabla.length; i++) {
			sumaTotal += tabla[1];
		}
		return sumaTotal;
	}

}
