/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio10OrdenarArrayconScanner {

	/**
	 * @PDF-Ejercicio de Arrays II 10/17 Descripcion: Ordenar el array 9/12
	 */
	public static void main(String[] args) {
		// 10.- Escribe un programa que pregunte las temperaturas de las últimas
		// ocho horas y las muestre ordenadas de menor a mayor, usando el método
		// de selección. Al final también indicará la temperatura menor y la
		// mayor.

		Scanner sc = new Scanner(System.in);
		// int totTemp = 0;
		int aux = 0;
		// boolean a = true;
		int temperaturas[] = new int[10];
		System.out.println("Introduzca 10 temperaturas");

		for (int i = 0; i < temperaturas.length; i++) {
			temperaturas[i] = sc.nextInt();
		}

		for (int i = 0; i < temperaturas.length - 1; i++) {

			for (int j = i + 1; j < temperaturas.length; j++) {
				if (temperaturas[j] < temperaturas[i]) {
					aux = temperaturas[i];
					temperaturas[i] = temperaturas[j];
					temperaturas[j] = aux;
				}

			}

		}
		System.out
				.println("============== Array de Temperaturas =================");
		System.out
				.println("**================ Array Ordenado ==================**");
		System.out
				.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*\n");
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print((i + 1) + "º" + "\"" + temperaturas[i] + "\"  ");
		}

		System.out
				.println("\n\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
		System.out.println("            ==== Fin del Programa ====");

		sc.close();
	}

}
