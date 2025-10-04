/**
 * 
 */
package RepasoEntregaBucles;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio5C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 5.- Haz un programa que te pida un número y te devuelva su tabla de
		// multiplicar. Esto se repetirá indefinidamente hasta que el usuario
		// escriba 0. En ese caso se escribirá la tabla del cero y el programa
		// terminará. Usa los bucles do-while y for.

		Scanner sc = new Scanner(System.in);
		System.out.println("Tablas de multiplicar.");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*");
		int i = 0;
		boolean a = true;
		int num = 0;
		do {
			System.out.println("\nIntroduce un numero.");
			System.out.println("*=*=*=*=*=*=*=*=*=*");
			num = sc.nextInt();
			for (i = 1; i < 11; i++) {

				System.out.println(num + " x " + i + " = " + (num * i));

			}
			if (num == 0) {
				// System.out.println(num + " x " + (i-1) + " = " + (num*i));
				// a = false;
				break;
			}
		} while (a);
		System.out.println("Fin del programa.");
		System.out.println("*=*=*=*=*=*=*=*=*");

		sc.close();

	}

}
