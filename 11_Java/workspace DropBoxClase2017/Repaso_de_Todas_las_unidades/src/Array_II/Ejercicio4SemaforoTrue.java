/**
 * 
 */
package Array_II;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio4SemaforoTrue {

	/**
	 * @PDF-Ejercicio de Arrays II 4/17 Descripcion: Búsqueda en Arrays
	 *                desordenados 1-4
	 */
	public static void main(String[] args) {
		// 4.- Escribe un programa que pida 10 precios de productos y los guarde
		// en un array llamado productos. Después recorrerá el array hasta
		// encontrar un precio menor que 0. Si lo encuentra escribirá el mensaje
		// "Se ha encontrado un valor no válido en la posición x. El programa terminará"
		// (x es la posición del array donde está ese dato). Si no lo encuentra,
		// calculará la suma de todos los precios y la mostrará.

		// Utiliza una variable semáforo llamada preciosCorrectos, que valdrá
		// true si todos los precios son mayores o iguales a cero, y false si se
		// encuentra un número negativo.

		Scanner sc = new Scanner(System.in);
		System.out.println("--Array de precios--");

		double precios[] = new double[10];
		// Declaracion de Variable
		boolean preciosCorrectos = true;
		double suma = 0;

		for (int i = 0; i < precios.length; i++) {
			if (precios[i] == 0) {
				System.out.println("Introduce el " + (i + 1) + "º precio:");
				precios[i] = sc.nextDouble();

			}
			if (precios[i] <= 0) {
				preciosCorrectos = false;
				System.out
						.println("Se ha encontrado un valor no válido en la posición "
								+ (i + 1));
				// System.out.println("Fin del Programa");
				break;
			} else {
				suma = suma + precios[i];

			}
		}
		int j = 1;
		while (preciosCorrectos && j < precios.length) {
			if (precios[j] > 0) {
				System.out.println("La suma de todos los precios es: " + suma);
				break;
			}

		}
		j++;

		System.out.println("-- Fin del Programa --");
		sc.close();

	}
}
