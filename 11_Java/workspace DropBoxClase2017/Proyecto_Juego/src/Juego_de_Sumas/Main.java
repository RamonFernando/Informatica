/**
 * 
 */
package Juego_de_Sumas;

import java.util.*;

/**
 * @author Ramon
 *
 */
public class Main {

	/**
	 * Codigo mejorable del Juego de Sumas.
	 */
	public static void main(String[] args) {
		// Hacer las sumas.
		Scanner sc = new Scanner(System.in);

		System.out.println("Juego de Numeros");
		System.out.println("*=*=*=*=*=*=*=*=*");

		int resultado = 1;
		int num1, num2;
		int operaciones[] = new int[10];
		int acumulador = 0;
		int acierto = 0;

		// for 1
		for (int i = 0; i < 11; i++) {
			System.out.println("Nivel " + (i + 1));
			num1 = (int) (Math.random() * 10 + 1);
			num2 = (int) (Math.random() * 10 + 1);

			// for 2
			for (int j = 0; j < operaciones.length; j++) {
				num1 = (int) (Math.random() * 10 + 1);
				num2 = (int) (Math.random() * 10 + 1);

				System.out.println("Operacion " + (j + 1) + "/10");
				System.out.println(num1 + " + " + num2 + " = " + "?");
				operaciones[j] = sc.nextInt();
				resultado = num1 + num2;
				if (resultado == operaciones[j]) {
					acumulador = acumulador + 1;
				}

				if (j >= 9) {
					acierto = (int) ((acumulador / 10) * 100);
					System.out.println("Siguiente nivel.");
					System.out.println("Bien hecho, tu acierto es: "
							+ acumulador + "/10 con un acierto del " + acierto
							+ " % ahora un poco mas dificil");

				}
				// if (acumulador < 7) {
				// System.out
				// .println("Tu nota es demasiado baja, sigue intentandolo.");
				// }
			}
			// for 3
			for (int j = 0; j < operaciones.length; j++) {
				num1 = (int) (Math.random() * 100 + 10);
				num2 = (int) (Math.random() * 100 + 10);
				System.out.println("Operacion " + (j + 1) + "/10");
				System.out.println(num1 + " + " + num2 + " = " + "?");
				operaciones[j] = sc.nextInt();
				resultado = num1 + num2;
				if (resultado == operaciones[j]) {
					acumulador = acumulador + 1;
				}
				if (j >= 9) {
					acierto = (int) ((acumulador / 20) * 100);
					System.out.println("Siguiente nivel.");
					System.out.println("Bien hecho, tu acierto es: "
							+ acumulador + "/20 con un acierto del " + acierto
							+ " % ahora un poco mas dificil");

				}

			}
			// for 4
			for (int j = 0; j < operaciones.length; j++) {
				num1 = (int) (Math.random() * 1000 + 100);
				num2 = (int) (Math.random() * 100 + 10);
				System.out.println("Operacion " + (j + 1) + "/10");
				System.out.println(num1 + " + " + num2 + " = " + "?");
				operaciones[j] = sc.nextInt();
				resultado = num1 + num2;
				if (resultado == operaciones[j]) {
					acumulador = acumulador + 1;
				}
				if (j >= 9) {
					acierto = (int) ((acumulador / 30) * 100);
					System.out.println("Siguiente nivel.");
					System.out.println("Bien hecho, tu acierto es: "
							+ acumulador + "/30 con un acierto del " + acierto
							+ " % ahora un poco mas dificil");

				}

			}
			// for 5
			for (int j = 0; j < operaciones.length; j++) {
				num1 = (int) (Math.random() * 1000 + 100);
				num2 = (int) (Math.random() * 1000 + 100);
				System.out.println("Operacion " + (j + 1) + "/10");
				System.out.println(num1 + " + " + num2 + " = " + "?");
				operaciones[j] = sc.nextInt();
				resultado = num1 + num2;
				if (resultado == operaciones[j]) {
					acumulador = acumulador + 1;
				}
				// if (j >= 9) {
				//
				// System.out.println("Siguiente nivel.");
				// System.out.println("Bien hecho, tu acierto es: " + acumulador
				// + "/40 con un acierto del " + (acumulador/40) +
				// " % ahora un poco mas dificil");
				//
				// }

			}
			break;
		}
		System.out.println("Bien hecho");
		System.out.println("Obtuviste una puntuacion de " + acumulador + "/40");
		System.out.println("Con una acierto del : " + acierto + "%");
		sc.close();
	}

}
