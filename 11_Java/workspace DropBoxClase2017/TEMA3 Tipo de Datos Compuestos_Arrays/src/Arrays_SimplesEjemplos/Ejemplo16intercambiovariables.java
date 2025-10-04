/**
 * 
 */
package Arrays_SimplesEjemplos;

/**
 * @author Ramon
 *
 */
public class Ejemplo16intercambiovariables {

	/**
	 * Ejemplo de Ordenar un Array.
	 */
	public static void main(String[] args) {
		int x = 15;
		int y = 10;
		int aux;

		System.out.println("La X vale " + x + ", y la Y vale " + y);

		// x = y;
		// y = x;

		aux = x;
		x = y;
		y = aux;

		System.out.println("La X vale " + x + ", y la Y vale " + y);

	}

}
