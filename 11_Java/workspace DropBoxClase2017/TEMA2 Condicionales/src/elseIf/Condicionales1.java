package elseIf;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ramon
 *
 */
public class Condicionales1 {

	/**
	 * PDF-Ejercicio de Condicionales 1/22
	 * Descripcion:
	 * Condicionales con if.
	 */
	public static void main(String[] args) {
		// Primera Clase condicionales Miercoles 5 Octubre 2016
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca la edad: ");
		int edad = entrada.nextInt();

		if (edad >= 18) {
			System.out.println("Puedes pasar!");
		}
		if (edad < 18) {
			System.out.println("No puedes pasar!, no eres mayor de edad, " + "tienes " + edad + " años");
		}
		entrada.close();
	}

}
