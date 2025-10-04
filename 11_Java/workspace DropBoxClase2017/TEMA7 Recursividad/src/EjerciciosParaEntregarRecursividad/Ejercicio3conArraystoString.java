package EjerciciosParaEntregarRecursividad;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Ramon
 *
 */
public class Ejercicio3conArraystoString {
	/**
	 * Metodo Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 3.- Añade al final del ejercicio 2 una instrucción que muestre los
		// valores del array usando el método Arrays.toString(), en lugar de un
		// bucle.
		double precio[] = { 6, 30, 3.50, 4.95, 2.90, 10, 12.30, 2.45, 4.90,
				6.20, 7 };
		ordenar(precio);
		mostrar(precio);
		System.out.println();
		buscaPrecio(precio);
		System.out.println(Arrays.toString(precio));
	}

	/**
	 * 
	 * @param precio
	 */
	public static void ordenar(double[] precio) {
		// Metodo para ordenar un array
		Arrays.sort(precio);

	}

	public static void buscaPrecio(double[] precio) {
		System.out
				.println("Introduzca un precio del array para saber la posicion: ");
		Scanner sc = new Scanner(System.in);
		double key = sc.nextDouble();

		// Metodo para encontrar la posicion de una variable en un array
		double precio1 = Arrays.binarySearch(precio, key);

		for (int i = 0; i < precio.length; i++) {
			if (precio1 >= 0) {
				System.out.println("El numero esta en la posicion: "
						+ (int) precio1);
				// System.out.println("El numero esta en la posicion: " +
				// precio[precio1]);
				break;
			} else {
				System.out.println("No se ha encontrado el elemento.");
				break;
			}
		}

	}

	/**
	 * Metodo Mostrar
	 * 
	 * @param precio
	 */
	public static void mostrar(double[] precio) {
		for (int i = 0; i < precio.length; i++) {
			System.out.print((i) + "-" + "\"" + precio[i] + "\"" + " ");
		}
	}

}
