/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon de Carlos.
 *
 */
public class Ejercicio2Entrega5conDoWhile {

	/**
	 * PDF- Ejercicio II Bucles I
	 * Ejercicio 5 con DoWhile y Math.Random
	 */
	public static void main(String[] args) {
		// 5.- Diseña un programa que invente un número aleatorio. A
		// continuación pedirá al usuario que lo
		// adivine. Si el usuario falla, entonces el programa le dará otra
		// oportunidad. Una vez que el usuario
		// adivina el número o falla tres veces, el programa termina.

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int secr = (int) (Math.random() * 10 + 1);
		int i = 1;
		System.out.println(" Adivina el numero aleatorio entre 1 y 10");
		System.out.println("	Tienes solo 3 oportunidades");
		System.out.println("**===============*****=================**");

		// num = (int)(Math.random()*4 + 1);
		System.out.println("Debug: " + secr);
		num = secr;

		do {

			System.out.println("Oportunidad: " + "\"" + i + "\"" + " de 3");
			num = sc.nextInt();

			i++;
		} while (i <= 3 && !(num == secr)); // Si i es <= que 3 y num es distinto(!) de la variable num = variable secr.

		if (num == secr) {
			System.out.println("    Has acertado!");
		} else {
			System.out.println("    Has fallado!");

			

			
		}
		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("  Fin del programa");
		sc.close();
	}

}
