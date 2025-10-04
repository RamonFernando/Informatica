package elseIf;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio11 {

	/**
	 * PDF-Ejercicio de Condicionales 11/22
	 * Descripcion:
	 * Condicionales Ejercicio con if/else.
	 */
	public static void main(String[] args) {
		// Modifica el programa anterior para que acepte una nota con decimales
		// (por ejemplo, si la nota es menor que 5, la calificación será de
		// Insuficiente).

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca un numero entre 0 y 10" + "\n=================================");
		float nota = entrada.nextInt();

		if (nota > 0 && nota < 3) {
			System.out.println("Insuficiente");
		} else if (nota >= 3 && nota <= 5) {
			System.out.println("\n=================================");
			System.out.println("Suficiente");
		} else if (nota >= 6 && nota <= 7) {
			System.out.println("\n=================================");
			System.out.println("Bien");
		} else if (nota > 7 && nota <= 8) {
			System.out.println("\n=================================");
			System.out.println("Notable");
		} else if (nota > 8 && nota <= 10) {

			System.out.println("\n=================================");
			System.out.println("Sobresaliente");
		}
		entrada.close();

	}

}
