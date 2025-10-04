/**
 * 
 */
package BuclesDoWhile;

import java.util.Scanner;

/**
 * @author horabaixa
 *
 */
public class Ejercicio12OperadorTernario {

	/**
	 * PDF-Ejercicio de Bucles 12/22
	 * Ejercicio 12 con Operador ternaro en Comentario
	 */
	public static void main(String[] args) {
		// 12.- Trivial. Escribe una aplicación que haga una pregunta y muestre
		// un menú con cuatro posibles respuestas numeradas. Por ejemplo:
		//
		// ¿Quién es el autor de la novela "Ready Player One"?
		// 1) Douglas Capland
		// 2) Isaac Asimov
		// 3) Ernest Cline
		// 4) Ray Bradbury

		Scanner sc = new Scanner(System.in);

		int opc = 0;

		try {
			do {
				System.out.println("Quién es el autor de la novela \"Ready Player One\"? ");
				System.out.println("==================================================");
				System.out.println("1) Douglas Capland \n2) Isaac Asimov \n3) Ernest Cline \n4) Ray Bradbury");
				opc = sc.nextInt();

			} while (opc < 1 || opc > 4);
			if (opc == 3) {
				System.out.println("Respuesta correcta");
			} else {
				System.out.println("Respuesta incorrecta");
			}

			// Opcionalmente con operador ternario del if podia hacerse:
			// String resultado = resultado == 3 ? "Resultado correcto" : "Resultado incorrecto"
			// System.out.println(resultado);

			System.out.println("==Fin==");

			sc.close();
		} catch (Exception e) {
			System.out.println("Parametro incorrecto.");
			System.out.println("Tipo de error: " + e.toString());
		}

	}

}
