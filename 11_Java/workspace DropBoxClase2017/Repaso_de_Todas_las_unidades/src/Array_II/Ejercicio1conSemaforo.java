/**
 * 
 */
package Array_II;

/**
 * @author Ramon
 *
 */
public class Ejercicio1conSemaforo {

	/**
	 * @PDF-Ejercicio de Arrays II 1/17 Descripcion: Búsqueda en Arrays
	 *                desordenados 1-4 con Semaforo.
	 */
	public static void main(String[] args) {
		// 1.- Crea un programa que guarde la siguiente tabla de edades en forma
		// de array. A continuación deberá buscar si hay alguna persona con 35
		// años. Si la hay, se mostrará el mensaje "Localizada persona de 35
		// años". Utiliza una variable semáforo llamada edadEncontrada.

		// 20 25 30 28 39 42 30 29 28 21 60 55 20 19

		int edades[] = { 20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20,
				19, 35 };

		boolean edadEncontrada = false;
		System.out.println("\"Edades\"");
		System.out.println("======================");

		for (int i = 0; i < edades.length; i++) {
			System.out.print("\"" + edades[i] + "\" ");

		}
		System.out.println(" ");
		System.out.println("======================");
		int i = 0;
		while (edadEncontrada == false && i < edades.length) {
			if (edades[i] == 35) {

				System.out.println("Localizada persona con: " + "\""
						+ edades[i] + "\"" + " años " + " en la posicion: "
						+ "\"" + i + "\".");
				edadEncontrada = true;

			}
			if (edades[i] != 35) {
				edadEncontrada = false;

			}
			i++;
		}
		System.out.println("\n======================");
		System.out.println("== Fin del Programa ==");
	}

}
