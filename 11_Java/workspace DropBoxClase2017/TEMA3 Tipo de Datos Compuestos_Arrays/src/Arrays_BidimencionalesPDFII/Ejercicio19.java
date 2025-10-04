/**
 * 
 */
package Arrays_BidimencionalesPDFII;

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

		System.out.println("--Nóminas--");
		System.out.println("*=*=*=*=*=*=*");

		// Array de Strings

		// Filas y Columnas
		String nominas[][] = new String[4][3];

		// Declaracion de variables.

		float suma = 0;
		float total = 0;

		for (int i = 0; i < nominas.length; i++) {
			System.out.println("Introduce Apellidos");
			nominas[i][0] = sc.nextLine();
			System.out.println("Introduce Nombre: ");
			nominas[i][1] = sc.nextLine();
			System.out.println("Introduce Sueldo: ");
			nominas[i][2] = sc.nextLine();
		}

		for (int i = 0; i < nominas.length; i++) {
			suma = suma + Float.parseFloat(nominas[i][2]);
		}
		total = suma;

		for (int i = 0; i < nominas.length; i++) {
			System.out.println(nominas[i][0] + " " + nominas[i][1] + " " + nominas[i][2]);
		}
		System.out.println("---------------------------------");
		System.out.println("La suma total a pagar de los sueldos son: " + total + " €");

		sc.close();

	}

}
