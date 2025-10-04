/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio3Entrega3conWhile {

	/**
	 * PDF-Ejercicios III Bucles y Condicionales
	 * Ejercicio 3 Bucles III con While.
	 */
	public static void main(String[] args) {
		// 3.- Crea una aplicación para probar la capacidad de cálculo mental de
		// los usuarios. Se calcularán
		// dos números aleatorios entre 1 y 100 y se mostrarán en pantalla. A
		// continuación el usuario deberá
		// escribir el resultado de la suma de ambos números y se le indicará si
		// ha acertado o no.
		// Estas acciones se repetirán indefinidamente mediante un bucle
		// while.

		Scanner sc = new Scanner(System.in);

		System.out.println("Juego de adivinar la Suma");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");

		int num1 = (int) (Math.random() * 100 + 1);
		int num2 = (int) (Math.random() * 100 + 1);
		int resultado;
		int num3;

		resultado = num1 + num2;

		System.out.println("Introduzca el resultado: " + num1 + " + " + num2 + " = ?");
		num3 = sc.nextInt();

		if (num3 == resultado) {
			System.out.println("Has acertado!");
		} else {
			System.out.println("Has fallado!" + " el resultado es: " + resultado);
		}

		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("  Fin del programa");

		sc.close();

	}

}
