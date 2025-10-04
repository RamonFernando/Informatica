/**
 * 
 */
package Array_II;

/**
 * @author Ramon
 *
 */
public class Ejercicio8 {

	/**
	 * @PDF-Ejercicio de Arrays II 8/17 Descripcion: Array PosMin y posMax 4/9
	 * 
	 */
	public static void main(String[] args) {
		// 8.- La siguiente tabla muestra la humedad relativa en una localidad
		// de Mallorca a lo largo de las 24 horas de un día. Crea un programa
		// capaz de recorrer este array e indicar cuáles han sido las humedades
		// máxima y mínima del día, y a qué horas se han producido.

		// Array 1
		// Hora // %
		// 8 45
		// 9 50
		// 10 55
		// 11 60
		// 12 65
		// 13 70
		// 14 70
		// 15 75

		// Array 2
		// Hora // %
		// 0 45
		// 1 40
		// 2 40
		// 3 40
		// 4 37
		// 5 35
		// 6 39
		// 7 39

		// Array 3
		// Hora //%
		// 16 75
		// 17 72
		// 18 65
		// 19 60
		// 20 55
		// 21 50
		// 22 50
		// 23 45

		int posMin = 0;
		int posMax = 0;

		int humedades[] = { 45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65,
				70, 70, 75, 75, 72, 65, 60, 55, 50, 50, 45 };
		int horas[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
				16, 17, 18, 19, 20, 21, 22, 23 };

		for (int i = 0; i < horas.length; i++) {
			if (humedades[i] < humedades[posMin]) {
				posMin = i;
			}
			if (humedades[i] > humedades[posMax]) {
				posMax = i;
			}
		}
		System.out
				.println("**==============  Temperaturas  =================**");
		System.out
				.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*\n");
		System.out.println("La menor temperatura es: " + "\""
				+ humedades[posMin] + "\"" + " y se produjo a las " + "\""
				+ horas[posMin] + "\" horas.");
		System.out.println("La menor temperatura es: " + "\""
				+ humedades[posMax] + "\"" + " y se produjo a las " + "\""
				+ horas[posMax] + "\" horas.");
		System.out
				.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
		System.out.println("            ==== Fin del Programa ====");
	}

}
