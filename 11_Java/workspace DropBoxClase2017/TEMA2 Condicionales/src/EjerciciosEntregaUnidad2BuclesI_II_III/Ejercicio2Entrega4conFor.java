/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio2Entrega4conFor {

	/**
	 * PDF- Ejercicio II Bucles I
	 * Ejercicio 4 Bucles con for.
	 */
	public static void main(String[] args) {
		// 4.- Utiliza un bucle for para preguntar 5 veces por un número entero,
		// y al final devolver la frase
		// "Has fallado".

		Scanner sc = new Scanner(System.in);
		int num;
		int cont = 1;
		for (int i = 1; i < 6; i++) {
			System.out.println("Introduzca un numero entero: " + cont);
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			num = sc.nextInt();
			cont++;
		}
		System.out.println("Has fallado!");
		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("  Fin del programa");
		sc.close();
	}

}
