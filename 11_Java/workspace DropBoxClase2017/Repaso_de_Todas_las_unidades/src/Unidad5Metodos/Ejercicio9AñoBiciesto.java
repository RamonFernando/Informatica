/**
 * 
 */
package Unidad5Metodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio9AñoBiciesto {

	/**
	 * @param Comprobacion
	 *            de año biciesto
	 */
	public static void main(String[] args) {
		// 9.- Crea un método que tome como parámetro un entero representando un
		// año, y devuelva true o false indicando si es bisiesto o no.
		Scanner sc = new Scanner(System.in);
		int año = 0;

		if (año == 0) {
			System.out.println("Introduzca un año: ");
			System.out.println("------------------");
			año = sc.nextInt();
		}
		
		if (biciesto(año)) {
			System.out.println("El año " + año + " es un año biciesto.");
		}else {
			System.out.println("El año " + año + " no es un año biciesto.");
		}
		
		
		sc.close();

	}

	static boolean biciesto(int año) {
		if ((año % 4 == 0) && (año % 100 != 0 | año % 400 == 0)) {
			return true;
		} else {
			return false;
		}

	}
}
