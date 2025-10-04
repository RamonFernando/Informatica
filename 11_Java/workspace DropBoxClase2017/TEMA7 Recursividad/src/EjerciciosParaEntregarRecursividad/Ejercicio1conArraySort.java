package EjerciciosParaEntregarRecursividad;

import java.util.Arrays;

/**
 * 
 * @author Ramon
 *
 */
public class Ejercicio1conArraySort{

	/**
	 * Metodo Main
	 * @param args
	 */
	public static void main(String[] args) {
		// 1.- Crea un programa que almacene los siguientes precios en un array
		// y lo muestre al final ordenado. Aprovecha para esto el método
		// Arrays.sort().

		// 6,30;3,50;4,95;2,90;10;12,30;2,45;4,90;6,20;7

		double precio[] = { 6, 30, 3.50, 4.95, 2.90, 10, 12.30, 2.45, 4.90, 6.20, 7 };
		ordenar(precio);
		mostrar(precio);
		
	}
	/**
	 * Metodo ordenar con Array.sort(precio)
	 * @param precio
	 */
	public static void ordenar(double[] precio) {
		// Metodo para ordenar un array
		Arrays.sort(precio);
	}
	/**
	 * Metodo mostrar para enseñar por consola los numeros del array
	 * @param precio
	 */
	public static void mostrar(double[] precio){
		for (int i = 0; i < precio.length; i++) {
			System.out.print((i) + "-" + "\"" + precio[i]+"\"" + " ");
		}
	}
}
