package ejercicioscolecciones;

import java.util.TreeMap;

public class EJ07 {

	public static void main(String[] args) {
		/*
		 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras (con su correspondiente traducción).
		 *  Utiliza un objeto de la clase TreeMap para almacenar las parejas de palabras. El programa mostrará un menú con dos opciones:
		 *  1. Inserta palabra. Debe solicitar una palabra en español y su traducción al inglés.
		 *  2. Busca palabra. Pregunta por una palabra en español y devuelve su traducción en inglés.
		 *  3. Salir. Termina el programa.
		 */
		
		TreeMap<String, String> diccionario = new TreeMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("escuela", "school");
        diccionario.put("agua", "water");
        diccionario.put("comida", "food");
        diccionario.put("ciudad", "city");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("niño", "child");
        diccionario.put("niña", "girl");
        diccionario.put("hombre", "man");
        diccionario.put("mujer", "woman");
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("verde", "green");
        diccionario.put("amarillo", "yellow");

        int opc = 0; 

        do {
            System.out.println("1. Inserta palabra.\r\n"
            		+ "2. Busca palabra.\r\n"
            		+ "3. Salir.");
            opc = EJ02.sc.nextInt();
			if (opc == 1) {
				System.out.println("Introduce la palabra");
				String nPalabra = EJ02.sc.next();
				System.out.println("Introduce la traducción");
				String nPalabra1 = EJ02.sc.next();
				diccionario.put(nPalabra, nPalabra1);
			}
			if (opc == 2) {
				System.out.println("Palabra a buscar:");
				String bPalabra = EJ02.sc.next();
				System.out.println(diccionario.get(bPalabra) == null ? "No encontrada" : diccionario.get(bPalabra));
			}
        }while(opc != 3); 
        
        System.out.println("Programa finalizado.");
        
        
		
		

	}

}
