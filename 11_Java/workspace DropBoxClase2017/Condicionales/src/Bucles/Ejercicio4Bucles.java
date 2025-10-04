/**
 * 
 */
package Bucles;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio4Bucles {

	/**
	 * Condicionales: Bucles Ejercicio 4
	 */
	public static void main(String[] args) {
		// - Escribe una aplicación que pregunte al usuario un número entre 1 y
		// 5. Si responde "3", se le felicitará por haber acertado. Si no, se le
		// seguirá pidiendo más números.
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un numero entre 1 y 10: ");
		int num = sc.nextInt();

		while (num != 3 || num < 1 || num > 5) {
			System.out.println("Vuelve a escribir un numero");
			num = sc.nextInt();

		}
		System.out.println("Felicidades, Has acertado!");

		sc.close();
	}

}
