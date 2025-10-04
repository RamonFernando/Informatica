/**
 * 
 */
package Break_y_Concinue;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio20breakContinue {

	/**
	 * PDF-Ejercicio de Bucles 20/22
	 * Ejercicio 20 Bucles con Break y Continue.
	 */
	public static void main(String[] args) {
		// 20.- Concurso. El programa preguntará continuamente el número secreto
		// (que es 6, evidentemente). En el momento en que el usuario acierte,
		// se escribirá el mensaje "Felicidades" y terminará el programa. Si el
		// usuario agota sus 10 posibilidades, el mensaje que verá es "Has
		// perdido".
		// Utiliza la instrucción break.

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int cont=1;
		for (int i = 1; i < 11; i++) {
			System.out.println("Introduce el numero secreto: " + cont + "ª intento.");
			num = sc.nextInt();
			cont++;
			if(num==6){
				System.out.println("Has acertado!.");
				break;
			}
			
			
		}
		if(num!=6){
			System.out.println("Has fallado!");
		}
		
		sc.close();

	}

}
