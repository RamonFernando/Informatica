/**
 * 
 */
package Condicionales2;

import java.net.Socket;
import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio20 {

	/**
	 * @PDF- Bucles 20/22
	 */
	public static void main(String[] args) {
		// 20.- Concurso. El programa preguntará continuamente el número secreto
		// (que es 6, evidentemente). En el momento en que el usuario acierte,
		// se escribirá el mensaje "Felicidades" y terminará el programa. Si el
		// usuario agota sus 10 posibilidades, el mensaje que verá es "Has
		// perdido".
		// Utiliza la instrucción break.
		
		Scanner sc = new Scanner(System.in);
		int secret=0;
		System.out.println("Introduzca el numero secreto: ");
		for (int i = 1; i < 11; i++) {
			System.out.println("Intento: " + i);
			secret = sc.nextInt();
			if (secret == 6) {
				System.out.println("Felicidades has acertado!");
				break;
			}
			
		}
		if (secret != 6) {
			System.out.println("Has fallado!");
		}
		System.out.println("\nFin del programa.");
		
		
		sc.close();

	}

}
