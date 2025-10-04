/**
 * 
 */
package Arrays_SimplesEjercicios;

/**
 * @author Ramon
 *
 */
public class Ejercicio15con2Decimales {

	/**
	 * @PDF-Ejercicio de Arrays I 15/17 Descripcion: Con un print en 2 decimales
	 */
	public static void main(String[] args) {
		// 15.- Crea un programa que declare un array con las siguientes
		// temperaturas de las últimas dos semanas y devuelva la temperatura
		// media:
		// 15 ºC
		// 16'1 ºC
		// 16 ºC
		// 15'4 ºC
		// 15 ºC
		// 14 ºC
		// 10'2 ºC
		// 11 ºC
		// 11'5 ºC
		// 10 ºC
		// 10'1 ºC
		// 9'8 ºC
		// 9 ºC
		// 6 ºC

		double temp[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1,
				9.8, 9, 6 };

		double suma = 0;
		double media = 0;

		for (int i = 0; i < temp.length; i++) {
			System.out.print("\"" + temp[i] + "\"" + " ");
			suma = suma + temp[i];
		}
		media = suma / temp.length;

		// Metodo para un decimal con 2 decimas.

		System.out.printf("\n\nTemperatura media en %.2f ", media);
		System.out.println("\nTemperatura media: " + (float) media + " ºC");
		
	}

}
