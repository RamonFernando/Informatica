/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

/**
 * @author Ramon
 *
 */
public class Ejercicio12 {

	/**
	 * @PDF-Ejercicio de Arrays II 12/17 Descripcion: Ordenar el array 9/12
	 */
	public static void main(String[] args) {
		// 12.- La siguiente tabla muestra los números atómicos de los elementos
		// que forman una muestra de un material desconocido. Escribe un
		// programa que los muestre ordenados de menor a mayor. Al final también
		// indicará el número atómico menor y el mayor.
		// 8
		// 2
		// 10
		// 20
		// 12
		// 71
		// 15
		// 23
		int elementosAtomicos[] = { 8, 2, 10, 20, 12, 71, 15, 23 };

		// Declarar Variables
		int posMin = 0;
		int posMax = 0;
		int aux = 0;
		System.out.println("Numeros Atómicos");
		System.out.println("*=*=*=*=*=*=*=*=*");

		for (int i = 0; i < elementosAtomicos.length; i++) {
			if (elementosAtomicos[i] < elementosAtomicos[posMin]) {
				posMin = i;
			}
		}
		System.out.println("El numero atómico menor es: "
				+ elementosAtomicos[posMin] + " y esta en la posicion: "
				+ posMin);

		for (int i = 0; i < elementosAtomicos.length; i++) {
			if (elementosAtomicos[i] > elementosAtomicos[posMax]) {
				posMax = i;
			}
		}
		System.out.println("El numero atómico mayor es: "
				+ elementosAtomicos[posMax] + " y esta en la posicion: "
				+ posMax);
		for (int i = 0; i < elementosAtomicos.length; i++) {
			for (int j = i + 1; j < elementosAtomicos.length; j++) {
				if (elementosAtomicos[j] < elementosAtomicos[i]) {
					aux = elementosAtomicos[i];
					elementosAtomicos[i] = elementosAtomicos[j];
					elementosAtomicos[j] = aux;
				}
			}
		}

		System.out.println("\n=== Array ordenado ===");
		for (int i = 0; i < elementosAtomicos.length; i++) {
			System.out.print("\"" + (i + 1) + "º " + elementosAtomicos[i]
					+ "\"  ");
		}
		System.out
				.println("\n\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
		System.out.println("            ==== Fin del Programa ====");
	}

}
