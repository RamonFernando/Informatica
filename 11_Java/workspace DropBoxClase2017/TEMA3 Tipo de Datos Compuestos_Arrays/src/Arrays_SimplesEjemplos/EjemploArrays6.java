/**
 * 
 */
package Arrays_SimplesEjemplos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class EjemploArrays6 {

	/**
	 * @PDF-Ejemplos
	 */
	public static void main(String[] args) {
		// Crea un programa que lea 6 edades y las guarde en un array.
		// A continuacion las mostrara por pantalla.
		Scanner sc = new Scanner(System.in);

		int edades[] = new int[10];
		System.out.println("Introduce 6 edades.");

		for (int i = 0; i < edades.length; i++) {
			System.out.println("Introduce edad " + (i + 1) + ": ");
			edades[i] = sc.nextInt();

		}
		for (int j = 0; j < edades.length; j++) {
			System.out.println((j + 1) + "º posicion: " + (edades[j]));
		}
		// System.out.println(edades[10]);

		sc.close();

	}

}
