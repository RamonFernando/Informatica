/**
 * 
 */
package Array_II;

/**
 * @author Ramon
 *
 */
public class Ejercicio5 {

	/**
	 * @PDF-Ejercicio de Arrays II 5/17 Descripcion: Búsqueda en Arrays
	 *                desordenados 1-4
	 */
	public static void main(String[] args) {
		// // 5.- Escribe un programa que guarde las siguientes temperaturas en
		// un
		// array y busque su máximo y mínimo. Además deberá indicar en qué
		// posición del array están ese máximo y mínimo.
		// 20 25 30 28 39 42 30 29 28 21 60 55 20 19

		int temperaturas[] = { 20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55,
				20, 19 };

		int posMax = 0;
		int posMin = 0;
		System.out.println("Temperaturas");
		System.out.println("----------------------------");

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("\"" + temperaturas[i] + "\"" + " ");
			if (temperaturas[i] < temperaturas[posMin]) {
				posMin = i;
			}
			if (temperaturas[i] > temperaturas[posMax]) {
				posMax = i;
			}

		}
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println("El menor valor del array es: " + "\""
				+ temperaturas[posMin] + "\"" + " y esta en la posicion "
				+ "\"" + posMin + "\"");
		System.out.println("El mayor valor del array es: " + "\""
				+ temperaturas[posMax] + "\"" + " y esta en la posicion "
				+ "\"" + posMax + "\"");
		System.out.println("----------------------------");
		System.out.println("-- Fin del Programa --");
	}

}
