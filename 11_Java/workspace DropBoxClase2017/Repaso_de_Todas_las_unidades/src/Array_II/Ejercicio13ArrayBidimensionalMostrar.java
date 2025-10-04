/**
 * 
 */
package Array_II;

/**
 * @author Ramon
 *
 */
public class Ejercicio13ArrayBidimensionalMostrar {

	/**
	 * @PDF-Ejercicio de Arrays II 13/17 Descripcion: Arrays Bidimencionales
	 *                13/17
	 */
	public static void main(String[] args) {
		// 13.- La tabla siguiente muestra tres magnitudes meteorológicas
		// medidas en cuatro momentos del día. Guarda estos datos en un array
		// bidimensional llamado medidas.

		// Columna 1 Temperatura(ºC)
		// 8'5
		// 14'2
		// 11
		// 7

		// Columna 2 Presion (mbar)
		// 1020
		// 1021
		// 1022
		// 1023

		// Columna 3 Humedad(%)
		// 40
		// 35
		// 45
		// 50

		// A continuación muestra en la pantalla estas medidas fila a fila:

		// Declaracion de Array Bidimencional
		double medidas[][] = { { 8.5, 1020, 40 }, { 14.2, 1021, 35 },
				{ 11, 1022, 45 }, { 7, 1023, 50 } };
		System.out
				.println("========= Magnitudes Meteorológicas ===============");
		System.out.println("    Temperatura    Presion      Humedad");
		for (int i = 0; i < medidas.length; i++) {
			System.out.println("\t" + medidas[i][0] + "ºC     " + medidas[i][1]
					+ " mbar    " + medidas[i][2] + " %");
		}
		System.out
				.println("===================================================");
		System.out.println("           ** Fin del Programa **");
	}

}
