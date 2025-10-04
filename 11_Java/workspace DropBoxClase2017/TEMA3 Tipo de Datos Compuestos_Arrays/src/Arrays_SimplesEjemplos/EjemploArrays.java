/**
 * 
 */
package Arrays_SimplesEjemplos;

/**
 * @author Ramon
 *
 */
public class EjemploArrays {

	/**
	 * Ejemplo Arrays 1er Ejemplo.
	 */
	public static void main(String[] args) {
		// Como crear un array.

		double precios[] = { 102, 20.50, 30, 77, 12 };

		System.out.println("Posicion 0: " + precios[0]);
		System.out.println("Posicion 1: " + precios[1]);
		System.out.println("Posicion 2: " + precios[2]);
		System.out.println("Posicion 3: " + precios[3]);
		System.out.println("Posicion 4: " + precios[4]);

		System.out.println("Esto significa que el array es una posicion mas grande de la que toca");
		System.out.println("java.lang.ArrayIndexOutOfBoundsException: 5");

		for (int i = 0; i < precios.length; i++) {
			System.out.println("Posicion " + i + ": = " + precios[i]);
		}

	}

}
