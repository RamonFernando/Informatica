/**
 * 
 */
package Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejer9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		try {
			double precio = 0;
			int unidades = 0;
			double finalPrecio;

			System.out.println("Introduzca el precio de un producto: ");
			precio = sc.nextDouble();
			System.out.println("Introduzca el numero de unidades: ");
			unidades = sc.nextInt();
			finalPrecio = precio * unidades;
			if (finalPrecio < 100) {

				System.out.println("No tiene derecho a descuento");
				System.out.println("Importe total a pagar: " + finalPrecio
						+ " €");
			} else if (finalPrecio > 200) {
				finalPrecio = precio * unidades;
				System.out.println("Importe total: " + finalPrecio + " €");
				System.out.println("Descuento del 15%: "
						+ ((finalPrecio * 1.15) - finalPrecio) + " €");
				System.out.println("Total a pagar: " + (finalPrecio * 0.85)
						+ " €");
			} else if (finalPrecio >= 100 && finalPrecio <= 200) {
				System.out.println("Importe total: " + finalPrecio + " €");
				System.out.println("Descuento del 10%: "
						+ ((finalPrecio * 1.10) - finalPrecio) + " €");
				System.out.println("Total a pagar: " + (finalPrecio * 0.90)
						+ " €");
			}
		} catch (Exception e) {
			System.out.println("Parametro incorrecto ");
			System.out.println("Tipo de Error: " + e.toString());
			System.out.println("Fin del Programa.");
		}

		sc.close();
	}
}
