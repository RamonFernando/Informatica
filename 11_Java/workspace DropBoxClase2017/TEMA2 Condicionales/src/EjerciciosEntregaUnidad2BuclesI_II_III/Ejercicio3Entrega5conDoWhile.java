/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio3Entrega5conDoWhile {

	/**
	 * PDF-Ejercicios III Bucles y Condicionales
	 * Ejercicio 5 Bucles III
	 */
	public static void main(String[] args) {
		// 5.- Haz un programa que te pida un número y te devuelva su tabla de
		// multiplicar. Esto se repetirá indefinidamente hasta que el usuario
		// escriba 0. En ese caso se escribirá la tabla del cero y el programa
		// terminará. Usa los bucles do-while y for.

		Scanner sc = new Scanner(System.in);
		int num = 1;
		int num1 = 1;
		System.out.println("Tabla de multiplicar");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*");

		do {
			System.out.println("Introduzca un numero: ");
			num = sc.nextInt();

			if (num == 0) {
				for (int i = 0; i <= 10; i++) {
					System.out.println(num + " x " + i + " = " + num);

					break;
				}

			}

			for (int i = 1; i <= 10; i++) {

				System.out.println(num + " x " + i + " = " + (num * i));

			}

		} while (num != 0);
		
		System.out.println("*=*=*=*=*=*=*=*=*");
		System.out.println("Fin del Programa");

		sc.close();

	}

}
