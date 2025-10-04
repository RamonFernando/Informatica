/**
 * 
 */
package Arrays_SimplesEjercicios;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio11 {

	/**
	 * @PDF-Ejercicios Arrays I 11/17
	 */
	public static void main(String[] args) {
		// 11.- Crea un programa que almacene las órdenes que debe seguir un
		// robot en un array de 1000 elementos. Las órdenes son palabras
		// escritas por el usuario en la consola como:
		//
		// izquierda
		// derecha
		// arriba
		// abajo
		// matar
		//
		// El programa parará de pedir órdenes cuando el usuario escriba
		// "ejecutar". Entonces mostrará la lista de comandos que debe seguir el
		// robot.

		Scanner sc = new Scanner(System.in);
		String ordenes[] = new String[1000];
		System.out.println("Robot de ordenes");
		System.out.println("*=*=*=*=*=*=*=*=*");

		System.out.println("Introduce una orden para el robot:");
		for (int i = 0; i < ordenes.length; i++) {
			System.out.println((i + 1) + "º orden: ");
			ordenes[i] = sc.nextLine();
			if (ordenes[i].equals("ejecutar")) {
				break;
			}
		}
		System.out.println("*=*=*=*=*=*=*=*=*");
		for (int i = 0; i < ordenes.length; i++) {
			if (ordenes[i].equals("ejecutar")) {
				break;
			}
			System.out.println((i + 1) + "º orden: " + ordenes[i]);
		}
		System.out.println("*=*=*=*=*=*=*=*=*");
		System.out.println("Fin del Programa");
		sc.close();

	}

}
