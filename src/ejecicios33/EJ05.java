package ejecicios33;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EJ05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> series = new HashMap<>();
        int eleccion;

        do {
            System.out.println("1. Agregar serie.");
            System.out.println("2. Buscar serie.");
            System.out.println("3. Eliminar serie.");
            System.out.println("4. Salir.");

            eleccion = Integer.parseInt(sc.nextLine().trim());

            if (eleccion == 1) {
                System.out.print("Nombre de la serie: ");
                String nombre = sc.nextLine();
                System.out.print("Valoración (1-10): ");
                int valoracion = Integer.parseInt(sc.nextLine().trim());
                agregar(series, nombre, valoracion);
            }

            if (eleccion == 2) {
                System.out.print("Nombre a buscar: ");
                String nombre = sc.nextLine();
                buscar(series, nombre);
            }

            if (eleccion == 3) {
                System.out.print("Nombre a eliminar: ");
                String nombre = sc.nextLine();
                eliminar(series, nombre);
            }

        } while (eleccion != 4);
        System.out.println("Cerrando programa...");
        sc.close();
    }

    public static void agregar(Map<String, Integer> series, String nombre, int valoracion) {
        if (series.containsKey(nombre)) {
            System.out.println("La serie ya existe.");
        } else {
            series.put(nombre, valoracion);
            System.out.println("Serie añadida: " + nombre + " (valoración: " + valoracion + ")");
        }
    }

    public static void buscar(Map<String, Integer> series, String nombre) {
        if (series.containsKey(nombre)) {
            System.out.println("Serie encontrada. Valoración: " + series.get(nombre));
        } else {
            System.out.println("Serie no encontrada.");
        }
    }

    public static void eliminar(Map<String, Integer> series, String nombre) {
        if (series.remove(nombre) != null) {
            System.out.println("Serie eliminada.");
        } else {
            System.out.println("Serie no encontrada.");
        }
    }
}
