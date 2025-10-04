/**
 * 
 */
package Arrays_BidimencionalesPDFII;

/**
 * @author Ramon
 *
 */
public class Ejercicio14ABconParseFloat {

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
		float total = 0;

		System.out.println("	       \"Artículos\"");
		System.out.println("*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

		String precios[][] = { { "Tablet Samsung", "120" },
				{ "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		for (int i = 0; i < precios.length; i++) {
			System.out.println("	" + precios[i][0] + " " + precios[i][1]);
		}
		System.out.println("\n*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

		for (int i = 0; i < precios.length; i++) {
			total = total + Float.parseFloat(precios[i][1]);
		}
		System.out.println(" Total: " + total);
		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*");
		System.out.println("       ==== Fin del Programa ====");
	}

}
