/**
 * 
 */
package Array_II;

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

		Scanner sc = new Scanner(System.in);

		int edades[] = new int[10];
		int posMin = 0;
		int aux = 0;

		System.out.println("Edades");
		System.out.println("-----------------------------");
		// 1er For 
		for (int i = 0; i < edades.length; i++) {
			if (edades[i] == 0) {
				System.out.println("Introduzca la " + (i + 1) + "º edad");
				edades[i] = sc.nextInt();
			}
		}
		System.out.println("-----------------------------");
		// 2do For
		for (int i = 0; i < edades.length; i++) {
			posMin = i;
			// 3er For
			for (int j = i + 1; j < edades.length; j++) {
				if (edades[j] < edades[posMin]) {
					posMin = j;
				}
			}
			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;
		}
		// 4to For
		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i] + " ");
		}
		System.out.println("       Array ordenado");
		System.out.println("-----------------------------");
		// 5to For
		for (int i = 0; i < edades.length; i++) {
			System.out.println(" Edades: " + (i + 1) + "º " + edades[i]);
		}
		System.out.println(" ");
		System.out.println("-----------------------------");
		System.out.println("   -- Fin del Programa --");
		sc.close();
	}

}
