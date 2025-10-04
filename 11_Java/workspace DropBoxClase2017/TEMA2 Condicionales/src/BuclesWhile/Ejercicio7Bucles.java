/**
 * 
 */
package BuclesWhile;

/**
 * @author Ramon
 *
 */
public class Ejercicio7Bucles {

	/**
	 * PDF-Ejercicio de Bucles 7/22
	 * Descripcion:
	 * Condicionales: Bucles Ejercicio 7 con while.
	 */
	public static void main(String[] args) {
		// Crea un programa que escriba los 50 primeros números pares

		int i =0;
		int num = 0;
		System.out.println("Los cincuenta primeros numeros pares son: ");
		System.out.println("=========================================");
		while (i < 50) {
			num = num + 1;
			System.out.println("    Posicion " + num + " --> " + i*2);
			i++;
		}

	}

}
