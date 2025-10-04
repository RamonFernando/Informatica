/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio3 {

	/**
	 * @PDF-Ejercicio de Arrays II 2/17 Descripcion: Búsqueda en Arrays
	 *                desordenados 1-4
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

		System.out.println("Lista de nombres");
		System.out.println("*=*=*=*=*=*=*=*=*\n");

		String nombres[] = new String[10];

		// Declaracion de variables.

		

		for (int i = 0; i < nombres.length; i++) {
			boolean nombreEncontrado = false;
			
			System.out.println("\nEscribe el " + (i + 1) + "º nombre.");

			nombres[i] = sc.nextLine();

			if (nombres[i].equals("nadie")) {
				
				System.out.println("Fin del programa ");
				System.out.println("*=*=*=*=*=*=*=*=*");

				break;

			}
			while (!nombreEncontrado) {

				// int i = 0;
				if (nombres[i].equals("calderon")) {
					
					// System.out.println("De la Barca");
					
					nombreEncontrado = true;
					continue;
					
					// break;
				} else {
					System.out.println("Nombre no encontrado");
					break;
				}

			}

		}
		for (int i = 0; i < nombres.length && !nombres[i].equals("nadie"); i++) {
			// System.out.println("Los nombres son " + nombres[i1]);
		if (nombres[i].equals("calderon")) {
			System.out.println((i+1) + "º Nombre es: " + nombres[i] + " de la barca");
		}else{
			System.out.println((i+1) + "º Nombre es: " + nombres[i]);
		}
		
		}

		System.out.println("\nFin del programa ");
		System.out.println("*=*=*=*=*=*=*=*=*");
		sc.close();

	}

}
