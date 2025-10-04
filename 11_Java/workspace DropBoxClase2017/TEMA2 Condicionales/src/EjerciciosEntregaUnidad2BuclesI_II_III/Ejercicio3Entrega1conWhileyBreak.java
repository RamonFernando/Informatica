/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio3Entrega1conWhileyBreak {

	/**
	 * PDF-Ejercicios III Bucles y Condicionales
	 * Ejercicio 1 Bucles III con While y Break
	 */
	public static void main(String[] args) {
		// // 1.- Escribe un programa que invente un nº aleatorio entre 1 y 10.
		// El usuario tendrá que adivinarlo en tres intentos como máximo. Al
		// finalizar el programa se le dirá si ha acertado el número y en
		// cuántos intentos lo ha hecho. Utiliza while y break.

		Scanner sc = new Scanner(System.in);

		int secreto;

		int i = 1;
		int num = 0;
		secreto = (int) (Math.random() * 10 + 1);

		System.out.println("Adivina el numero aleatorio");
		System.out.println("===========================");

		System.out.println(secreto);
		System.out.println("Te quedan 3 oportunidades.");

		while (i < 4 && !(num == secreto)) {

			System.out.println("Oportunidad: " + i + " de 3");
			num = sc.nextInt();
			i = i + 1;

			if (num == secreto) {
				System.out.println("Has acertado!");
				break;
			}

		}
		if(num!= secreto){
			System.out.println("Has fallado!");
		}

		System.out.println("Has adivinado en el " + (i-1) + "º" + " intento.");

		sc.close();
	}

}
