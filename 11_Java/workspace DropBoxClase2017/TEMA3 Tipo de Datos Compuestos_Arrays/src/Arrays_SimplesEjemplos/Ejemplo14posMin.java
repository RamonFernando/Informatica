/**
 * 
 */
package Arrays_SimplesEjemplos;

/**
 * @author horabaixa
 *
 */
public class Ejemplo14posMin {

	/**
	 * Buscar la posicion min de un Array
	 */
	public static void main(String[] args) {
		// Ejemplo hecho en clase.

		int temperaturas[] = { 5, 1, 3, 10, 8 };
		// Declaracion de variables.
		int posMin = 0;

		// Recorramos el array comprobando cada posicion con el valor guardado
		// en la posicion min.
		for (int i = 0; i < temperaturas.length; i++) {

			// Si encontramos un valor mas pequeño que el de posMin, lo
			// guardamos.

			if (temperaturas[i] < temperaturas[posMin]) {
				posMin = i;
			}
		}

		// Recorremos el array comprobando cada posicion del array con el valor
		// guardado en posMin.

		System.out.println("La menor temperatura esta en la posicion: " + (posMin+1) + " y el valor es: " + temperaturas[posMin]);

	}

}
