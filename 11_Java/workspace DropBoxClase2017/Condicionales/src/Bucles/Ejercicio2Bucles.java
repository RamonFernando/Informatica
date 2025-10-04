package Bucles;

import java.util.Scanner;

/**
 * @author horabaixa
 *
 */
public class Ejercicio2Bucles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Modifica el programa anterior para que pida un carácter y también el
		// número de veces que queremos repetirlo.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un caracter: \n ====================");
		String caracter = sc.nextLine();
		System.out.println("Cuantas veces quieres repetirlo ? ");
		int x = sc.nextInt();
		int i = 1;
		
		while (i <= x) {
			System.out.println("El caracter es: " + caracter + " " + i);
			i++;
		}
		System.out.println("=Fin=");
		
		sc.close();

	}

}
