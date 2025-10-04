/**
 * 
 */
package Arrays_SimplesEjemplos;

/**
 * @author Ramon
 *
 */
public class EjemploArrays8 {

	/**
	 * Ejemplo8
	 */
	public static void main(String[] args) {

		// Precio de varios productos.
		double a[] = { 2.5, 1.15, 4, 10.50, 6.35 };

		// Unidades compradas de cada producto.
		int b[] = { 3, 5, 4, 3, 4 };

		// Total gastado em cada producto.
		double c[] = new double[5];

		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] * b[i];
		}
		System.out.println("\tPrecio €\tUnidades\tTotal €");
		for (int i = 0; i < c.length; i++) {
			System.out.println((i + 1) + "º\t" + a[i] + " € " + "\t \t   " + b[i] + "\t" + "\t " + c[i]);
		}
	}

}
