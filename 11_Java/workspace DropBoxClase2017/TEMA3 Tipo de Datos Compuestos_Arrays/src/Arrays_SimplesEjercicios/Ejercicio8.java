/**
 * 
 */
package Arrays_SimplesEjercicios;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio8 {

	/**
	 * @PDF-Ejercicios Arrays I 8/17
	 */
	public static void main(String[] args) {
		// 8.- Modifica el programa anterior para que el programa pare de pedir
		// notas si se le pasa un valor negativo.
		Scanner sc = new Scanner(System.in);
		double notas[] = new double[10];
		int i = 0;
		System.out.println("**--Notas--**");
		System.out.println("-------------");
		while (i < notas.length) {
			System.out.println((i + 1) + "º Nota: ");
			notas[i] = sc.nextDouble();

			if (notas[i] < 0) {
				System.out.println("Numero incorrecto.");
				continue;
			}
			i++;
		}
		System.out.println("**--------------------**");
		for (int j = 0; j < notas.length; j++) {
			System.out.println((j + 1) + "º Nota: " + notas[j]);
		}
		System.out.println("**--------------------**");
		System.out.println("**--Fin del Programa--**");

		sc.close();
	}

}
