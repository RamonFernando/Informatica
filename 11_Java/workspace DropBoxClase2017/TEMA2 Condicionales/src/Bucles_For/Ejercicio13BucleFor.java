/**
 * 
 */
package Bucles_For;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio13BucleFor {

	/**
	 * PDF-Ejercicio de Bucles 13/22
	 * Ejercicio 13 Bucle For. Profesor Carlos Sogor.
	 */
	public static void main(String[] args) {
		// 13.-Crea un programa que pida un numero y escriba la tabla de
		// multiplicar de ese numero.

		Scanner sc = new Scanner(System.in);
		int num;
		int i = 1;

		System.out.println("Escribe un numero entero: ");
		num = sc.nextInt();

		for (int j = 1; j <= 10; j++) {

			System.out.println(num + " x " + i + " = " + (num * i));
			i++;
		}

		sc.close();

	}
	// Otra manera de hacer la tabla de multiplicar.
	
	// Scanner sc = new Scanner(System.in);
	// int num;
	// int resultado=1;
	//
	// System.out.println("Escribe un numero entero: ");
	// num = sc.nextInt();
	//
	// for (int i = 1; i <= 10; i++) {
	// 		resultado = num * i;
	// 		System.out.println(num + " x " + i + " = " + resultado);
	//
	// }
	//
	//
	//
	// sc.close();

}
