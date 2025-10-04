/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio11ViendoIteracionesOA {
	/**
	 * @PDF-Ejercicio de Arrays II 10/17 Descripcion: Ordenar el array 9/12
	 */

	public static void main(String[] args) {
		// 11.- Crea una aplicación que ordene de menor a mayor la lista de
		// edades de los diez alumnos de un curso de Desarrollo de Aplicaciones
		// Web. Estas edades se pedirán por consola.
		Scanner sc = new Scanner(System.in);

		int edades[] = new int[10];
		int posMin;
		int aux;
		System.out.println("Edades");
		System.out.println("*=*=*=*");
		System.out.println("Introduzca la edad de 10 alumnos");
		for (int i = 0; i < edades.length; i++) {
			System.out.println((i + 1) + "º alumno");
			edades[i] = sc.nextInt();
		}
		for (int i = 0; i < edades.length; i++) {
			System.out.println("--> " + (i+1) + "º Pasada." + " <-- ");
			System.out.println("*=*=*=*=*=*=*");
			posMin = i;
			for (int j = i + 1; j < edades.length; j++) {

				if (edades[j] < edades[posMin]) {
					posMin = j;
				}

			}
			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;
			for (int k = 0; k < edades.length; k++) {
				
				System.out.print((k + 1) + "º" + "\"" + edades[k] + "\"  ");
				
			}
			System.out.println(" ");
		}
		System.out.println("================= Array de Edades ==================");
		System.out.println("**================ Array Ordenado ==================**");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*\n");
		for (int k = 0; k < edades.length; k++) {
			System.out.print((k + 1) + "º" + "\"" + edades[k] + "\"  ");
			
		}

		System.out.println("\n\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
		System.out.println("            ==== Fin del Programa ====");

		sc.close();
	}

}
