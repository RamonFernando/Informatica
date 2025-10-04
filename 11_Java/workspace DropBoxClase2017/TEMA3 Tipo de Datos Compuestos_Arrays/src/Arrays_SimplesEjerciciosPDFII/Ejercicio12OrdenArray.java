/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

/**
 * @author Ramon
 *
 */
public class Ejercicio12OrdenArray {

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

		int numAtomicos[] = { 8, 2, 10, 20, 12, 71, 15, 23 };
		// Declaracion de Variables.
		int posMin = 0;
		int posMax = 0;
		int aux;
		System.out
				.println("=============== Numeros Atómicos =================");

		for (int i = 0; i < numAtomicos.length; i++) {
			if (numAtomicos[i] < numAtomicos[posMin]) {
				posMin = i;
			}
		}
		for (int i = 0; i < numAtomicos.length; i++) {
			if (numAtomicos[i] > numAtomicos[posMax]) {
				posMax = i;
			}
		}
		System.out
				.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
		System.out.println("El numero atomico menor es: " + "\""
				+ numAtomicos[posMin] + "\"" + " y esta en la posicion: "
				+ "\"" + posMin + "\"");
		System.out.println("\nEl numero atomico mayor es: " + "\""
				+ numAtomicos[posMax] + "\"" + " y esta en la posicion: "
				+ "\"" + posMax + "\"\n");

		for (int i = 0; i < numAtomicos.length-1; i++) {
			posMin = i;
			for (int j = i + 1; j < numAtomicos.length; j++) {
				if (numAtomicos[j] < numAtomicos[posMin]) {
					posMin = j;
				}
			}
			aux = numAtomicos[i];
			numAtomicos[i] = numAtomicos[posMin];
			numAtomicos[posMin] = aux;
		}
		System.out
				.println("**================ Array Ordenado ==================**");
		System.out
				.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");

		for (int k = 0; k < numAtomicos.length; k++) {

			System.out.print(k + "º" + "\"" + numAtomicos[k] + "\" ");

		}
		System.out
		.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
		System.out.println("            ==== Fin del Programa ====");
	}

}
