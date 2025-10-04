/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

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
		int i = 0;
		// int suma = 0;
		System.out.println("Edades");
		System.out.println("*=*=*=*");

		while (edadEncontrada == false && i < edades.length) {

			if (edades[i] == 35) {

				System.out.println("En la posicion " + i
						+ " hay una persona con 35 años.");

				edadEncontrada = true;

			}
			if (edades[i] != 35) {

				System.out.println(edades[i]);
				edadEncontrada= false;
			}
			i++;
		}

	}

}
