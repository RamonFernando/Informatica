package EjerciciosParaEntregarRecursividad;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Ramon
 *
 */
public class Ejercicio5ArraysEquals {

	/**
	 * Clase Scanner Static
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * Metodo Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 5.- Escribe una aplicación que rellene dos arrays con cinco nombres
		// de personas cada uno (preguntándolos desde consola). A continuación
		// indicará si son idénticos (con los mismos valores y mismas
		// posiciones) usando el método Arrays.equals().

		System.out.println("Arrays de Nombres");
		System.out.println("-----------------");
		String[] nombres1 = new String[5];
		String[] nombres2 = new String[5];

		System.out.println("Escribe 5 nombres para el array Nombres1 ");
		/**
		 * Los for para pedir los nombres de los arrays nombres1 y nombres2
		 */
		for (int i = 0; i < nombres1.length; i++) {
			System.out.println((i + 1) + "º Nombre");
			nombres1[i] = sc.nextLine();
		}
		System.out.println("Escribe 5 nombres para el array Nombres2 ");
		for (int i = 0; i < nombres2.length; i++) {
			System.out.println((i + 1) + "º Nombre");
			nombres2[i] = sc.nextLine();
		}
		/**
		 * Arrays.equals compara el array nombres1 con nombres2 para saber si
		 * son iguales
		 */
		boolean compara = Arrays.equals(nombres1, nombres2);
		System.out.println("Los arrays nombres1 y nombres2 son iguales? :  "
				+ compara);

	}

}
