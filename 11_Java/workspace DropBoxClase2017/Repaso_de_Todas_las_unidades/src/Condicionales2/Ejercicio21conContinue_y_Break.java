/**
 * 
 */
package Condicionales2;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio21conContinue_y_Break {

	/**
	 * @PDF- Ejercicio Bucles 21/22 con Continue y Break.
	 */
	public static void main(String[] args) {
		// 21.- Crea un programa que vaya pidiendo cinco números para mostrar
		// sus tablas de multiplicar. Si el número introducido es 1, el programa
		// escribirá el mensaje "¡No seas tonto!" y se volverá a formular la
		// pregunta.
		// Utiliza la instrucción continue.

		Scanner sc = new Scanner(System.in);

		try {
			int num = 0;
			System.out.println("Tablas de multiplicar.");
			System.out.println("Introduce el numero: ");
			num = sc.nextInt();
			for (int i = 1; i < 11; i++) {
				if (num == -1) {
					System.out.println("Fin del programa");
					break;
				}

				while (num == 1) {
					System.out.println("No seas tonto!");
					System.out.println("Introduce el numero: ");
					num = sc.nextInt();
					continue;
				}
				for (int j = 1; j < 11; j++) {
					System.out.println(num + " x " + i + " = " + (num * j));
				}

				System.out.println("Introduce el numero:");
				num = sc.nextInt();
			}

		} catch (Exception e) {
			System.out.println("Parametro incorrecto.");
			System.out.println("Fin del Programa");

		}

		sc.close();

	}

}
