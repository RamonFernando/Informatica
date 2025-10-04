/**
 * 
 */
package Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio21OT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Crea un programa que pregunte el nombre del usuario y luego lo
		// escriba. Ahora bien, si el usuario no introduce nada, el nombre
		// deberá quedar con el valor "Desconocido".

		Scanner sc = new Scanner(System.in);

		boolean a = true;
		String usuario = "";

		do {
			System.out.println("Introduzca el nombre de usuario.");
			usuario = sc.nextLine();

			if (usuario.equals("nada")) {

				// a=false;
				break;
			}

			// if (usuario.equals("")) {
			// System.out.println("Desconocido");
			// }else {
			// System.out.println("Su nombre es: " + usuario);
			// }
			// Operador Ternario
			usuario = usuario.equals("") ? "Desconocido" : "Su nombre es: "
					+ usuario;
			System.out.println(usuario);

		} while (a);
		System.out.println("Fin del programa.");

		sc.close();
	}

}
