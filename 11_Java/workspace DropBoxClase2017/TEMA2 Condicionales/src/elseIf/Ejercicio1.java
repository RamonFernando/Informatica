package elseIf;

import java.util.InputMismatchException;
import java.util.*;

/**
 * 
 * @author Ramon
 *
 */
public class Ejercicio1 {
	/**
	 * PDF-Ejercicio de Condicionales 2/22
	 * Descripcion:
	 * Condicionales Ejercicio con if/else.
	 * 
	 */

	public static void main(String[] args) {
		// Crea un programa que pida la temperatura de un reactor nuclear. Si
		// ésta supera los 120ºC, se mostrará en pantalla el mensaje:
		// "TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS!
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Introduzca temperatura: ");
			float temp = scan.nextFloat();
			while (temp != -1) {
				if (temp > 120) {
					System.out.println("Temperatura del REACTOR CRITICA! "
							+ temp + " Corred Insensatos!");

				} else {
					System.out.println("Temperatura del reactor correcta: "
							+ temp);
				}

				System.out.println("Introduzca temperatura: ");
				temp = scan.nextFloat();
			}
		} catch (InputMismatchException ex) {
			System.out.println("Error de formato.");
			System.out.println(ex.toString());
		} catch (Exception ex) {
			System.out
					.println("Parametro incorrecto, por favor introduzca bien el numero.");
			System.out.println(ex.toString()); // Esto es para ver el tipo de
												// dato de exception(Tipo de
												// Clase).
		}
		scan.close();
	}
}
