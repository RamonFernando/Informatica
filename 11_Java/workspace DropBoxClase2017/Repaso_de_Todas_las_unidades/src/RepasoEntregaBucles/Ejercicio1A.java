/**
 * 
 */
package RepasoEntregaBucles;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio1A {

	/**
	 * @param args
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
		final String SECRET = "java8";
		
		System.out.println("Introduzca la clave de acceso!");
		clave = sc.nextLine();
		
		if(clave.equals(SECRET)) {
			System.out.println("Acceso concedido.");
		}else{
			System.out.println("Acceso denegado.");
		}
		
		
		
		
		
		sc.close();

	}

}
