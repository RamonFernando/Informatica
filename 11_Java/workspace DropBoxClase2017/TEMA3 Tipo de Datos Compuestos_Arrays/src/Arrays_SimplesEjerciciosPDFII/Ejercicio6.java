/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio6 {

	/**
	 * @PDF-Ejercicio de Arrays II 6/17 Descripcion: Máximo y mínimo en un array
	 *                desordenado.
	 */
	public static void main(String[] args) {
		// 6.- Escribe una aplicación que vaya preguntando los votos de seis
		// partidos políticos en unas elecciones y guardándolos en un array. Al
		// acabar, dirá cuál ha sido el menor número de votos y cuál el mayor,
		// así como las posiciones del array que ocupan estos partidos.

		Scanner sc = new Scanner(System.in);
		System.out.println("Aplicacion de votos.");
		System.out.println("*=*=*=*=*=*=*=*=*=*\n");

		int votos[] = new int[6];

		// Declaracion de variables.
		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < votos.length; i++) {
			System.out.println("Introduzca el " + (i + 1) + " voto.");
			votos[i] = sc.nextInt();
			if (votos[i] < votos[posMin]) {
				posMin = i;
			}
			if (votos[i] > votos[posMax]) {
				posMax = i;
			}

		}
		System.out.println("==================Votos contados======================");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*\n");
		System.out.println("La menor votacion es: " + "\"" + votos[posMin] + "\"" + " y fue la " + (posMin + 1)
				+ "º en introducirse.");
		System.out.println("La mayor votacion es: " + "\"" + votos[posMax] + "\"" + " y fue la " + (posMax + 1)
				+ "º en introducirse.");
		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
		System.out.println("            ==== Fin del Programa ====");

		sc.close();
	}

}
