/**
 * 
 */
package Arrays_SimplesEjemplos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class EjemploArrays10 {

	/**
	 * Ejemplo
	 */
	public static void main(String[] args) {
		// Arrays Incompletos
		// Crea un array de enteros de 1000 elementos y ve pidiendo edades de
		// alumnos. Cuando el usuario escriba -1, el programa terminará y
		// mostrará todas las edades introducidas.

		Scanner sc = new Scanner(System.in);

		int i = 0;
		int edad = 0;
		int edades[] = new int[1000];

		// Leemos datos.
		System.out.println("Ve introduciendo las edades de los alumnos, pulsa -1 para terminar.");

		for (int cont = 0; cont < edades.length; cont++) {

			if (edad != -1) {
				System.out.println("Edad: " + (cont + 1));
				edad = sc.nextInt();
				edades[cont] = edad;
			}

		}

		// Mostramos los datos del array.
		for (int j = 0; j < edades.length; j++) {
			if (edades[j] != -1) {
				System.out.println(edades[j]);
			}else{
				break;
			}
		}

		sc.close();

	}

}
