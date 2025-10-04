package Control_Errores;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio18 {

	/**
	 * Control de Errores de entrada de Datos
	 */
	public static void main(String[] args) {
		// Crea un programa que pida un número entero por teclado, entre 1 y 10.
		// Si el usuario escribe un número entero, se escribirá su valor en
		// pantalla. Si lo que escribe no es un entero, se mostará un mensaje de
		// error.
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba un numero entero entre 1 y 10");
		if (sc.hasNextInt()) { // Se pone asi para la condicion de saber si es
								// un numero de tipo entero, lo que se introduce
								// por la variable Scanner (sc)

			int num = sc.nextInt();
			if (num > 0 && num < 11) {
				System.out.println("El numero es " + num);
			} else {
				System.out
						.println("Error escriba un numero entero entre 1 y 10");
			}

		} else {
			System.out.println("Parametro incorrecto!"); // Este print se pone fuera del if por si no se introduce un numero.
		}

		sc.close();
	}
}
