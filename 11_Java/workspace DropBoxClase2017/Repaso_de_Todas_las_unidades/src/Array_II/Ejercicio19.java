/**
 * 
 */
package Array_II;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio19 {

	/**
	 * @PDF-Ejercicio de Arrays II 19/24 Descripcion: Array Bidimensionales
	 *                13/23
	 */
	public static void main(String[] args) {
		// 19.- Crea un programa que vaya pidiendo por la terminal los
		// apellidos, el nombre y el sueldo de cuatro empleados de una empresa,
		// y guardándolo como filas en un array bidimensional llamado nominas. A
		// continuación muestra los datos por la pantalla en forma de tabla y
		// calcula el salario total que paga la empresa cada mes.

		Scanner sc = new Scanner(System.in);

		String nominas[][] = new String[4][3];

		// Declaracion de Variable
		double suma = 0;
		double salarioTotal = 0;

		System.out.println("\t-- Nominas --");
		System.out.println("-------------------------------");
		for (int i = 0; i < nominas.length;) {

			System.out.println("Introduce el " + (i + 1) + " apellido");
			nominas[i][0] = sc.nextLine();

			System.out.println("Introduce el " + (i + 1) + " Nombre");
			nominas[i][1] = sc.nextLine();

			System.out.println("Introduce el " + (i + 1) + " Sueldo");
			nominas[i][2] = sc.nextLine();

			i++;

		}
		for (int i = 0; i < nominas.length; i++) {
			suma = suma + Double.parseDouble(nominas[i][2]);
		}

		salarioTotal = suma;
		System.out.println("----------- Nominas ----------");
		System.out.println("-------------------------------");
		for (int i = 0; i < nominas.length; i++) {
			System.out.println(nominas[i][0] + " " + nominas[i][1] + " "
					+ nominas[i][2] + " €");

		}
		System.out.println("-------------------------------");
		System.out.println("El salario total es " + salarioTotal + " €");
		System.out.println("-------------------------------");
		System.out.println("------ Fin del Programa ------");

		sc.close();

	}

}
