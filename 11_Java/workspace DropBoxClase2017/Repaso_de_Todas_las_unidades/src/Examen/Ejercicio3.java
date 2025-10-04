/**
 * 
 */
package Examen;

/**
 * @author Ramon
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Escribe un programa que almacene los datos de la siguiente tabla en
		// un array bidimensional
		// Juan 1,77
		// Pedro 2,01
		// Marcos 1,85
		// Raul 1,74
		// A continuacion informara de cual es la persona de mayor altura, y
		// cual la de menor altura, con este formato...

		// Declaracion de variables

		int posMin = 0;
		int posMax = 0;
		double min = 0;
		double max = 0;
		double precio;
		

		String precios[][] = { { "Juan", "1.77" }, { "Pedro", "2.01" },
				{ "Marcos", "1.05" }, { "Raul", "2.74" } };

		System.out.println("Array Bidimensional");
		System.out.println("-------------------");

		for (int i = 0; i < precios.length; i++) {
			
			precio = Double.parseDouble(precios[i][1]);
			min = Double.parseDouble(precios[posMin][1]);
			max = Double.parseDouble(precios[posMax][1]);
			
			 if (Double.parseDouble(precios[i][1]) < Double
			 .parseDouble(precios[posMin][1])) {
			 posMin = i;
			 }
			 if (Double.parseDouble(precios[i][1]) > Double
			 .parseDouble(precios[posMax][1])) {
			 posMax = i;
			 }
			
//			if (precio < min) {
//				posMin = i;
//			}
//			if (precio > max) {
//				posMin = i;
//			}
			
		}
		System.out.println();
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i][0] + " " + precios[i][1] + " ");

		}
		System.out.println("----------------------------");
		System.out.println("Altura Min: " + precios[posMin][1] + " es " + precios[posMin][0] + ".");
		System.out.println("Altura Max: " + precios[posMax][1] + " es " + precios[posMax][0] + ".");

	}
}
