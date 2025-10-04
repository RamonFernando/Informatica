/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio1Entrega4 {

	/**
	 * PDF-Ejercicios I Estructura de Condicionales
	 * Ejercicios 4 Entrega
	 */
	public static void main(String[] args) {
		// 4.- Un profesor quiere una aplicación que muestre las notas de un
		// examen con diferente color según
		// este esquema:
		// • Nota < 4: Rojo.
		// • 4 <= Nota < 5: Verde.
		// • Nota >= 5: Azul.
		// El programa pedirá una nota (puede tener decimales) y devolverá el
		// nombre del color a usar. Utiliza
		// las instrucciones if y else if

		Scanner sc = new Scanner(System.in);

		// Declaracion de la Variable
		int nota;

		// Introduccion
		System.out.println("Notas de clase representada en colores");
		System.out.println("**************************************\n");
		System.out.println("Introduzca nota:");
		nota = sc.nextInt();

		// Desarrollo
		if (nota < 4) {
			System.out.println("\nSu nota es: " + "\"" + nota + "\"" + " Rojo");
		} else if (nota >= 4 && nota <= 5) {
			System.out.println("\nSu nota es: " + "\"" + nota + "\""
					+ " Naranja");
		} else if (nota > 5 && nota < 7) {
			System.out.println("\nSu nota es: " + "\"" + nota + "\""
					+ " Amarillo");
		} else if (nota >= 7 && nota < 9) {
			System.out
					.println("\nSu nota es: " + "\"" + nota + "\"" + " Verde");
		} else if (nota >= 9 && nota <= 10)
			System.out.println("\nSu nota es: " + "\"" + nota + "\"" + " Azul");

		System.out.println("**********************");
		System.out.println(">> Fin del Programa <<");
		// Cierre
		sc.close();
	}

}
