/**
 * 
 */
package Bucles_For;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio15BucleFor {

	/**
	 * PDF-Ejercicio de Bucles 15/22
	 * Ejercicio 15 con Bucle For
	 */
	public static void main(String[] args) {
		// 15.- Crea un programa que solicite al usuario los precios de cuatro
		// objetos y devuelva el precio total.

		Scanner sc = new Scanner(System.in);
		
		
		
		double precioFinal=0;
		double precio;
		for (int i = 1; i < 5; i++) {
			
			System.out.println("Introduzca precio del producto " + i);
			System.out.println("================================");
			precio = sc.nextDouble();
			precioFinal = precio + precioFinal;
			
		}
		System.out.println("El precio final es: " + precioFinal + " €");
		
		
		sc.close();

	}

}
