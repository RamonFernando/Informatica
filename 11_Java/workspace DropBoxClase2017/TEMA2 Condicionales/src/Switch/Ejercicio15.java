
package Switch;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio15 {

	/**
	 * PDF-Ejercicio de Condicionales 15/22
	 * Descripcion:
	 * Condicionales Ejercicio con Switch.
	 * Switch
	 */
	public static void main(String[] args) {
		// Crea un programa que pida un número de mes entre 1 y 12. A
		// continuación devolverá el número de días de ese mes. Supón que no
		// existen años bisiestos.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un numero de mes entre 1 y 12: ");
		int mes = entrada.nextInt();
		switch (mes) {
		case 1:
			System.out.println("El mes de Enero tiene 30 días.");
			break;
		case 2:
			System.out.println("El mes de Febrero tiene 28 días.");
			break;
		case 3:
			System.out.println("El mes de Marzo tiene 31 días.");
			break;
		case 4:
			System.out.println("El mes de Abril tiene 30 días.");
			break;
		case 5:
			System.out.println("El mes de Mayo tiene 31 días.");
			break;
		case 6:
			System.out.println("El mes de Junio tiene 30 días.");
			break;
		case 7:
			System.out.println("El mes de Julio tiene 31 días.");
			break;
		case 8:
			System.out.println("El mes de Agosto tiene 31 días.");
			break;
		case 9:
			System.out.println("El mes de Septiembre tiene 30 días.");
			break;
		case 10:
			System.out.println("El mes de Octubre tiene 31 días.");
			break;
		case 11:
			System.out.println("El mes de Noviembre tiene 30 días.");
			break;
		case 12:
			System.out.println("El mes de Diciembre tiene 31 días.");
			break;

		default:
			System.out.println("Error, Introduzca un numero valido. ");
		}

		entrada.close();
	}

}
