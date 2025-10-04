/**
 * 
 */
package Arrays_SimplesEjercicios;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio5 {

	/**
	 * @PDF-Ejercicios Arrays I 5/17
	 */
	public static void main(String[] args) {
		// 5.- Crea un array llamado notas con cinco posiciones y ve asignando a
		// cada una de ellas el valor de un examen que hayas hecho este curso
		// (no sólo de programación). Haz que después se muestren todos los
		// valores mediante un bucle while.

		Scanner sc = new Scanner(System.in);
		float notas[] = new float[5];

		int i = 0;
		System.out.println("Array de Notas");
		System.out.println("----------------");
		System.out.println("\nIntroduce 5 notas\n");

		while (i < notas.length) {
			System.out.println((i + 1) + "º Nota: ");
			notas[i] = sc.nextFloat();
			i++;
		}
		System.out.println("\n----------------");
		System.out.println("   -- Notas --");
		System.out.println("----------------\n");
		for (int j = 0; j < notas.length; j++) {
			System.out.println((j + 1) + "º Nota: " + notas[j]);
		}
		System.out.println("\n----------------");
		System.out.println("Fin del Programa");
		sc.close();
	}

}
