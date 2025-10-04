/**
 * 
 */
package RepasoEntregaBucles;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio2A {

	/**
	 * PDF-Ejercicios I Estructura de Condicionales
	 * Ejercicio Entrega 2
	 */
	public static void main(String[] args) {
		// 2.- Vamos a perfeccionar la aplicación anterior pidiendo un nombre
		// de usuario y una contraseña
		// para permitir el acceso al ordenador.
		// El programa guardará el nombre de usuario y la contraseña necesarias
		// en las constantes
		// NOMBRE_REQUERIDO, PASSWORD_REQUERIDO.
		// Si el nombre de usuario y la contraseña introducidas coinciden con
		// los de estas constantes,
		// aparecerá el mensaje "Acceso permitido". En caso contrario se
		// escribirá "Acceso denegado".

		Scanner sc = new Scanner(System.in);

		final String SECRET = "java8";
		final String PASSWORD_REQUERIDO = SECRET;
		String NOMBRE_REQUERIDO = "Ramon";
		String clave = "";

		System.out.println("Introduzca las claves de acceso.");
		System.out.println("Introduzca el Nombre de Usuario.");
		clave = sc.nextLine();
		
		System.out.println("Introduzca el Password");
		clave = sc.nextLine();

		while (!clave.equals(NOMBRE_REQUERIDO)) {
			System.out.println("Introduzca el Nombre de Usuario.");
			clave = sc.nextLine();
			
		}

		while (!clave.equals(PASSWORD_REQUERIDO)) {
			System.out.println("Introduzca el Password de Usuario.");
			clave = sc.nextLine();
			
		}
		if (!clave.equals(PASSWORD_REQUERIDO)) {

			System.out.println("Acceso denegado!");
		} else {

			System.out.println("Acceso concedido!");

		}

		System.out.println("Fin del programa.");

		sc.close();

	}
}
