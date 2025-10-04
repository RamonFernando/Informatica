/**
 * 
 */
package Arrays_BidimencionalesPDFII;

/**
 * @author horabaixa
 *
 */
public class Ejercicio13BidimencionalesMostrar {

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
		double medidas[][] = { { 8.5,1020,40},
							   { 14.2,1021,35}, 
							   { 11,1022,45},
							   {7,1023,50} };

		// Declaracion de variable.

		// Desarrollo.

		System.out
				.println("*================ Array de Medidas =================*");
		System.out
				.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*\n");

		System.out.println("Temperaturas " + " Presion " + "    Humedad");
		// for (int i = 0; i < medidas.length; i++) {
		// System.out.print(" 	" + medidas[i][0]);
		// }
		// System.out.println(" ");
		// for (int i = 0; i < medidas.length; i++) {
		// System.out.print(" 	" + medidas[i][1]);
		// }
		// System.out.println(" ");
		// for (int i = 0; i < medidas.length; i++) {
		// System.out.print(" 	" + medidas[i][2]);
		// }
		
		for (int i = 0; i < medidas.length; i++) {
			System.out.println("    " + medidas[i][0] + "ºC " + "   " + medidas[i][1] + " mbar " + "  "+ medidas[i][2] + "%");
		}

		// medidas[0][0] = 8.5;
		// medidas[0][1] = 14.2;
		// medidas[0][2] = 11;
		// medidas[0][3] = 7;
		//
		// medidas[1][0] = 1020;
		// medidas[1][1] = 1021;
		// medidas[1][2] = 1022;
		// medidas[1][3] = 1023;
		//
		// medidas[2][0] = 40;
		// medidas[2][1] = 35;
		// medidas[2][2] = 45;
		// medidas[2][3] = 50;

		System.out.println(" ");
		System.out
				.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
		System.out.println("            ==== Fin del Programa ====");

	}

}
