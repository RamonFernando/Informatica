/**
 * 
 */
package EjerciciosMetodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio1Metodos {

	/**
	 * Metodo con 2 parametros.
	 */
	public static void main(String[] args) {
		// 1.- Escribe un método que reciba dos parámetros: el nombre de una
		// persona y su edad. Deberá
		// mostrar por pantalla la frase "Hola, nombre, no parece que tengas
		// edad años".
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
		saludo(nombre, edad);
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println(" -- Fin del Programa --");
		
		sc.close();
		
	}
	static void saludo(String nombre, int edad){
		System.out.println("Hola, " + nombre + " , no parece que tengas " + edad + " años.");
		System.out.println("Has nacido en el año " + (2017-edad) + " o " + ((2017-edad)-1) + ".");
	}
	
}
