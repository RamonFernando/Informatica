/**
 * 
 */
package Arrays_SimplesEjemplos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class EjemploArrays11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Modifica el ejemplo anterior para hacerlo con While.

		Scanner sc = new Scanner(System.in);

		int i = 0;
		int edad;
		int edades[] = new int[5];

		// Leemos datos.
		System.out.println("Ve introduciendo las edades de los alumnos, pulsa -1 para terminar.");

		do {
			System.out.println("Edad: " + (i + 1));
			edad = sc.nextInt();
			edades[i] = edad;
			i++;
		} while (edad != -1 && i < edades.length);

		// Mostramos los datos del array.
		// Comprobaremos la primera condicion y si es falsa no se comprobara la
		// segunda.
		i = 0;
		while (i < edades.length && edades[i] != -1) {
			System.out.println(edades[i]);
			i++;
		}

		sc.close();

	}

}
