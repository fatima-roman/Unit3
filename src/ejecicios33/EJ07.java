package ejecicios33;

import java.util.*;

public class EJ07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TreeMap → claves ordenadas; HashSet → sin duplicados
        Map<Integer, Set<String>> mapa = new TreeMap<>();

        System.out.println("Introduce palabras (escribe 'fin' para terminar):");
        String palabra;
        while (!(palabra = sc.nextLine().trim()).equalsIgnoreCase("fin")) {
            if (!palabra.isEmpty()) {
                int longitud = palabra.length();
                // Si no existe la clave, crea un nuevo HashSet
                mapa.computeIfAbsent(longitud, k -> new HashSet<>()).add(palabra);
            }
        }

        System.out.println("\n--- Clasificación por longitud ---");
        for (Map.Entry<Integer, Set<String>> entrada : mapa.entrySet()) {
            System.out.println("Longitud " + entrada.getKey() + ": " + entrada.getValue());
        }

        sc.close();
    }
}
