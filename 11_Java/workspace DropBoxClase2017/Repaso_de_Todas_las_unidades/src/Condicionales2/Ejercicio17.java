/**
 * 
 */
package Condicionales2;

/**
 * @author Ramon
 *
 */
public class Ejercicio17 {

	/**
	 * PDF-Ejercicio de Bucles II 17/22
	 */
	public static void main(String[] args) {
		// Escribe las 10 tablas de multiplicar.

		System.out.println("Tablas de multiplicar");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*");

		for (int i = 0; i < 11; i++) {
			System.out.println("\nTabla del " + i);
			System.out.println("*=*=*=*=*=*=*");
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
		System.out.println("*=*=*=*=*=*=*=*=*");
		System.out.println(" Fin del Programa");

	}

}
