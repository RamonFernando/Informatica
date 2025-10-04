/**
 * 
 */
package Condicionales2;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio15Notas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 15.- Crea un programa que solicite al usuario los precios de cuatro
		// objetos y devuelva el precio total.
		
		Scanner sc = new Scanner(System.in);
		
		int precio =0;
		
		int precioTotal = 0;
		
		System.out.println("Introduzca el precio de 4 objetos.");
		
		for (int i = 1; i < 5; i++) {
			System.out.println(i + "º Precio");
			precio = sc.nextInt();
			precioTotal = precioTotal + precio;
		}
		System.out.println("Su precio total a pagar es: " + precioTotal + " €");
		
		
		
		
		
		sc.close();
			
		
	}

}
