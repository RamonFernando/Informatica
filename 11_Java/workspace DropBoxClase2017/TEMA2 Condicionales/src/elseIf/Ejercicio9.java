package elseIf;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio9 {

	/**
	 * PDF-Ejercicio de Condicionales 9/22 
	 * Descripcion: Condicionales Ejercicio
	 * con Condicionales con if/else.
	 */
	public static void main(String[] args) {
		// Crea un programa que pregunte el precio de un producto y el número de
		// unidades compradas. Si el coste de la compra es menor de 100 €, el
		// cliente no tiene derecho a un descuento. Si el coste sobrepasa los
		// 200 €, el descuento será del 15%. De lo contrario será del 10%
		// solamente.

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el precio de un producto:");
		System.out.println("************************************");
		float precio = entrada.nextFloat();

		System.out.println("Introduzca el numero de unidades:");
		System.out.println("*********************************");
		int unidades = entrada.nextInt();

		float cantidad = precio * unidades;
		float descuento = 0;

		if (cantidad < 100) {
			System.out.println("****************************");
			System.out.println("No tiene derecho a descuento.");

		} else if (cantidad >= 100 && cantidad <= 200) {

			descuento = (float) (cantidad * 0.10);
			precio = cantidad - descuento;
			System.out.println("************************************");
			System.out.println("Tiene un descuento del 10% = " + descuento
					+ " €");
			System.out.println("El precio final de su compra es: " + precio
					+ " €");

		} else if (cantidad > 200) {

			descuento = (float) (cantidad * 0.15);
			precio = cantidad - descuento;
			System.out.println("************************************");
			System.out.println("Tiene un descuento del 15% = " + descuento
					+ " €");
			System.out.println("El precio final de su compra es: " + precio
					+ " €");

		}

		entrada.close();
	}

}
