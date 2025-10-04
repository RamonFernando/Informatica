/**
 * 
 */
package Bucles_For;

/**
 * @author Ramon
 *
 */
public class Ejercicio17BucleFor {

	/**
	 * PDF-Ejercicio de Bucles 17/22
	 * Ejercicio 17 con Bucle For Anidado.
	 */
	public static void main(String[] args) {
		// Escribe las 10 tablas de multiplicar.
		
		System.out.println("Tablas de multiplicar");
		System.out.println("=====================");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("\nTabla de multiplicar del " + i);
			System.out.println("==========================");
				for (int j = 1; j < 11; j++) {
					System.out.println("      " + i + " x " + j + " = " + (i * j));
			}
			
		}
	}

}
