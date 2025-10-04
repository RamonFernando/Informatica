/**
 * 
 */
package Arrays_SimplesEjercicios;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio17 {

	/**
	 * @PDF-Ejercicio de Arrays I 17/17 Descripcion:
	 */
	public static void main(String[] args) {
		// 17.- Escribe una aplicación que pida al usuario diez precios de
		// productos. Después devolverá el precio total a pagar y el número de
		// productos cuyo precio sea mayor de 10 euros.

		Scanner sc = new Scanner(System.in);
		int precios[] = new int[10];
		int precioTotal = 0;
		int contador = 0;

		System.out.println("Escribe el precio de 10 productos.");

		for (int i = 0; i < precios.length; i++) {
			System.out.println((i+1) + "º Producto: ");
			precios[i] = sc.nextInt();
			precioTotal = precioTotal + precios[i];
			if (precios[i]>10) {
				contador++;
			}
		}
		System.out.println("Precio Total: " + precioTotal + " €");
		System.out.println("Hay " + contador + " mayores de 10 euros.");
		sc.close();

	}

}
