/**
 * 
 */
package BuclesWhile;

/**
 * @author Ramon
 *
 */
public class Ejercicio9_1Bucles {

	/**
	 * PDF-Ejercicio de Bucles 9-1/22
	 * Descripcion:
	 * Condicionales Ejercicio 9 con While.
	 */
	public static void main(String[] args) {
		// // - Escribe un programa que calcule el resto de una división entre
		// enteros con el procedimiento de ir restando repetidamente el divisor
		// del dividendo hasta que el resultado es menor que el divisor.

		// Ejemplo de esta operación: 20 % 6
		// 20 - 6 = 14
		// 14 – 6 = 8
		// 8 – 6 = 2 Ahí paramos, ya que la resta da un número menor que 6. El
		// resto vale 2.

		int divisor = 35;
		int dividendo = 6;
		while (divisor > dividendo) {
			 System.out.println(divisor + " - " + dividendo + " = " + (divisor - dividendo) );
			 divisor = divisor - dividendo;
		}

	}

}
