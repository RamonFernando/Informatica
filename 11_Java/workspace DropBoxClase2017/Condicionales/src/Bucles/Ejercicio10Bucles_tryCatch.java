/**
 * 
 */
package Bucles;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio10Bucles_tryCatch {

	/**
	 * Ejercicio 10 While con try catch
	 */
	public static void main(String[] args) {
		// 10.- Trivial. Escribe una aplicación que haga una pregunta y muestre
		// un menú con cuatro posibles respuestas numeradas. Por ejemplo:
		//
		// ¿Cómo se escribe 30 en hexadecimal?
		// 1) 1E
		// 2) 2F
		// 3) 33
		// 4) Ninguno de los anteriores.

		Scanner sc = new Scanner(System.in);

		System.out.println("Como se escribe el numero 30 en hexadecimal? ");
		System.out.println("============================================");
		System.out.println("1E \n2F \n33 \nNinguno de los anteriores");
		System.out.println("============================================");

		int num = 0;
		try {
			num = sc.nextInt();
		} catch (Exception e) {

			System.out.println("Parametro incorrecto");
			System.out.println("Tipo de error: " + e.toString());

		}

		while (num < 1 || num > 5) {

			try {
				System.out.println("Error, vuelva a intentarlo");
				num = sc.nextInt();
			} catch (Exception e) {

				System.out.println("Parametro incorrecto");
				System.out.println("Tipo de error: " + e.toString());

			}
		}
		switch (num) {
		case 1:
			System.out.println("Respuesta incorrecta");
			break;
		case 2:
			System.out.println("Respuesta incorrecta");
			break;
		case 3:
			System.out.println("Respuesta correcta");
			break;
		case 4:
			System.out.println("Respuesta incorrecta");
			break;
		default:
			System.out.println("Error, vuelva a intentarlo");

			break;
		}

		sc.close();
	}

}
