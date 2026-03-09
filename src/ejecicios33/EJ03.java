package ejecicios33;

import java.lang.Character;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class EJ03 {

    public static void main(String[] args) {
    	/*
    	 * Implementa una aplicación que cuente la frecuencia de aparición de cada letra (solo los caracteres alfabéticos) 
    	 * en la siguiente cadena de texto y luego muestre el conteo por pantalla. 
    	 */
        LinkedHashMap<String, Integer> abecedario = new LinkedHashMap<>();
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (int i = 0; i < letras.length; i++) {
            abecedario.put(letras[i], 0);
        }

        String texto = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

        LinkedHashMap<String, Integer> frecuencias = sumaABC(abecedario, texto);
        print(frecuencias);
    }

    public static LinkedHashMap<String, Integer> sumaABC(LinkedHashMap<String, Integer> abecedario, String texto) {
        for (char c : texto.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {  
                String letra = String.valueOf(c);
                if (abecedario.containsKey(letra)) {
                    abecedario.put(letra, abecedario.get(letra) + 1);
                }
            }
        }
        return abecedario;
    }

    public static void print(LinkedHashMap<String, Integer> abc) {
        System.out.println("Frecuencia de letras:");
        System.out.println("=====================");
        int columna = 0;
        for (Entry<String, Integer> entry : abc.entrySet()) {
            System.out.printf("%-2s : %2d   ", entry.getKey(), entry.getValue());
            columna++;
            if (columna % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n=====================");
    }
}
