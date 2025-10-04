/**
 * 
 */
package Bucles_For;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio18conDoWhile {

	/**
	 * PDF-Ejercicio de Bucles 18/22 
	 * Ejercicio 18 con DoWhile
	 */
	public static void main(String[] args) {
		// 18.- Escribe una aplicación que solicite cinco notas. Si el usuario
		// escribe una nota que no está entre 0 y 10 se le informará del error y
		// se le volverá a pedir el dato.

		Scanner sc = new Scanner(System.in);
		int nota = 0;
		for (int i = 0; i < 5; i++) {
			do {
				System.out.println("Escribe tus " + (5 - i) + " notas");
				nota = sc.nextInt();

			} while (nota < 0 || nota > 10);
		}

		sc.close();

	}

}
