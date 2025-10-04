package Operador_Ternario;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio20 {

	/**
	 * PDF-Ejercicio de Condicionales 20/22
	 * Descripcion:
	 * Condicionales Ejercicio con booleano.
	 * Operador Ternario
	 */
	public static void main(String[] args) {
		// Escribe un programa que pida la edad del usuario. Si ésta es menor de
		// 18 años, el valor de la variable mayorDeEdad será verdadero. Si no,
		// será falso. Al final se mostrará este valor.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca su edad: ");
		int edad = entrada.nextInt();

		boolean mayorDeEdad; 

		// if (edad > 18) {
		// mayorEdad = true;
		// } else {
		//
		// mayorEdad = false;
		// }
		// System.out.println(mayorEdad);

		mayorDeEdad = edad < 18 ? mayorDeEdad = false : true;
		System.out.println(mayorDeEdad);
		entrada.close();

	}

}
