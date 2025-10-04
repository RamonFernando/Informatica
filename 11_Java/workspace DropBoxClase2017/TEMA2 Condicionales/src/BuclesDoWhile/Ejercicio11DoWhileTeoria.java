/**
 * 
 */
package BuclesDoWhile;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio11DoWhileTeoria {

	/**
	 * PDF-Ejercicio de Bucles 11-1/22
	 */
	public static void main(String[] args) {
		/**
		 * Diferencia while-Do While. El bucle do … while es muy similar al
		 * bucle while. La diferencia radica en cuándo se evalúa la condición de
		 * salida del ciclo. En el bucle while esta evaluación se realiza antes
		 * de entrar al ciclo, lo que significa que el bucle puede no llegar
		 * ejecutarse. En cambio, en un bucle do … while, la evaluación se hace
		 * después de la primera ejecución del ciclo, lo que significa que el
		 * bucle obligatoriamente se ejecuta al menos en una ocasión
		 * 
		 */

		// 11.- Escribe un programa que pregunte un número entre 1 y 20. Si el
		// número introducido no cumple la condición, se le volverá a preguntar
		// hasta que la cumpla. Al final simplemente se mostrará el número en
		// pantalla.

		Scanner sc = new Scanner(System.in);
		int num = 0;
		
	
		
		do {
			System.out.println("Introduzca un numero entre 1 y 20");
			num = sc.nextInt();
			
		} while (num <1 || num > 20);
		
		System.out.println("Su numero es: " + num);
		
		

		sc.close();

		
	}

}
