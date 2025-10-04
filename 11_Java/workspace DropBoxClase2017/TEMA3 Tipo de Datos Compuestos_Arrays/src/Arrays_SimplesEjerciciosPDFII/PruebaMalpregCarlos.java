/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

/**
 * @author Ramon
 *
 */
public class PruebaMalpregCarlos {

	/**
	 * 
	 */
	public static void main(String[] args) {
		int numAtomicos[] = { 8, 2, 10, 20, 12, 71, 15, 23 };
		// Declaracion de Variables.
		int posMin = 0;
		int posMax = 0;
		int aux;

		for (int i = 0; i < numAtomicos.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < numAtomicos.length; j++) {
				if (numAtomicos[j] < numAtomicos[posMin]) {
					posMin = j;

				}

				if (numAtomicos[i] > numAtomicos[posMax]) {
					posMax = i;
				}
			}
			aux = numAtomicos[i];
			numAtomicos[i] = numAtomicos[posMin];
			numAtomicos[posMin] = aux;

		}
		System.out.println("============== Numeros Atomicos =================");
		System.out
				.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*\n");
		System.out.println("El numero atomico menor es: " + "\""
				+ numAtomicos[posMin] + "\"" + " y esta en la posicion: "
				+ "\"" + posMin + "\"");
		System.out.println("\nEl numero atomico mayor es: " + "\""
				+ numAtomicos[posMax] + "\"" + " y esta en la posicion: "
				+ "\"" + posMax + "\"");
		System.out
				.println("\n\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
		for (int k = 0; k < numAtomicos.length; k++) {

			System.out.print(numAtomicos[k] + " ");
		}
		System.out
				.println("\n\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
		System.out.println("            ==== Fin del Programa ====");
		
		
	}

}
