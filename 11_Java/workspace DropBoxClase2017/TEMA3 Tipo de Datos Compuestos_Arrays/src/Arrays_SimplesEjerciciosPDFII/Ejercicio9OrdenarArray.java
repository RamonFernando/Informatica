/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

/**
 * @author Ramon
 *
 */
public class Ejercicio9OrdenarArray {

	/**
	 * @PDF-Ejercicio de Arrays II 5/17 Descripcion: Ordenar el array 9/12
	 * 
	 */
	public static void main(String[] args) {
		// 9.- Crea un programa que muestre los siguientes precios (guardados en
		// un array llamado precios) ordenados de menor a mayor, usando el
		// método de selección.

		// 43
		// 58
		// 44
		// 62
		// 80
		// 15
		// 15
		// 10
		// 90
		// 56

		int precios[] = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };

		// Declaracion de variables.
		int aux = 0;

		for (int i = 0; i < precios.length - 1; i++) {
			for (int j = i + 1; j < precios.length; j++) {
				if (precios[j] < precios[i]) {
					aux = precios[i];
					precios[i] = precios[j];
					precios[j] = aux;
				}

			}
		}

		System.out
				.println("================= Array de Precios ===================");
		System.out
				.println("**================ Array Ordenado ==================**");
		System.out
				.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*\n");

		for (int i = 0; i < precios.length; i++) {
			System.out.print("" + "\"" + precios[i] + "\"" + " ");
		}
		System.out
				.println("\n\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
		System.out.println("            ==== Fin del Programa ====");
	}

}
