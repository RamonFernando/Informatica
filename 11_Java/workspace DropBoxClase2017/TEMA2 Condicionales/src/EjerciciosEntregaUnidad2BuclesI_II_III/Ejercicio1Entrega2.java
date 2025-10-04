/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio1Entrega2 {

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
		final String PASSWORD_REQUERIDO = "java8";
		final String NOMBRE_REQUERIDO = "Ramon";
		String nombre;
		String pass;

		System.out.println("Introduce Nombre de Usuario");
		nombre = sc.nextLine();
		System.out.println("Introduzca Password: ");
		pass = sc.nextLine();

		if (nombre.equals(NOMBRE_REQUERIDO) && pass.equals(PASSWORD_REQUERIDO)) {
			System.out.println("Acceso Concedido!");
		} else {
			System.out.println("Acceso Denegado!");

		}

		sc.close();
	}

}
