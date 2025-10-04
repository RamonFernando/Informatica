/**
 * 
 */
package Arrays_SimplesEjercicios;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio10 {

	/**
	 * @PDF-Ejercicios Arrays I 10/17
	 */
	public static void main(String[] args) {
		// 10.- Crea un programa que lea los precios de hasta cien productos y
		// los guarde en un array llamado compra. Mientras los precios se van
		// pidiendo al usuario, si éste introduce el valor 0, el programa
		// entenderá que se ha terminado la compra, y mostrará todos los precios
		// introducidos hasta el momento (no las posiciones vacías).

		Scanner sc = new Scanner(System.in);
		float precios[] = new float[100];
		System.out.println("-Array de Precios-");
		System.out.println("**=============**");
		System.out.println("Introduce un precio: ");
		for (int i = 0; i < precios.length; i++) {
			System.out.println((i + 1) + "º Precio: ");
			precios[i] = sc.nextFloat();
			if (precios[i] == 0) {
				break;
			}
			while (precios[i] < 0) {
				System.out
						.println("No se puede introducir un precio menor que \"0\"");
				precios[i] = sc.nextFloat();
			}

		}
		System.out.println("Precios por Consola");
		System.out.println("**===============**");

		// for (int i = 0; i < precios.length; i++) {
		//
		// if (precios[i] == 0) {
		// // System.out.println("Fin del Programa");
		// break;
		// }
		// System.out.println((i + 1) + "º Precio: " + precios[i]);
		// }
		int i = 0;
		while (i < precios.length && precios[i] != 0) {

			// System.out.println("Fin del Programa");

			System.out.println((i + 1) + "º Precio: " + precios[i]);
			i++;
		}

		System.out.println("**=============**");
		System.out.println("Fin del Programa");
		sc.close();

	}

}
