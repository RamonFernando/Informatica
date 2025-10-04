/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio2Carlos {

	/**
	 * @PDF-Ejercicio de Arrays II 2/17 Descripcion: Búsqueda en Arrays
	 *                desordenados 1-4
	 */
	public static void main(String[] args) {
		// Hecho por el profe.
		
		Scanner entrada = new Scanner(System.in);
		float[] estaturas = new float[10];

		for (int i = 0; i < estaturas.length; i++) {
			System.out.print("Estatura " + i + ": ");
			estaturas[i] = entrada.nextFloat();
		}

		for (int i = 0; i < estaturas.length; i++) {
			if (estaturas[i] > 1.90f) {
				System.out.println("Hay alguna estatura mayor de 1'90m.");
				break;
			}
}
		entrada.close();
	}

}
