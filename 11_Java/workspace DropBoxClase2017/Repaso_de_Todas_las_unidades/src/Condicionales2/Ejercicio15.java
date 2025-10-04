/**
 * 
 */
package Condicionales2;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio15 {

	/**
	 * PDF- Estructuras de condicionales.
	 */
	public static void main(String[] args) {
		// 15.- Crea un programa que solicite al usuario los precios de cuatro
		// objetos y devuelva el precio total.

		Scanner sc = new Scanner(System.in);
		double precio = 0;
		int num = 1;
		double precioTotal = 0;
		System.out.println("Introduce el precio de 4 productos:");

		while (num <= 4) {

			while (precio < 0) {
				System.out.println("Introduzca un precio valido.");
				precio = sc.nextDouble();
			}

			System.out.println("Producto: " + num);
			precio = sc.nextDouble();
			num++;
			precioTotal = precioTotal + precio;
			// Se suma el precio con cada pasada del bulcle.
			// System.out.println("Su precio total es de: " + precioTotal + " €"); 
			

		}
		System.out.println("Su precio total es de: " + precioTotal + " €");
		sc.close();

	}

}
