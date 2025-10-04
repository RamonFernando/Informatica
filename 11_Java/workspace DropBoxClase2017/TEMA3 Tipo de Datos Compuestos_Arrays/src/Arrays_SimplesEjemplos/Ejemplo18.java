/**
 * 
 */
package Arrays_SimplesEjemplos;

/**
 * @author Ramon
 *
 */
public class Ejemplo18 {

	/**
	 * Ejemplo de como ordenar un array. Carlos Sogort
	 */
	public static void main(String[] args) {
		// Ordenar un array.

		int edades[] = { 10, 5, 4, 8, 20, 16 };

		int aux; // Variable auxiliar para intercambiar dos posiciones del
					// array.

		int posMin = 0; // Indice de la posicion donde esta el minimo.

		// Recorremos el array desde la posicion 0 hasta la penultima posicion.

		for (int i = 0; i < edades.length - 1; i++) {
			posMin = i;
			// Para cada valor de i buscamos el minimo de los valores entre i y
			// el final del array.

			for (int j = i + 1; j < edades.length; j++) {
				if (edades[j] < edades[posMin]) {
					posMin = j;
				}
			}
			// Ahora posMin indica la pòsicion del elemento mas pequeño
			// entre i y el final del array.

			// Intercambiamos la posicion i con la posicion posMin.
			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;

			// Mostramos como va quedando el array simplemente para ver como va
			// quedando.
			for (int k = 0; k < edades.length; k++) {
				System.out.print(edades[k] + "  ");
			}
			System.out.println(" ");
		}

		for (int k = 0; k < edades.length; k++) {
			System.out.print(edades[k] + "  ");
		}

	}

}
