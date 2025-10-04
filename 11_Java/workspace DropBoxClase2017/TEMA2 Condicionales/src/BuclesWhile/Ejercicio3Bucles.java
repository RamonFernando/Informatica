package BuclesWhile;

import java.util.*;



/**
 * @author Ramon
 *
 */
public class Ejercicio3Bucles {

	/**
	 * PDF-Ejercicio de Bucles 3/22
	 * Descripcion:
	 * Ejercicios Bucles 3 con while.
	 */
	public static void main(String[] args) {
		// Escribe una aplicación que pregunte repetidamente un número entero
		// hasta que el usuario escriba un valor entre 1 y 10. A continuación el
		// programa escribirá un mensaje informando del número introducido.

		Scanner repetir = new Scanner(System.in);

		System.out.println("Introduzca un numero entero entre 1 y 10");

		int i;
		i = repetir.nextInt();
		while (i < 1 || i > 10) {
			System.out.println("Entrada incorrecta, vuelva a intentar");
			i = repetir.nextInt();
		}
		System.out.println("Número: " + i);
		repetir.close();
	}
}
