/**
 * 
 */
package Arrays_SimplesEjercicios;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio9 {

	/**
	 * @PDF-Ejercicios Arrays I 9/17
	 */
	public static void main(String[] args) {
		// 9.- Escribe un programa que lea desde la consola el enunciado de una
		// pregunta y las cuatro posibles respuestas, guardando los cinco
		// valores en un array llamado test. A continuación los mostrará cómo si
		// fuera una pregunta de tipo test. Por ejemplo:
		// ¿Quién creó el Altair 8800, el primer ordenador personal?
		// a) Bill Gates
		// b) Steve Jobs
		// c) Ed Roberts
		// d) Gary Kildall

		Scanner sc = new Scanner(System.in);
		String test[] = { "a) Bill Gates", "b) Steve Jobs", "c) Ed Roberts",
				"d) Gary Kildall" };
		System.out.println("Juego de Preguntas");
		System.out.println("==================");
		System.out
				.println("Quien creo el primer ordenador personal \" Altair 8800\"");
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i] + " ");
		}
		for (int i = 0; i < test.length; i++) {
			test[i] = sc.nextLine();

			while (!test[i].equals("a") && !test[i].equals("b")
					&& !test[i].equals("c") && !test[i].equals("d")) {
				System.out
						.println("Parametro incorrecto, vuelva a intentarlo.");
				test[i] = sc.nextLine();
				continue;
			}
			if (test[i].equals("b")) {
				System.out.println("Respuesta correcta!");
				break;
			} else {
				System.out.println("Respuesta incorrecta!");
				break;
			}
		}

		System.out.println("==================");
		System.out.println("*Fin del Programa*");

		sc.close();

	}

}
