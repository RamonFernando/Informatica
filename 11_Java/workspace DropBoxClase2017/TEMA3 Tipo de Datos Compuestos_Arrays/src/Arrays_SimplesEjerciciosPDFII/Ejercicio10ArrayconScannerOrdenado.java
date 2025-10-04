/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio10ArrayconScannerOrdenado {

	/**
	 * @PDF-Ejercicio de Arrays II 10/17 Descripcion: Ordenar el array 9/12
	 */
	public static void main(String[] args) {
		// 10.- Escribe un programa que pregunte las temperaturas de las últimas
		// ocho horas y las muestre ordenadas de menor a mayor, usando el método
		// de selección. Al final también indicará la temperatura menor y la
		// mayor.
		
		Scanner sc = new Scanner(System.in);
		float temperaturas[] = new float[8];
		// Declaracion de variables.
		
		
		System.out.println("================= Temperaturas ==================");
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("\"" + temperaturas[i] + "\" ");
		}
		
		sc.close();

	}

}
