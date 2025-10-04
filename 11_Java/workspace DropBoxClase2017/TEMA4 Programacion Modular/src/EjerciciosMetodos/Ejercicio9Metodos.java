/**
 * 
 */
package EjerciciosMetodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio9Metodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 9.- Crea un método que tome como parámetro un entero representando un
		// año, y devuelva true o false indicando si es bisiesto o no.

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un año : ");
		System.out.println("-------------------");
		int num = sc.nextInt();

		if (biciesto(num)) {
			System.out.println("Es un año bisiesto");
		} else {
			System.out.println("No es un año bisiesto");

		}

		sc.close();
	}

	static boolean biciesto(int num) {

		if ((num % 4 == 0) && (num % 100 != 0 || num % 400 == 0)) {
			return true;
		} else {
			return false;
		}

	}

}
