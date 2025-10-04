/**
 * 
 */
package Array_II;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio2 {

	/**
	 * @PDF-Ejercicio de Arrays II 2/17 Descripcion: Búsqueda en Arrays
	 *                desordenados 1-4 con Semaforo.
	 */
	public static void main(String[] args) {
		// 2.- Crea una aplicación que vaya leyendo y guardando en un array las
		// estaturas de 10 personas. A continuación, recorrerá el array y nos
		// informará de si alguna de estas estaturas es mayor de 1'90 m.

		Scanner sc = new Scanner(System.in);
		System.out.println("Estaturas");
		System.out.println("--------------------------------");
		// Array

		double estaturas[] = new double[10];

		// Declaracion de Variable
		double n = 0;

		for (int i = 0; i < estaturas.length; i++) {

			if (estaturas[i] == n) {
				System.out.println("Introduzca el " + (i + 1) + "º numero: ");
			}

			estaturas[i] = sc.nextDouble();
		}
		System.out.println("--------------------------------");
		for (int i = 0; i < estaturas.length; i++) {
			if (estaturas[i] > 1.90) {
				System.out
						.println("Persona de mas de 1.90m encontrada en la posicion "
								+ i + " con " + estaturas[i] + "m");
			}
		}
		System.out.println("--------------------------------");
		System.out.println("    -- Fin del Programa -- ");
		sc.close();

	}

}
