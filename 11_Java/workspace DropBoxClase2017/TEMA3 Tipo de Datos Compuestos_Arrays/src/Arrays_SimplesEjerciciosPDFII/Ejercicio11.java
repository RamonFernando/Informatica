/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio11 {

	/**
	 * @PDF-Ejercicio de Arrays II 10/17 Descripcion: Ordenar el array 9/12
	 */
	public static void main(String[] args) {
		// 11.- Crea una aplicación que ordene de menor a mayor la lista de
		// edades de los diez alumnos de un curso de Desarrollo de Aplicaciones
		// Web. Estas edades se pedirán por consola.

		try {
			Scanner sc = new Scanner(System.in);

			// Array
			int edades[] = new int[10];

			// Declaracion de variables.
			int aux = 0;

			System.out.println("Edades");
			System.out.println("*=*=*=*");
			System.out.println("Introduce 10 edades de alumnos.\n");
			for (int i = 0; i < edades.length; i++) {
				System.out.println((i + 1) + "º Edad.");
				edades[i] = sc.nextInt();
			}
			for (int i = 0; i < edades.length; i++) {
				for (int j = i + 1; j < edades.length; j++) {
					if (edades[j] < edades[i]) {
						aux = edades[i];
						edades[i] = edades[j];
						edades[j] = aux;
					}
				}
			}
			System.out
					.println("============== Array de Temperaturas =================");
			System.out
					.println("**================ Array Ordenado ==================**");
			System.out
					.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*\n");
			for (int i = 0; i < edades.length; i++) {
				System.out.print((i + 1) + "º" + "\"" + edades[i] + "\"  ");
			}

			System.out
					.println("\n\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
			System.out.println("            ==== Fin del Programa ====");

			sc.close();
		} catch (Exception e) {
			System.out.println("Error, parametro incorrecto.");
			System.out.println("Tipo de error: " + e.toString());
			System.out
					.println("\n\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
			System.out.println("            ==== Fin del Programa ====");

		}

	}

}
