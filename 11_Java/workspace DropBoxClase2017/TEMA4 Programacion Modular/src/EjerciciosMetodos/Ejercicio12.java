/**
 * 
 */
package EjerciciosMetodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio12 {

	/**
	 * @param Descripcion
	 *            : Ejercicio con 3 metodos distintos Introducir, Ordenar y
	 *            Mostrar.
	 */
	public static void main(String[] args) {
		// 12.- Desarrolla modularmente (usando tres métodos, además de main()
		// un programa que solicite por consola una lista de números enteros,
		// los ordene y los muestre en pantalla.
		int numeros[] = Introducir();
		
		Introducir();
		Ordenar(numeros);
		Mostrar(numeros);

	}

	// Primer metodo para introducir los valores en el array.
	static int[] Introducir() {
		Scanner sc = new Scanner(System.in);

		// Array
		int numeros[] = new int[4];

		System.out.println("---------------------------------");
		System.out.println("--------- Ejercicio 12 ----------");
		System.out.println("---------------------------------");
		System.out.println("--Introduzca 4 numeros enteros---");
		System.out.println("---------------------------------");

		// Introducimos los numeros en un array.
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Numero " + (i + 1));
			numeros[i] = sc.nextInt();
		}

		// sc.close();
		// LLamamos al metodo pasado el array.
		return numeros;
	}
	// Segundo metodo para Ordenar el array introduciendo los numeros.
	static void Ordenar(int[] numeros){
		int posMin=0;
		int aux=0;
		
		for (int i = 0; i < numeros.length; i++) {
			posMin = i;
			for (int j = i+1; j < numeros.length; j++) {
				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}
		aux = numeros[i];
		numeros[i] = numeros[posMin];
		numeros[posMin] = aux;
			
		}
	}
	// Tercer metodo para mostrar el array Ordenado.
	static void Mostrar(int[] numeros){
		System.out.println("---------------------------------");
		System.out.println("----------Array Ordenado---------");
		System.out.println("---------------------------------");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("---------Fin del Programa--------");
		System.out.println("---------------------------------");
	}
}
