/**
 * 
 */
package EjerciciosMetodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio3Metodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 3.- Escribe un método que pida al usuario su nombre y devuelva la
		// cadena introducida

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su nombre: ");
		System.out.println("*=*=*=*=*=*=*=*=*");
		String nombre = sc.nextLine();
		System.out.println("*=*=*=*=*=*=*=*=*");
		System.out.println("\"" + cadena(nombre) + "\"");

		sc.close();

	}

	static String cadena(String nombre) {
		return nombre;
	}
}
