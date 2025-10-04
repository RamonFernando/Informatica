/**
 * 
 */
package Condicionales2;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio18y19 {

	/**
	 * PDF-Ejercicio de bucles 18y19/22
	 */
	public static void main(String[] args) {
		// 18.- Escribe una aplicación que solicite cinco notas. Si el usuario
		// escribe una nota que no está entre 0 y 10 se le informará del error y
		// se le volverá a pedir el dato.
		// 19.- Amplía la aplicación anterior para que a medida que se van
		// introduciendo las notas se vayan sumando (en una variable llamada
		// suma). Al final, devolverá la nota media de esas notas.

		Scanner sc = new Scanner(System.in);
		int num;
		int suma = 0;
		System.out.println("Introduce nota 5 de 0-10");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Nota: " + i);
			num = sc.nextInt();
			while (num < 0 || num > 10) {
				System.out.println("Nota no valida, debe de estar entre 0-10");
				num = sc.nextInt();
				// continue;
			}
			suma = suma + num;

		}
		System.out.println("Usted a obtenido " + "\"" + suma + "/50 puntos"
				+ "\"" + " con una media de " + "\"" + (suma / 5) + "\"");
		sc.close();
		System.out.println("\n*=*=*=*=*=*=*=*=*");
		System.out.println("Fin del programa");
	}

}
