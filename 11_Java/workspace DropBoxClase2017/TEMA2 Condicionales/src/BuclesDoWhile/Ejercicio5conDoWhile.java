/**
 * 
 */
package BuclesDoWhile;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio5conDoWhile {

	/**
	 * PDF-Ejercicio de Bucles 5-1/22
	 * Con DoWhile
	 */
	public static void main(String[] args) {
		// 5.- Escribe un programa que solicite un número al usuario
		// y, a continuación, muestre la tabla de multiplicar de ese número.
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int i = 1;
		int resultado = 0;

		System.out.println("Introduce un numero: ");
		System.out.println("====================");
		num1 = sc.nextInt();
		System.out.println("Tabla de multiplicar");
		System.out.println("====================");

		do {

			resultado = num1 * i;
			System.out.println("   " + num1 + " x " + i + " = " + resultado);
			i++;

		} while (i <= 10);

		sc.close();
	}

}
