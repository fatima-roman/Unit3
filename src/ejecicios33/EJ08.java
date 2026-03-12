package ejecicios33;

import java.util.*;

public class EJ08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Clave: categoría, Valor: lista de tareas
        Map<String, List<String>> tareas = new HashMap<>();
        int eleccion;

        do {
            System.out.println("\n1. Añadir tarea.");
            System.out.println("2. Eliminar tarea.");
            System.out.println("3. Listar tareas de categoría.");
            System.out.println("4. Listar todas las categorías.");
            System.out.println("0. Salir.");

            eleccion = Integer.parseInt(sc.nextLine().trim());

            switch (eleccion) {
                case 1 -> {
                    System.out.print("Categoría (ej: trabajo, personal): ");
                    String categoria = sc.nextLine().toLowerCase();
                    System.out.print("Tarea: ");
                    String tarea = sc.nextLine();
                    tareas.computeIfAbsent(categoria, k -> new ArrayList<>()).add(tarea);
                    System.out.println("Tarea añadida a '" + categoria + "'.");
                }
                case 2 -> {
                    System.out.print("Categoría: ");
                    String categoria = sc.nextLine().toLowerCase();
                    System.out.print("Tarea a eliminar: ");
                    String tarea = sc.nextLine();
                    List<String> lista = tareas.get(categoria);
                    if (lista != null && lista.remove(tarea)) {
                        System.out.println("Tarea eliminada.");
                    } else {
                        System.out.println("Tarea o categoría no encontrada.");
                    }
                }
                case 3 -> {
                    System.out.print("Categoría: ");
                    String categoria = sc.nextLine().toLowerCase();
                    List<String> lista = tareas.get(categoria);
                    if (lista == null || lista.isEmpty()) {
                        System.out.println("Sin tareas en '" + categoria + "'.");
                    } else {
                        System.out.println("Tareas [" + categoria + "]: " + lista);
                    }
                }
                case 4 -> {
                    if (tareas.isEmpty()) {
                        System.out.println("No hay categorías registradas.");
                    } else {
                        tareas.forEach((cat, lista) ->
                            System.out.println("[" + cat + "] → " + lista));
                    }
                }
            }
        } while (eleccion != 0);
        System.out.println("Cerrando programa...");
        sc.close();
    }
}
