/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio3Entrega2conWhileyBreak {

	/**
	 * PDF-Ejercicios III Bucles y Condicionales
	 * Entrega 2
	 */
	public static void main(String[] args) {
		// 2.- Añade al final del programa anterior el código necesario para que
		// indique la puntuación obtenida
		// por el jugador:
		// •
		// Si ha acertado en un intento
		// → Recibe 10 puntos.
		// •
		// Si ha acertado en dos intentos → Recibe 5 puntos.
		// •
		// Si ha acertado en tres intentos → Recibe 2 puntos.
		// •
		// En otro caso → Recibe 0 puntos.

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

			if (num == secreto) {
				System.out.println("Has acertado!");
				System.out.println("Has adivinado en el " + (i) + "º" + " intento.");
				
				if(i == 1){
					System.out.println("Tienes 10 puntos");
				}
				if(i == 2){
					System.out.println("Tienes 5 puntos");
				}
				if(i == 3){
					System.out.println("Tienes 2 puntos");
				}
				
				break;
			}

			i = i + 1;
		}
		if (num != secreto) {
			System.out.println("Has fallado!");
			System.out.println("No has adivinado en ningun intento. ");
			System.out.println("Tienes 0 puntos.");
		}

		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("  Fin del programa");

		sc.close();

	}

}
