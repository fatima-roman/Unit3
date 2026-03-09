package modelodeexamen;

import java.util.ArrayList;
import java.util.Scanner;

public class modeloDeExamen01 {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Introduce el texto largo: ");
		        String texto = sc.nextLine();
		        System.out.print("Introduce el mensaje oculto: ");
		        String mensaje = sc.nextLine();
		        
		        String textoLimpio = normalizarTexto(texto);
		        int[] posiciones = buscarMensaje(textoLimpio, normalizarTexto(mensaje));
		        int apariciones = posiciones.length;
		        
		        System.out.println("El mensaje aparece " + apariciones + " veces.");
		        if (apariciones > 0) {
		            System.out.print("Posiciones iniciales: ");
		            for (int pos : posiciones) {
		                System.out.print(pos + " ");
		            }
		            System.out.println();
		            double porcentaje = calcularPorcentaje(textoLimpio, posiciones, mensaje.length());
		            System.out.printf("Porcentaje de letras usadas: %.2f%%\n", porcentaje);
		        }
		        sc.close();
		    }
		    
		    static String normalizarTexto(String texto) {
		        return texto.toLowerCase().replace(" ", "");
		    }
		    
		    static int[] buscarMensaje(String texto, String mensaje) {
		        ArrayList<Integer> posiciones = new ArrayList<>();
		        if (mensaje.isEmpty()) return new int[0];
		        
		        for (int i = 0; i <= texto.length() - mensaje.length(); i++) {
		            if (esSubsecuencia(texto, mensaje, i)) {
		                posiciones.add(i);
		            }
		        }
		        return posiciones.stream().mapToInt(Integer::intValue).toArray();
		    }
		    
		    static boolean esSubsecuencia(String texto, String mensaje, int inicio) {
		        int j = 0; // puntero en mensaje
		        for (int i = inicio; i < texto.length() && j < mensaje.length(); i++) {
		            if (texto.charAt(i) == mensaje.charAt(j)) {
		                j++;
		            }
		        }
		        return j == mensaje.length();
		    }
		    
		    static double calcularPorcentaje(String texto, int[] posiciones, int lenMensaje) {
		        int totalUsados = posiciones.length * lenMensaje;
		        return (double) totalUsados / texto.length() * 100;
		    }

	}

