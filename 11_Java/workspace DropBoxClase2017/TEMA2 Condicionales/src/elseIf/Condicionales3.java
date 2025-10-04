package elseIf;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ramon
 *
 */
public class Condicionales3 {

	/**
	 * PDF-Ejercicio de Condicionales 3/22
	 * Descripcion:
	 * Condicionales Practica con if/else.
	 */
	public static void main(String[] args) {
		// Pedimos al usuario su PIN (4 cifras)
		// Si es 4652 escriba "Acceso Concedido"
		// Si no, escribamos "Acceso Denegado"

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca PIN de acceso");
		int pin = teclado.nextInt();

		if (pin == 4652) {
			System.out.println("Acceso concedido");

		} else {
			System.out.println("Acceso Denegado");
		}

		teclado.close();
	}

}
