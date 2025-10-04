/**
 * 
 */
package Arrays_I;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio17 {

	/**
	 * @PDF-Ejercicios Arrays I 17/17
	 */
	public static void main(String[] args) {
		// 17.- Escribe una aplicación que pida al usuario diez precios de
		// productos. Después devolverá el precio total a pagar y el número de
		// productos cuyo precio sea mayor de 10 euros.

		Scanner sc = new Scanner(System.in);

		double productos[] = new double[10];
		double suma = 0;
		double media = 0;
		System.out.println("Productos");
		System.out.println("------------------");
		System.out.println("Introduce el precio de 10 productos");
		for (int i = 0; i < productos.length; i++) {
			System.out.println((i + 1) + "º Producto:");
			productos[i] = sc.nextDouble();
		}
		System.out.println("Todos los precios son: ");
		System.out.println("----------------------");
		for (int i = 0; i < productos.length; i++) {
			System.out.println((i + 1) + "º producto: " + productos[i] + " €");
		}
		System.out.println("----------------------");
		for (int i = 0; i < productos.length; i++) {
			suma = suma + productos[i];
			if (productos[i] > 10) {
				System.out.println("Producto mayor de 10 es: " + productos[i]
						+ " €");
			}
		}
		 media = suma/productos.length;
		System.out.println("----------------------");
		System.out.println("El precio total a pagar es: " + suma + " €");
		System.out.println("Los gastos de media de esta compra son: " + media + " €");

		sc.close();

	}

}
