/**
 * 
 */
package EjercicioBucles;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejer18y19 {

	/**
	 * PDF-Ejercicio de Bucles 18 y 19/22
	 * Descripcion:
	 * Condicionales Ejercicio con for-while.
	 * Ejercicio 18 y 19
	 */
	public static void main(String[] args) {
		// 18.- Escribe una aplicación que solicite cinco notas. Si el usuario
		// escribe una nota que no está entre 0 y 10 se le informará del error y
		// se le volverá a pedir el dato.
		// 19.- Amplía la aplicación anterior para que a medida que se van
		// introduciendo las notas se vayan sumando (en una variable llamada
		// suma). Al final, devolverá la nota media de esas notas.

		Scanner sc = new Scanner(System.in);
		double nota = 0;
		double i = 1;
		double suma = 0;

		System.out.println("Introduzca 5 Notas.");

		for (int j = 1; j <= 5; j++) {
			System.out.print("Nota: " + i + ": ");
			nota = sc.nextDouble();
			i++;
			
			while(nota<0 || nota>10){
				System.out.print("Introduzca una nota valida que este entre 0 y 10: ");
				nota = sc.nextDouble();
			}
			suma = suma+nota;
		}
		System.out.println("La suma de todas sus notas es: " + suma + "/50 posibles.");
		System.out.println("Su media es de: " + (suma/5) + "/10.");
		sc.close();

	}
}
