/**
 * 
 */
package EjerciciosMetodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio2Metodos {

	/**
	 * Modificacion del programa anterior
	 */
	public static void main(String[] args) {
		// 2.- Modifica el programa anterior para que en lugar de escribir nada
		// en pantalla, devuelva el String
		// "Hola, nombre , no parece que tengas edad años"

		Scanner sc = new Scanner(System.in);

		// Declaracion de variable
		String nombre = "";
		int edad = 0;
		

		System.out.println("Metodos");
		System.out.println("*=*=*=*");
		
		if (nombre.equals("")) {
			System.out.println("Escriba su nombre: ");
			nombre = sc.nextLine();
		}
		if (edad == 0) {
			System.out.println("Escriba su edad: ");
			edad = sc.nextInt();
		}
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println(saludo(nombre, edad));
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println(" -- Fin del Programa --");

		sc.close();

	}

	static String saludo(String nombre, int edad) {
		String resultado = "Hola, " + nombre + " , no parece que tengas " + edad + " años.";
		return resultado;
	}

}
