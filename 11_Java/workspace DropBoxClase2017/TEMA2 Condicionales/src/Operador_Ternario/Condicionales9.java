package Operador_Ternario;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Condicionales9 {

	/**
	 * PDF-Ejercicio de Condicionales 9/22
	 * Descripcion:
	 * Condicionales Ejercicio con Operador ternario
	 */
	public static void main(String[] args) {
		// Operador Ternario Ejemplo...
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba el precio de un producto ");
		double precio = sc.nextDouble();

		double precioFinal;
		// if (precio > 100) {
		// precioFinal = 0.85 * precio; // Se le aplica el 15% de descuento
		// // esta es la formula abreviada
		// System.out.println("El precio final es: " + precioFinal);
		// } else {
		// precioFinal = 0.95 * precio; // Se le aplica el 5% de descuento esta
		// // es la formula abreviada.
		// System.out.println("El precio final es: " + precioFinal);
		// }
		//

		precioFinal = precio > 100 ? 0.85 * precio : 0.95 * precio; // Solo sirve para un if que enga dos condiciones ... (if/else).
		sc.close();
	}

}
