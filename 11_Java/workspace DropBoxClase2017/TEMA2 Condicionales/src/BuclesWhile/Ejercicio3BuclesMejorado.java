package BuclesWhile;

import java.util.Scanner;

public class Ejercicio3BuclesMejorado {
	/**
	 * 
	 * Profesor: Carlos(hecho por Carlos)
	 * PDF-Ejercicio de Bucles 3/22
	 * Descripcion: con Bucles anidados while-while y control
	 * de entrada de errores.
	 */
	public static void main(String[] args) {

		// Escribe una aplicación que pregunte repetidamente un número entero
		// hasta que el usuario escriba un valor entre 1 y 10. A continuación el
		// programa escribirá un mensaje informando del número introducido.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero entero entre 1 y 10");

		int numero;
		while (!sc.hasNextInt()) { // Controla la entrada de una letra
			System.out.println("Vuelva a intentarlo!");
			sc.nextLine();
		}

		numero = sc.nextInt();

		while (numero < 1 || numero > 10) {
			System.out.println("Entrada incorrecta, vuelva a intentar");

			while (!sc.hasNextInt()) {
				System.out.println("Vuelva a intentarlo 2!");
				sc.nextLine();
			}

			numero = sc.nextInt();
		}

		System.out.println("Número: " + numero);
		sc.close();
	}
}
