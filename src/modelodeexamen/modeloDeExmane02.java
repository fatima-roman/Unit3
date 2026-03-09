package modelodeexamen;

import java.util.Scanner;
import java.util.Arrays; 

public class modeloDeExmane02 {

	
	    static String[] mensajes = {
	        "LA NIEBLA CUBRE EL PUENTE",
	        "NO MIRES DETRÁS DE LA PUERTA",
	        "EL RELOJ SUENA A MEDIANOCHE",
	        "LAS SOMBRAS SABEN TU NOMBRE",
	        "TODO MENSAJE DEJA UNA HUELLA",
	        "EL ECO REPITE LA VERDAD",
	        "ALGUIEN ESCONDE ALGO AQUÍ",
	        "NUNCA APAGUES LA RADIO"
	    };
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int opcion;
	        do {
	            mostrarMenu();
	            opcion = sc.nextInt();
	            sc.nextLine(); // consume newline
	            switch (opcion) {
	                case 1: mostrarMensajes(mensajes); break;
	                case 2: 
	                    System.out.print("Índice: ");
	                    int idx2 = sc.nextInt(); sc.nextLine();
	                    System.out.print("Letra: ");
	                    char letra = sc.nextLine().charAt(0);
	                    System.out.println("Aparece " + contarLetra(mensajes[idx2], letra) + " veces.");
	                    break;
	                case 3:
	                    System.out.print("Índice: ");
	                    int idx3 = sc.nextInt(); sc.nextLine();
	                    System.out.println("Oculto: " + extraerMensajeOculto(mensajes[idx3]));
	                    break;
	                case 4:
	                    System.out.print("Palabra: ");
	                    String palabra = sc.nextLine();
	                    System.out.println("En " + buscarMensajesConPalabra(mensajes, palabra) + " mensajes.");
	                    break;
	                case 5:
	                    System.out.print("Índice: ");
	                    int idx5 = sc.nextInt();
	                    if (marcarAlterado(mensajes, idx5)) {
	                        System.out.println("Marcado.");
	                    } else {
	                        System.out.println("Error.");
	                    }
	                    break;
	                case 6:
	                    System.out.print("Índice: ");
	                    int idx6 = sc.nextInt(); sc.nextLine();
	                    System.out.println("Más larga: " + palabraMasLarga(mensajes[idx6]));
	                    break;
	                case 7: mostrarEstadisticas(mensajes); break;
	                case 8: System.out.println("Adiós."); break;
	                default: System.out.println("Opción inválida.");
	            }
	        } while (opcion != 8);
	        sc.close();
	    }
	    
	    static void mostrarMenu() {
	        System.out.println("\nARCHIVO DE LOS ECOS\n1. Mostrar mensajes\n2. Contar letra\n3. Extraer oculto\n4. Buscar palabra\n5. Marcar alterado\n6. Palabra más larga\n7. Estadísticas\n8. Salir");
	    }
	    
	    static void mostrarMensajes(String[] mensajes) {
	        for (int i = 0; i < mensajes.length; i++) {
	            System.out.println(i + ". " + mensajes[i]);
	        }
	    }
	    
	    static boolean esIndiceValido(String[] mensajes, int indice) {
	        return indice >= 0 && indice < mensajes.length;
	    }
	    
	    static int contarLetra(String mensaje, char letra) {
	        int cont = 0;
	        for (char c : mensaje.toLowerCase().toCharArray()) {
	            if (c == Character.toLowerCase(letra)) cont++;
	        }
	        return cont;
	    }
	    
	    static String quitarEspacios(String mensaje) {
	        return mensaje.replace(" ", "");
	    }
	    
	    static String extraerMensajeOculto(String mensaje) {
	        String sinEsp = quitarEspacios(mensaje);
	        StringBuilder oculto = new StringBuilder();
	        for (int i = 0; i < sinEsp.length(); i += 2) {
	            oculto.append(sinEsp.charAt(i));
	        }
	        return oculto.toString();
	    }
	    
	    static int buscarMensajesConPalabra(String[] mensajes, String palabra) {
	        int cont = 0;
	        palabra = palabra.toLowerCase();
	        for (String m : mensajes) {
	            if (m.toLowerCase().contains(palabra)) cont++;
	        }
	        return cont;
	    }
	    
	    static boolean marcarAlterado(String[] mensajes, int indice) {
	        if (!esIndiceValido(mensajes, indice)) return false;
	        if (!mensajes[indice].startsWith("[ALTERADO] ")) {
	            mensajes[indice] = "[ALTERADO] " + mensajes[indice];
	        }
	        return true;
	    }
	    
	    static String palabraMasLarga(String mensaje) {
	        String[] palabras = mensaje.split("\\s+");
	        String max = "";
	        for (String p : palabras) {
	            if (p.length() > max.length()) {
	                max = p;
	            }
	        }
	        return max;
	    }
	    
	    static void mostrarEstadisticas(String[] mensajes) {
	        int total = mensajes.length;
	        int alterados = 0;
	        String maxLong = "";
	        int totalA = 0;
	        for (String m : mensajes) {
	            if (m.startsWith("[ALTERADO] ")) alterados++;
	            totalA += contarLetra(m, 'A');
	            if (m.length() > maxLong.length()) maxLong = m;
	        }
	        System.out.println("Total mensajes: " + total);
	        System.out.println("Alterados: " + alterados);
	        System.out.println("Más largo: " + maxLong);
	        System.out.println("Total 'A': " + totalA);
	
	}

}
