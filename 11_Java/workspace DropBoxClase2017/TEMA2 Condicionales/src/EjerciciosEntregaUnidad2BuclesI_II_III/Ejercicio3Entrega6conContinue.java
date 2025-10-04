/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio3Entrega6conContinue {

	/**
	 * PDF-Ejercicios III Bucles y Condicionales
	 * Ejercicio 6 Bucles III
	 */
	public static void main(String[] args) {
		// 6.- Añade al programa anterior una comprobación del número
		// introducido, de manera que si el usuario escribe "1", el programa
		// le responda "No seas tonto" y vuelva a empezar el bucle, sin
		// mostrar la tabla. Utiliza la palabra clave continue.

		Scanner sc = new Scanner(System.in);
		int num = 1;

		System.out.println("Tabla de multiplicar");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*");

		do {
			System.out.println("Introduzca un numero:  0 si deseas finalizar.");
			num = sc.nextInt();

			if (num == 0) {
				for (int i = 0; i <= 10; i++) {
					System.out.println(num + " x " + i + " = " + num);

					break;
				}

			}

			for (int i = 1; i <= 10; i++) {
				if (num == 1) {
					System.out.println("No seas tonto! ");
					System.out.println("Introduzca un numero: 0 si deseas finalizar.");
					num = sc.nextInt();
					continue;
				}
				System.out.println(num + " x " + i + " = " + (num * i));

			}
			// if (num == 1){
			// System.out.println("No seas tonto");
			// System.out.println("Introduce un numero: ");
			// num = sc.nextInt();
			// continue;
			// }

		} while (num != 0);

		System.out.println("*=*=*=*=*=*=*=*=*");
		System.out.println("Fin del Programa");

		sc.close();

	}

}
