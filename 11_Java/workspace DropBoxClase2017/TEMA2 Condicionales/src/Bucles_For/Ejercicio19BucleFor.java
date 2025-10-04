package Bucles_For;

import java.util.*;



/**
 * @author Ramon
 *
 */
public class Ejercicio19BucleFor {

	/**
	 * PDF-Ejercicio de Bucles 19/22
	 * Ejercicio 19 Bucles for-While anidados y TryCatch
	 */
	public static void main(String[] args) {
		// 19.- Amplía la aplicación anterior para que a medida que se van
		// introduciendo las notas se vayan sumando (en una variable llamada
		// suma). Al final, devolverá la nota media de esas notas.

		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Escriba 5 Notas");
			System.out.println("===============");
			double nota=0;
			int i = 1;
			double suma=0;

			for (int j = 1; j < 6; j++) {

				nota = 1;

				System.out.print("Nota: " + i + ": ");
				nota = sc.nextDouble();
				i++;
				
				while (nota < 0 || nota > 10) {
					System.out.println("Error. Escriba una nota entre 0 y 10");
					nota = sc.nextDouble();
				}
				suma = suma + nota;
				
				
				System.out.println("Tienes: " + suma + " puntos");
				System.out.println("===================\n");
				
				
			}
			System.out.println("La suma de todas sus notas es: " + suma + "/50 posibles.");
			System.out.println("Su media es de: " + (suma/5) + "/10.");

		} catch (Exception e) {
			System.out.println("Parametro incorrecto ");
			System.out.println("Tipo de Error: " + e.toString());
			System.out.println("Fin del Programa.");
		}

		sc.close();
	}

}
