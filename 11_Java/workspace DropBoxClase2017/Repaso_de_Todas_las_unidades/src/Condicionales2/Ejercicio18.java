/**
 * 
 */
package Condicionales2;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 18.- Escribe una aplicación que solicite cinco notas. Si el usuario
		// escribe una nota que no está entre 0 y 10 se le informará del error y
		// se le volverá a pedir el dato.
		// 19.- Amplía la aplicación anterior para que a medida que se van
		// introduciendo las notas se vayan sumando (en una variable llamada
		// suma). Al final, devolverá la nota media de esas notas.

		Scanner sc = new Scanner(System.in);
		int i =0;
		int notas = 0;
		int suma = 0;
		System.out.println("Escribe 5 notas para sacar la media.");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

		for ( i = 1; i < 6; i++) {
			System.out.println(i + "º Nota");
			notas = sc.nextInt();
			
			while (notas < 0 || notas > 10) {
				System.out.println("Escribe una nota entre 0-10");
				notas = sc.nextInt();
				continue;
			}
			suma = suma + notas;
		}
		
		System.out.println("Su nota media es de : " + (suma/5));

		sc.close();

	}

}
