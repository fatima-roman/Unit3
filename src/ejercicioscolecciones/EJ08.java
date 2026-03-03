package ejercicioscolecciones;

import java.util.HashMap;

public class EJ08 {

	public static void main(String[] args) {
		/*
		 * Implementa el control de acceso al área restringida de un programa. 
		 * Los nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una estructura de la clase HashMap. 
		 * El programa mostrará un menú con dos opciones:
		 * 1. Registro. Debe pedir un nombre de usuario y una contraseña. A continuación, se almacenarán en el mapa.
		 * 2. Login. Debe pedir un nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”.
		 * 0. Salir. Termina el programa.
		 */
		
		HashMap<String, String> contrasenas = new HashMap<>();
		
		int opc; 
		do {
			System.out.println("1. Registro. Debe pedir un nombre de usuario y una contraseña. A continuación, se almacenarán en el mapa.\r\n"
					+ "	2. Login. Debe pedir un nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”.\r\n"
					+ "0. Salir. Termina el programa.");
		}while(opc != 0);
		
		
	}

}
