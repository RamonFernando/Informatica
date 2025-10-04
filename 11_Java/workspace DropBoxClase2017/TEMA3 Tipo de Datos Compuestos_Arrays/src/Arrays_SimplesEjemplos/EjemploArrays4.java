/**
 * 
 */
package Arrays_SimplesEjemplos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class EjemploArrays4 {

	/**
	 * @PDF-Arrays
	 */
	public static void main(String[] args) {
		// Leemos cuatro precios desde la terminal y los guardamos en un array.

		Scanner sc = new Scanner(System.in);

		double precios[] = new double[4];

		double suma = 0;
		for (int i = 0; i < precios.length; i++) {
			
			// Para que no salga el numero 0 del array.
			System.out.println("Introduce precio " + (i + 1));
			precios[i] = sc.nextInt();

		}
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
		for (int i = 0; i < precios.length; i++) {
			System.out.println("Precios " + (i + 1) + ": " + precios[i]);

			suma = suma + precios[i];
		}
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("La suma de todos es: " + suma);

		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("Fin del Programa.");
		sc.close();

	}

}
