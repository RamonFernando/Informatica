/**
 * 
 */
package Arrays_SimplesEjemplos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class EjemploArrays5 {

	/**
	 * Ejemplo 5
	 */
	public static void main(String[] args) {
		// Crea un programa que lea los nombres de 10 personas y los guarde en
		// un array.
		// A continuacion, muestra los nombres.

		Scanner sc = new Scanner(System.in);
		String nombres[] = new String[10];

		String nombre = "";
		System.out.println("Introduce 10 nombres.");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println((i + 1) + "º Nombre: ");
			nombres[i] = sc.nextLine();

		}
		for (int i = 0; i < args.length; i++) {
			System.out.println(nombres[i]);

		}

		sc.close();

	}

}
