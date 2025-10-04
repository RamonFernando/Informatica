/**
 * 
 */
package EjerciciosMetodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio1con2Parametros {

	/**
	 * Ejercicio Metodos con 2 Parametros
	 */
	public static void main(String[] args) {
		// 1- Escribe un metodo que reciba dos parametros: el nombre de una
		// persona y su edad. Debera mostrar por pantalla la frase. "Hola,
		// nombre, no aparece que tengas edad años.
		Scanner sc = new Scanner(System.in);
		// Declaracion de variable
		String nombre = "";
		int edad = 0;

		System.out.println("Escribe su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Escriba la edad: ");
		edad = sc.nextInt();
		saludos(nombre, edad);

		sc.close();

	}

	static void saludos(String nombre, int edad) {
		System.out.println("Hola, " + nombre + " no parece que tengas " + edad
				+ " años.");
	}
}
