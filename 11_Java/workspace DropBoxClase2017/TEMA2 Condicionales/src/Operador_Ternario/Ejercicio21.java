package Operador_Ternario;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio21 {

	/**
	 * PDF-Ejercicio de Condicionales 21/22
	 * Descripcion:
	 * Condicionales Ejercicio con if/else.
	 * Operador Ternario
	 */
	public static void main(String[] args) {
		// Crea un programa que pregunte el nombre del usuario y luego lo
		// escriba. Ahora bien, si el usuario no introduce nada, el nombre
		// deberá quedar con el valor "Desconocido".

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre de Usuario: ");
		

		
		// if (nombre.equals("")) {
		//
		// System.out.println("Desconocido");
		// } else {
		// System.out.println(nombre);
		// }
		String nombre = sc.nextLine();
		nombre = nombre.equals("") ? nombre = "Desconocido" : nombre;
		System.out.println(nombre);
		
		sc.close();
	}

}
