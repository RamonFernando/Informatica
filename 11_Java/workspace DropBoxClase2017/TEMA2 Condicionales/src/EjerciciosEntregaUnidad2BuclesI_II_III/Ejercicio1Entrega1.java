/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio1Entrega1 {

	/**
	 * PDF-Ejercicios I Estructura de Condicionales
	 * Entrega 1
	 */
	public static void main(String[] args) {
		// 1.- Queremos crear una aplicación que controle el acceso a un
		// ordenador pidiendo una clave de acceso.
		// El programa pedirá una cadena de caracteres al usuario. La comparará
		// con la cadena "java8" y si
		// son iguales, escribirá "Acceso permitido". En caso contrario
		// escribirá "Acceso denegado".
		// Para guardar la clave "java8" utiliza una constante llamada
		// CLAVE_REQUERIDA.

		Scanner sc = new Scanner(System.in);

		String clave;
		final String CLAVE_REQUERIDA = "Java8";

		System.out.println("Introduzca el password");
		clave = sc.nextLine();
		
		if (clave.equals(CLAVE_REQUERIDA)) {
			System.out.println("Acceso concedido!");
		} else {
			System.out.println("Acceso denegado!");
		}

		

		sc.close();

	}
}
