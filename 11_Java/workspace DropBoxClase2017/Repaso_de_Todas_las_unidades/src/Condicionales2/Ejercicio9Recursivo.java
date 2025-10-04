/**
 * 
 */
package Condicionales2;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio9Recursivo {

	/**
	 * Con resto.
	 */
	public static void main(String[] args) {
		// 9.- Escribe un programa que calcule el resto de una división entre
		// enteros con el procedimiento de ir restando repetidamente el divisor
		// del dividendo hasta que el resultado es menor que el divisor.

		// Ejemplo de esta operación: 20 % 6
		//
		// 20 - 6 = 14
		// 14 – 6 = 8
		// 8 – 6 = 2 Ahí paramos, ya que la resta da un número menor que 6. El
		// resto vale 2.

		Scanner sc = new Scanner(System.in);

		int dividendo = 0;
		int divisor = 0;

		System.out.println("Introduce dos numeros enteros.");
		System.out.println("Dividendo 1");
		dividendo = sc.nextInt();
		System.out.println("Divisor 2");
		divisor = sc.nextInt();

		while (dividendo < divisor) {
			System.out.println("Error! ");
			System.out.println("Dividendo debe ser mayor");
			dividendo = sc.nextInt();
			System.out.println("Divisor 2");
			divisor = sc.nextInt();
		}

		while (dividendo >= divisor) {
			System.out.println(dividendo + " - " + divisor + " = "
					+ (dividendo - divisor));
			dividendo = dividendo - divisor;

		}
		System.out.println("El resto es " + dividendo + ".");
		// System.out.println("El resto es " + dividendo % divisor + ".");

		sc.close();

	}

}
