/**
 * 
 */
package PDF_Teoria_Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio1 {

	/**
	 * @PDF- Teoria
	 */
	// Atributos
	// Para un descuento del 8%
	public static final Float DESCUENTO = 8F;
	// Para una compra minima de 100 € euros.
	public static final float COMPRA_MIN = 100F;
	// Segundo descuento o penalizacion para compra < 30 €.
	public static final float DESCUENTO_MIN = 2F;

	public static void main(String[] args) {
		// Modifique el programa para que, en lugar de hacer un descuento del 8%
		// si la compra es de 100 € o más, aplique una penalización de 2 € si
		// el precio es inferior a 30 €.
		float precio;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el precio de compra: ");
		precio = sc.nextFloat();

		if (precio >= COMPRA_MIN) {
			System.out.println("Tienes un descuento de "
					+ (precio * DESCUENTO / 100) + " €");
			precio = precio - DESCUENTO;

		}
		if (precio < 30) {
			System.out.println("Tienes una penalizacion de " + DESCUENTO_MIN
					+ " €");
			precio = precio + DESCUENTO_MIN;

		}
		System.out.println("El total a pagar es de " + precio + " €");
		sc.close();

	}

}
