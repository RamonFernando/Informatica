package TEMA7EjerciciosDeAlgoritmosRecursivos;

import java.util.Arrays;

public class EjercicioBusBinariaIterativo {

	// 3 20 52 60 61 70 75 81
	// Search the number 51 (Dont exist)
	public static void main(String[] args) {

		int[] numerosArray = { 3, 20, 52, 60, 61, 70, 75, 81 };
		System.out.println("Posicion: "
				+ buscar(numerosArray, 0, numerosArray.length - 1, 51));
		System.out.println(Arrays.binarySearch(numerosArray, 52));
	}

	public static int buscar(int[] numeros, int inicio, int fin, int num) {

		// Caso Iterativo

		while (inicio <= fin) {
			int medio = (inicio + fin) / 2;
			if (numeros[medio] > num) {
				fin = medio - 1;
			} else if (numeros[medio] < num) {
				inicio = medio + 1;
			} else if (numeros[medio] == num) {
				return medio;
			}
		}
		return -1;
	}
}
