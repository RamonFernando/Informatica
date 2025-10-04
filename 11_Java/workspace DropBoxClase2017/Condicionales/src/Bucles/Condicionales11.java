/**
 * 
 */
package Bucles;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Condicionales11 {

	/**
	 * Bucles
	 */
	public static void main(String[] args) {
		// Bucles

		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos años tienes? ");
		// El siguiente bucle bucle lee un valor por consola y evalua si es un
		// entero.
		int edad;
		while (!sc.hasNextInt()) { // Condicion para comprobar si el numero que
									// se introduce por consola es un entero
									// (int)
			System.out.println("Entrada incorrecta, prueba de nuevo! ");
			sc.nextLine();// Vaciamos el buffer de entrada, para que al
							// repetirse el bucle, se
							// le vuelve a pedir el dato al usuario
		}

		// Guardamos el valor escrito por consola en la variable edad.
		edad = sc.nextInt();
		System.out.println("Tienes " + edad + "años.");

		sc.close();

	}

}
