/**
 * 
 */
package Bucles;

/**
 * @author Ramon
 *
 */
public class Ejercicio9Bucles {

	/**
	 * Condicionales: Bucles Ejercicio9
	 */
	public static void main(String[] args) {
		// - Escribe un programa que calcule el resto de una división entre
		// enteros con el procedimiento de ir restando repetidamente el divisor
		// del dividendo hasta que el resultado es menor que el divisor.

		// Ejemplo de esta operación: 20 % 6
		// 20 - 6 = 14
		// 14 – 6 = 8
		// 8 – 6 = 2 Ahí paramos, ya que la resta da un número menor que 6. El
		// resto vale 2.

		int num1 = 20;
		int num2 = 6;

		while (num1 > num2) {

			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			num1 = num1 - num2;
		}

	}

}
