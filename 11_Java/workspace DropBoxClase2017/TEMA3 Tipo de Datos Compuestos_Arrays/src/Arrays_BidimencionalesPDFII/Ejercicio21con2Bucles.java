/**
 * 
 */
package Arrays_BidimencionalesPDFII;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio21con2Bucles {

	/**
	 * @PDF-Ejercicio de Arrays II 21/24 Descripcion: Array Bidimensionales
	 *                13/23
	 */
	public static void main(String[] args) {
		// 21.- Modifica el programa anterior de manera que haga las mismas
		// funciones pero usando sólo dos bucles: uno para leer los datos y
		// luego otro para los cálculos.

		Scanner sc = new Scanner(System.in);

		System.out.println("--Nóminas--");
		System.out.println("*=*=*=*=*=*=*");

		// Array de Strings

		// Filas y Columnas
		String nominas[][] = new String[4][3];

		// Declaracion de variables.

		float suma = 0;
		float total = 0;
		float min;
		int posMin = 0;
		// float max;
		// int posMax;
		float notas = 0;
		int cont = 1;
		int con = 1;

		for (int i = 0; i < nominas.length; i++) {
			System.out.println("Introduce Apellidos: " + cont);
			nominas[i][0] = sc.nextLine();
			System.out.println("Introduce Nombre: " + (i + 1));
			nominas[i][1] = sc.nextLine();
			System.out.println("Introduce Sueldo: " + con);
			nominas[i][2] = sc.nextLine();
			cont++;
			con++;
		}
		System.out.println("---------------------------------");

		for (int i = 0; i < nominas.length; i++) {
			suma = suma + Float.parseFloat(nominas[i][2]);

			total = suma;

			System.out.println(nominas[i][0] + " " + nominas[i][1] + " " + nominas[i][2]);

			notas = Float.parseFloat(nominas[i][2]);

			min = Integer.parseInt(nominas[posMin][2]);

			if (notas < min) {
				posMin = i;
			}
		}
		System.out.println("---------------------------------");
		System.out.println("La suma total a pagar de los sueldos son: " + total + " €");
		System.out.println("El trabajador con el menor sueldo es " + nominas[posMin][1] + " " + nominas[posMin][0] + " "
				+ nominas[posMin][2] + " €");

		sc.close();
	}

}
