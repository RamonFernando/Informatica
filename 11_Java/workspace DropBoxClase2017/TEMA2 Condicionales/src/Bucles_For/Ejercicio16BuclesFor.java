/**
 * 
 */
package Bucles_For;

/**
 * @author Ramon
 *
 */
public class Ejercicio16BuclesFor {

	/**
	 * PDF-Ejercicio de Bucles 16/22
	 * Ejercicio 16 con Bucle For
	 */
	public static void main(String[] args) {
		// 16.- Crea un programa que muestre las diez primeras potencias del
		// número 2 (o sea, 2, 4, 8, 16, etc.).

		int num = 2;
		System.out.println("Potencias del numero 2");
		System.out.println("======================");
		for (int i = 1; i < 11; i++) {
			System.out.println("     " + i + " --> " + " = " + num);
			num = num * 2;

		}
	}

}
