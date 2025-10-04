/**
 * 
 */
package BuclesDoWhile;

/**
 * @author Ramon
 *
 */
public class Ejercicio9conDoWhile {

	/**
	 * PDF-Ejercicio de Bucles 9-3/22
	 * Ejercicio 9 DoWhile
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

		int num1 = 42;
		int num2 = 6;
		
		System.out.println("Ejercicio 9");
		System.out.println("===========");
		
		do {
			
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			num1 = num1 - num2;
		} while (num1 >= num2);
		System.out.println("El resto es: " + num1%num2);

	}

}
