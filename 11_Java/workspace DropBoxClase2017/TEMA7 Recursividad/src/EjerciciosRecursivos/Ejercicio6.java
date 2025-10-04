package EjerciciosRecursivos;

public class Ejercicio6 {

	public static void main(String[] args) {
		int[] precios = { 23, 15, 18, 20, 57 };

		System.out.println("Mínimo: " + minimo(precios, precios.length));
	}

	/**
	 * Calcula recursivamente el mínimo de un array.
	 * 
	 * @param lista
	 *            Array cuyo mínimo buscamos.
	 * @param n
	 *            Número de elementos del array.
	 * @return Mínimo del array.
	 */
	public static int minimo(int[] lista, int n) {

		if (n == 1) {
			// Caso base: El array sólo tiene un elemento.
			return lista[0];
		} else {
			// Caso recursivo.
			return Math.min(minimo(lista, n - 1), lista[n - 1]);
		}

	}

}