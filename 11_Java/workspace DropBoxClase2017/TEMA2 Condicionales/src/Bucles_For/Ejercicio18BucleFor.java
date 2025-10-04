package Bucles_For;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio18BucleFor {

	/**
	 * PDF-Ejercicio de Bucles 18/22
	 * Ejercicio 18 Bucles for-While anidados
	 */
	public static void main(String[] args) {
		// 18.- Escribe una aplicación que solicite cinco notas. Si el usuario
		// escribe una nota que no está entre 0 y 10 se le informará del error y
		// se le volverá a pedir el dato.

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Escriba 5 Notas ");
			System.out.println("===============");
			
			int nota;
			int i = 1;

			for (int j = 1; j < 6; j++) {
				System.out.print("Nota " + i + ": ");
				nota = sc.nextInt();
				i++;
				
				// System.out.println("Nota " + i);
				// nota = sc.nextInt();
				

				while (nota < 0 || nota > 10) {
					System.out.println("Error. Escriba una nota entre 0 y 10");
					nota = sc.nextInt();
				}
			}

		} catch (Exception e) {
			System.out.println("Parametro incorrecto ");
			System.out.println("Tipo de Error: " + e.toString());
			System.out.println("Fin del Programa.");
		}

		sc.close();
	}

}
