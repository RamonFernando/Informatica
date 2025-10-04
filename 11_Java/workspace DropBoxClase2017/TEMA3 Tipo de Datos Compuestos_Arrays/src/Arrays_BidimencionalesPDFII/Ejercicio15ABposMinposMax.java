/**
 * 
 */
package Arrays_BidimencionalesPDFII;

/**
 * @author Ramon
 *
 */
public class Ejercicio15ABposMinposMax {

	/**
	 * @PDF-Ejercicio de Arrays II 13/17 Descripcion: Ordenar el array 13/17
	 */
	public static void main(String[] args) {
		// 15.- Añade al programa anterior otro bucle que recorra el array y
		// encuentre el menor y el mayor precio.

		float total = 0;
		int posMin = 0;
		int posMax = 0;
		float min = 0;
		float max = 0;
		float precio = 0;

		System.out.println("	       \"Artículos\"");
		System.out.println("*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

		String precios[][] = { { "Tablet Samsung", "1120" },
				{ "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		for (int i = 0; i < precios.length; i++) {
			System.out.println("	" + precios[i][0] + " " + "\"" + precios[i][1]
					+ "\"");
		}
		System.out.println("\n*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

		for (int i = 0; i < precios.length; i++) {
			total = total + Float.parseFloat(precios[i][1]);
		}
		for (int i = 0; i < precios.length; i++) {
			precio = Float.parseFloat(precios[i][1]);
			min = Float.parseFloat(precios[posMin][1]);
			max = Float.parseFloat(precios[posMax][1]);
			if (precio < min) {
				posMin = i;
			}
			if (precio > max) {
				posMax = i;
			}
		}
		System.out.println(" Total: " + "\"" + total + "\"");

		System.out.println(" Precio minimo: " + "\"" + precios[posMin][1]
				+ "\"");
		System.out.println(" Precios maximo: " + "\"" + precios[posMax][1]
				+ "\"");

		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("       ==== Fin del Programa ====");
	}

}
