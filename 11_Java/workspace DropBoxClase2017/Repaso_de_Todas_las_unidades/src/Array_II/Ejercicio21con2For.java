/**
 * 
 */
package Array_II;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio21con2For {

	/**
	 * @PDF-Ejercicio de Arrays II 21/24 Descripcion: Array Bidimensionales
	 *                13/23
	 */
	public static void main(String[] args) {
		// 21.- Modifica el programa anterior de manera que haga las mismas
		// funciones pero usando sólo dos bucles: uno para leer los datos y
		// luego otro para los cálculos.

		Scanner sc = new Scanner(System.in);

		String nominas[][] = new String[4][3];

		// Declaracion de Variable
		double suma = 0;
		double salarioTotal = 0;
		int posMin = 0;

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
		System.out.println("----------- Nominas ----------");
		System.out.println("-------------------------------");
		for (int i = 0; i < nominas.length; i++) {
			suma = suma + Double.parseDouble(nominas[i][2]);

			if (Float.parseFloat(nominas[i][2]) < Float
					.parseFloat(nominas[posMin][2])) {
				posMin = i;
			}
			System.out.println(nominas[i][0] + " " + nominas[i][1] + " "
					+ nominas[i][2] + " €");
		}

		salarioTotal = suma;

		System.out.println("-------------------------------");
		System.out.println("El trabajador " + nominas[posMin][1] + " "
				+ nominas[posMin][0] + " tiene el menor salario "
				+ nominas[posMin][2] + " €");
		System.out.println("El salario total de los trabajadores es "
				+ salarioTotal + " €");
		System.out.println("-------------------------------");
		System.out.println("------ Fin del Programa ------");
		sc.close();				
	}

}
