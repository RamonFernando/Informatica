/**
 * 
 */
package Break_y_Concinue;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio21breakContinue {

	/**
	 * PDF-Ejercicio de Bucles 21/22
	 * Ejercicio de Bucles 21 con Break y Continue.
	 */
	public static void main(String[] args) {
		// 21.- Crea un programa que vaya pidiendo cinco números para mostrar
		// sus tablas de multiplicar. Si el número introducido es 1, el programa
		// escribirá el mensaje "¡No seas tonto!" y se volverá a formular la
		// pregunta.
		// Utiliza la instrucción continue.

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int i = 1;

		System.out.println("Tabla de multiplicar");
		System.out.println("====================");

		while (i < 6) {

			System.out.println("Introduce el numero: " + i + "º");
			num = sc.nextInt();

			if (num == 1) {
				System.out.println("No seas tonto!");
				System.out.println("Vuelve a introducir un numero.");

				continue;
			}
			System.out.println("Tabla del: " + num);
			System.out.println("============");
			for (int cont = 1; cont < 11; cont++) {

				System.out.println(num + "x" + cont + " = " + (num * cont));

			}
			i++;

		}
		System.out.println("=================");
		System.out.println("Fin del programa.");

		sc.close();
	}

}
