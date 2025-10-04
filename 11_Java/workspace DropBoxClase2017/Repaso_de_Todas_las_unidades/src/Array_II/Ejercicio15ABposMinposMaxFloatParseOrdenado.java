/**
 * 
 */
package Array_II;

/**
 * @author Ramon
 *
 */
public class Ejercicio15ABposMinposMaxFloatParseOrdenado {

	/**
	 * @PDF-Ejercicio de Arrays II 14/17 Descripcion: Ordenar el array 13/17
	 */
	public static void main(String[] args) {

		// 14.- Esta tabla muestra los nombres y precios de cuatro artículos de
		// unos grandes almacenes:

		// Tablet Samsung 120
		// Móvil Sony 115
		// Ipad Mini 290
		// Móvil HTC 95

		// Guarda la información en un array llamado precios. Después, muestra
		// esta información en pantalla y calcula el precio total de los cuatro
		// artículos.

		// 15.- Añade al programa anterior otro bucle que recorra el array y
		// encuentre el menor y el mayor precio.

		// Opcional.
		// Ordenalo de menor a mayor.

		// Declaracion de Variable.
		float precioTotal = 0;
		int posMin = 0;
		int posMax = 0;
		// float min = 0;
		// float max = 0;
		float precios = 0;
		int aux = 0;

		String artículos[][] = { { "Tablet Samsung", "1120" },
				{ "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		System.out.println("\t -- Artículos --");
		System.out.println("----------------------------------");
		for (int i = 0; i < artículos.length; i++) {
			System.out.println("Artículos: " + "\"" + artículos[i][0] + "\""
					+ " " + artículos[i][1] + " €");
			precioTotal = precioTotal + Float.parseFloat(artículos[i][1]);
		}

		for (int i = 0; i < artículos.length; i++) {
			posMin = i;

			for (int j = i + 1; j < artículos.length - 1; j++) {
				posMax = j;
				precios = Float.parseFloat(artículos[i][1]);
				// min = Float.parseFloat(artículos[posMin][1]);
				// max = Float.parseFloat(artículos[posMax][1]);

				// if (precios < min) {
				// posMin = i;
				// }
				// if (precios > min) {
				// posMax = i;
				// }
				//
				//
				if (Float.parseFloat(artículos[i][1]) < Float
						.parseFloat(artículos[posMin][1])) {
					posMin = i;
				}
				if (Float.parseFloat(artículos[i][1]) > Float
						.parseFloat(artículos[posMax][1])) {
					posMax = i;
				}

			}

			aux = posMin;
			artículos[i][1] = artículos[posMin][1];
			artículos[posMin][1] = artículos[aux][1];

			// posMin = i;
			// for (int j = i+1; j < artículos.length; j++) {
			// if (precios < min) {
			// posMin = i;
			// }
			// aux = precios;
			// precios = min;
			// min = aux;
			//
			// }

		}
		System.out.println("----------------------------------");
		System.out.println("El precio total a pagar es: " + precioTotal + " €");
		System.out.println("----------------------------------");
		System.out.println("El producto mas barato es " + artículos[posMax][0]
				+ " " + artículos[posMin][1] + " y esta en la posicion "
				+ posMin);
		System.out.println("El producto mas caro es " + artículos[posMax][0]
				+ " " + artículos[posMax][1] + " y esta en la posicion "
				+ posMax);
		System.out.println("----------------------------------");
		System.out.println("\nArray Ordenado");

		System.out.println("----------------------------------");
		for (int i = 0; i < artículos.length; i++) {
			System.out.print(artículos[i][1] + " ");
		}
		System.out.println(" ");
		System.out.println("----------------------------------");
		System.out.println("      -- Fin del Programa --");

	}

}
