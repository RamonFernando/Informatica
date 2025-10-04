
package Switch;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio16 {

	/**
	 * PDF-Ejercicio de Condicionales 16/22
	 * Descripcion:
	 * Condicionales Ejercicio con Switch-if/else.
	 * Switch
	 */
	public static void main(String[] args) {
		// Modifica el programa anterior para que pida el año en curso y el
		// número de mes. Y devuelva el número de días de ese mes (ahora sí
		// debes tener en cuenta el asunto de los años bisiestos).

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el año: ");
		System.out.println("==================");
		int año = entrada.nextInt();
		

		if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
			System.out.println("El año es biciesto.");
		} else {
			System.out.println("El año no es biciesto.");
		}
		System.out.println("\nIntroduzca el numero de mes: ");
		System.out.println("============================");
		int mes = entrada.nextInt();
		switch (mes) {
		case 1:
			System.out.println("El mes de Enero tiene 30 días.");
			break;
		case 2:
			if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
				System.out.println("El mes de Febrero tiene 29 días.");
			} else {
				System.out.println("El mes de Febrero tiene 28 días.");
			}

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
