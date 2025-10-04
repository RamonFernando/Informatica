package Operador_Ternario;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Condicionales10 {

	/**
	 * PDF-Ejercicio de Condicionales 10/22
	 * Descripcion:
	 * Condicionales Ejercicio con if/else.
	 * Operador Ternario.
	 */
	public static void main(String[] args) {
		// Pediremos un precio. Si es mayor de 100 euros haremos un descuento
		// del 15% y si no, no haremos descuento.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un precio ");
		if (sc.hasNextDouble()) {
			double precio = sc.nextDouble();
			double precioFinal;
			precioFinal = precio > 100 ? 0.85 * precio : precio;
			System.out.println("El precio final es " + precioFinal);
		} else {
			System.out.println("Error, introduzca un precio.");
		}

		sc.close();

	}

}
