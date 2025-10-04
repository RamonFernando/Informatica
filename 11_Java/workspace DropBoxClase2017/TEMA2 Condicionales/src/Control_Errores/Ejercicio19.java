package Control_Errores;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio19 {

	/**
	 * Control de errores en la entrada de Datos.
	 */
	public static void main(String[] args) {
		// Modifica el programa anterior para que si además el número
		// introducido es el 3, se informe al usuario de que lo ha acertado.
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un numero entero entre 1 y 10");

		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			if (num > 0 && num < 11) {
				if (num == 3) {
					System.out.println("Has acertado!");
				} else {
					System.out.println("El numero es " + num);
				}

			} else {
				System.out.println("Error! Escriba un numero entre 1 y 10 ");
			}
		} else {
			System.out.println("Parametro Incorrecto!");
		}

		sc.close();
	}
	// Condicion del if en operador ternario (Preguntar a Carlos) Yo
	// num = num == 3 ? num = "Has acertado" : "El numero es " + num;
	// System.out.println("num");
	// Comentario para operador ternario. Java

	// (String) if (num==3)
	// num = num = "Has acertado";
	// else
	// num = num;
}
