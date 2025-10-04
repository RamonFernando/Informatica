/**
 * 
 */
package Arrays_I;

/**
 * @author Ramon
 *
 */
public class Ejercicio15 {

	/**
	 * @PDF-Ejercicios Arrays I 15/17
	 */
	public static void main(String[] args) {
		// // 15.- Crea un programa que declare un array con las siguientes
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
		
		double temperaturas[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };
		
		// Declaracion de Variable.
		double media = 0;
		double suma = 0;
		
		System.out.println("Temperaturas");
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < temperaturas.length; i++) {
			suma = suma + temperaturas[i];
			System.out.println((i+1) + "º" + "\"" + temperaturas[i]+"\" ");
		}
		media = suma/temperaturas.length;
		System.out.println("-----------------------------------");
		System.out.println("La temperatura media es: " + (float)media + " ºC");
		System.out.printf("Temperaturas %.3f", media);
	}

}
