/**
 * 
 */
package Array_II;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio3SemaforoFalse {

	/**
	 * @PDF-Ejercicio de Arrays II 3/17 Descripcion: Búsqueda en Arrays
	 *                desordenados 1-4 con Semaforo.
	 */
	public static void main(String[] args) {
		// 3.- Escribe un programa que lea una lista de nombres (uno a uno,
		// hasta un máximo de 10) por consola y los vaya guardando en un array
		// llamado nombres. La aplicación terminará de pedir palabras cuando el
		// usuario escriba "nadie".
		// A continuación revisará el array y averiguará si se ha introducido el
		// nombre "Calderón". Si es así escribirá "de la Barca". Si no,
		// escribirá "Nombre no encontrado". Utiliza una variable semáforo
		// llamándola nombreEncontrado.

		Scanner sc = new Scanner(System.in);
		System.out.println("-- Array de Nombres --");
		System.out.println("*=**=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		// Array

		String nombres[] = new String[10];

		// Declaracion de Variable
		boolean nombreEncontrado = false;
		String fin = "nadie";
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i] == null) {
				System.out.println("Escribe un nombre: " + (i + 1) + "/10");
			}
			nombres[i] = sc.nextLine();
			while (!nombreEncontrado) {
				if (nombres[i].equals(fin)) {

					nombreEncontrado = true;
					continue;
				} else {
					System.out.println("nombre no encontrado");
					nombreEncontrado = false;
					break;
				}

			}
			if (nombres[i].equals(fin)) {

				break;
			}

		}

		System.out.println("*=**=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		for (int i = 0; i < nombres.length && !nombres[i].equals(fin); i++) {

			if (nombres[i].equals("calderon")) {
				System.out.println((i + 1) + "º Nombre es: " + nombres[i]
						+ " de la barca");
			} else {
				System.out.println((i + 1) + "º Nombre es: " + nombres[i]);
			}

		}

		System.out.println("*=**=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("      *-- Fin del Programa --* ");
		sc.close();

	}

}
