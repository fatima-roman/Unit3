package ejercicioscolecciones;

import java.util.HashMap;
import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {
		/*
		 * Implementa el control de acceso al área restringida de un programa. 
		 * Los nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una estructura de la clase HashMap. 
		 * El programa mostrará un menú con dos opciones:
		 * 1. Registro. Debe pedir un nombre de usuario y una contraseña. A continuación, se almacenarán en el mapa.
		 * 2. Login. Debe pedir un nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”.
		 * El usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”.
		 * 0. Salir. Termina el programa.
		 */
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> contrasenas = new HashMap<>();
		
		int opc; 
		do {
			System.out.println("1. Registro.\r\n"
					+ "2. Login.\r\n"
					+ "0. Salir.");
			opc = sc.nextInt();
			if (opc == 1) {
				System.out.println("Introduce un nombre de usuario");
				String nombreUser = sc.next();
				String contrasena = "", confirmarPass = " ";
				do {
					System.out.println("Introduce una contraseña: ");
					contrasena = sc.next();
					System.out.println("Confirma la contraseña: ");
					confirmarPass = sc.next();
				}while (!confirmarPass.equals(contrasena));
				contrasenas.put(nombreUser, contrasena);
			}
			if (opc == 2) {
				System.out.println("Introduce tu nombre de usuario: ");
				String nombreUser = sc.next();
				if (contrasenas.containsKey(nombreUser)) {
					String pass = "";
					int cont; 
					for(cont =0 ; cont <3; cont++) {
						System.out.println("Introduce contraseña: ");
						pass = sc.next();
						if (contrasenas.get(nombreUser).equals(pass)) {
							System.out.println("Ha accedido al área restringida");
							break;
						}
					}
					if (cont >= 3) {
						System.out.println("Lo siento, no tiene acceso al área restringida");
					}
				}else {
					System.out.println("Usuario no encontrado.");
				}
			}
		}while(opc != 0);
		
	sc.close();	
	}

}
