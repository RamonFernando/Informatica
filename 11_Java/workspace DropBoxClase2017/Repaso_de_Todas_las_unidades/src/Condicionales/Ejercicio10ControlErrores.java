/**
 * 
 */
package Condicionales;

import java.util.Scanner;



/**
 * @author Ramon
 *
 */
public class Ejercicio10ControlErrores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Pediremos un precio. Si es mayor de 100 euros haremos un descuento
		// del 15% y si no, no haremos descuento.
		Scanner sc = new Scanner(System.in);
		double precio = 0;

		boolean a = true;

		System.out.println("Introduzca un precio.");
		while (a) {

			if (sc.hasNextDouble()) {
				precio = sc.nextDouble();
				if (precio > 100) {
					System.out.println("Usted tiene un descuento del 15% "
							+ ((precio * 1.15) - precio));
					System.out.println("Total a pagar: " + (precio * 0.85));

				} else {
					System.out.println("Precio total a pagar: " + precio);

				}
			} else {
				System.out.println("Introduzca un precio valido.");
				sc.nextLine();
				
			}
		}
		sc.close();

	}

}
