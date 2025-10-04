/**
 * 
 */
package Arrays_SimplesEjercicios;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio7 {

	/**
	 * @PDF-Ejercicios Arrays I 7/17
	 */
	public static void main(String[] args) {
		// 7.- Crea un array de 10 elementos de tipo double llamado notas. Ve
		// leyendo las diez notas desde la consola, mediante un bucle while, y
		// guardándolas en el array. A continuación, muestra las diez notas.

		Scanner sc = new Scanner(System.in);
		double notas[] = new double[10];
		int i = 0;
		System.out.println("**--Notas--**");
		System.out.println("-------------");
		while (i < notas.length) {
			System.out.println((i + 1) + "º Nota: ");
			notas[i] = sc.nextDouble();
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
