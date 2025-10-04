package Condicionales;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ramon
 *
 */
public class Condicionales2 {

	/**
	 * Condicionales Practica
	 */
	public static void main(String[] args) {
		// El programa pide un precio, si es mayor de 20 euros pondra tiene
		// derecho a un descuento y si es menor poondra que no tienes derecho a
		// descuento.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el precio del producto: ");
		float precio = teclado.nextFloat();

		if (precio >= 20) {
			System.out.println("Usted tiene un descuento ");

		} else {
			System.out.println("No tiene derecho a descuento.");
		}

		teclado.close();

	}

}
