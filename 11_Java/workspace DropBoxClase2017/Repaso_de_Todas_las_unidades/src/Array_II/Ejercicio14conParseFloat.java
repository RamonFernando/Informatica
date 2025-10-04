/**
 * 
 */
package Array_II;

/**
 * @author Ramon
 *
 */
public class Ejercicio14conParseFloat {

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

		// Declaracion de Variable.
		float precioTotal = 0;

		String artículos[][] = { { "Tablet Samsung", "120" },
				{ "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		System.out.println("\t -- Artículos --");
		System.out.println("----------------------------------");
		for (int i = 0; i < artículos.length; i++) {
			System.out.println("Artículos: " + "\"" + artículos[i][0] + "\""
					+ " " + artículos[i][1] + " €");
			precioTotal = precioTotal + Float.parseFloat(artículos[i][1]);
		}
		System.out.println("----------------------------------");
		System.out.println("El precio total a pagar es: " + precioTotal + " €");
		System.out.println("----------------------------------");
		System.out.println("      -- Fin del Programa --");
	}

}
