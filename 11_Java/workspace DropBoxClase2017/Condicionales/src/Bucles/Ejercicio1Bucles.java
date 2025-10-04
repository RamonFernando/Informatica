package Bucles;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio1Bucles {

	/**
	 * Bucles
	 */
	public static void main(String[] args) {
		// Crea un programa que pida un carácter al usuario. A continuación lo
		// escribirá 100 veces

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un caracter: \n ====================");
		String caracter = sc.nextLine();
		int i = 1;
		while (i <= 100) {
			System.out.println("El caracter es: " + caracter + " " + i);
			i++;
		}
		System.out.println("=Fin=");
		
		sc.close();

	}

}
