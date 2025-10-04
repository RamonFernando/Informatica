/**
 * 
 */
package BuclesWhile;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio5Bucles {

	/**
	 * PDF-Ejercicio de Bucles 5/22
	 * Descripcion:
	 * Condicionales: Bucles Ejercicio 5 con While.
	 */
	public static void main(String[] args) {
		// Escribe un programa que solicite un número al usuario y, a
		// continuación, muestre la tabla de multiplicar de ese número.

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		System.out.println("=====================");
		int num = sc.nextInt();
		System.out.println("Tabla de multiplicar \n====================");
		int i = 1;
		int resultado;
		while (i < 11) {
			resultado = i * num;
			System.out.println("    " + num + " * " + i + " = " + resultado);
			i++;
		}

		sc.close();
	}

}
