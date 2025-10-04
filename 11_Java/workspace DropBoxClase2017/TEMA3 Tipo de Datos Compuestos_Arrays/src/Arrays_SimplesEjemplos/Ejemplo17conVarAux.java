/**
 * 
 */
package Arrays_SimplesEjemplos;

/**
 * @author Ramon
 *
 */
public class Ejemplo17conVarAux {

	/**
	 * Ejemplo de Ordenar un Array.
	 */
	public static void main(String[] args) {
		// Un array que se van a intercambiar 2 posiciones.

		int precios[] = { 3, 450, 2, 8, 2, 1 };
		int aux;

		// Queremos intercambiar las posiciones 0 y 5:
		aux = precios[0];
		precios[0] = precios[5];
		precios[5] = aux;

		for (int i = 0; i < precios.length; i++) {
			System.out.print(precios[i] + " ");
		}

	}

}
