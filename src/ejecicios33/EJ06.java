package ejecicios33;

import java.util.*;

public class EJ06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Clave: nombre, Valor: lista de teléfonos
        Map<String, List<String>> libreta = new HashMap<>();
        int eleccion;

        do {
            System.out.println("\n1. Añadir persona.");
            System.out.println("2. Añadir teléfono a persona.");
            System.out.println("3. Mostrar teléfonos de persona.");
            System.out.println("4. Eliminar teléfono de persona.");
            System.out.println("5. Eliminar persona.");
            System.out.println("0. Salir.");

            eleccion = Integer.parseInt(sc.nextLine().trim());

            switch (eleccion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    if (libreta.containsKey(nombre)) {
                        System.out.println("La persona ya existe.");
                    } else {
                        libreta.put(nombre, new ArrayList<>());
                        System.out.println("Persona añadida.");
                    }
                }
                case 2 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    // computeIfAbsent crea la lista si la persona no existía
                    libreta.computeIfAbsent(nombre, k -> new ArrayList<>()).add(telefono);
                    System.out.println("Teléfono añadido.");
                }
                case 3 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    List<String> telefonos = libreta.get(nombre);
                    if (telefonos == null) {
                        System.out.println("Persona no encontrada.");
                    } else if (telefonos.isEmpty()) {
                        System.out.println("Sin teléfonos registrados.");
                    } else {
                        System.out.println("Teléfonos de " + nombre + ": " + telefonos);
                    }
                }
                case 4 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono a eliminar: ");
                    String telefono = sc.nextLine();
                    List<String> telefonos = libreta.get(nombre);
                    if (telefonos != null && telefonos.remove(telefono)) {
                        System.out.println("Teléfono eliminado.");
                    } else {
                        System.out.println("Teléfono o persona no encontrado.");
                    }
                }
                case 5 -> {
                    System.out.print("Nombre a eliminar: ");
                    String nombre = sc.nextLine();
                    if (libreta.remove(nombre) != null) {
                        System.out.println("Persona eliminada.");
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                }
            }
        } while (eleccion != 0);
        System.out.println("Cerrando programa...");
        sc.close();
    }
}
