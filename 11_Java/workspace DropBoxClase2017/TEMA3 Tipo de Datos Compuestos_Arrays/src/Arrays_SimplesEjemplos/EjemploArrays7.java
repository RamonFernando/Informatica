/**
 * 
 */
package Arrays_SimplesEjemplos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class EjemploArrays7 {

	/**
	 * Ejemplo 7.
	 */
	public static void main(String[] args) {
		// Crea un programa que lea 7 pesos y los guarde en un array.
		// Despues los mostrara.

		Scanner sc = new Scanner(System.in);

		int pesos[] = new int[7];

		System.out.println("Introduce 7 veces un precio en pesos: ");

		for (int i = 0; i < pesos.length; i++) {
			System.out.println((i + 1) + "º precio en pesos: ");
			pesos[i] = sc.nextInt();
		}
		for (int i = 0; i < pesos.length; i++) {
			System.out.println((i + 1) + "º precio en pesos: " + pesos[i]);
		}

		sc.close();

	}

}
