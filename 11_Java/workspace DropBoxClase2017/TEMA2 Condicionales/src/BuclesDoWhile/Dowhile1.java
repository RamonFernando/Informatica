package BuclesDoWhile;

import java.util.*; // Si pones asterisco en ves de Scanner se 
//guardara cualquier clase de la libreria java.util en vez de la clase Scanner

/**
 * @author Ramon
 *
 */
public class Dowhile1 {

	/**
	 * DoWhile Ejemplo.
	 */
	public static void main(String[] args) {
		// Programa que pide al usuario la edad y se le hace repetir mientras no
		// escriba un valor entre 20 y 60.

		Scanner sc = new Scanner(System.in);

		int edad;

		do {
			System.out.println("Edad entre 20 y 60 años? ");
			edad = sc.nextInt();
		} while (edad < 20 || edad > 60);
		System.out.println("Su edad es: " + edad + " años");

		sc.close();

	}

}
