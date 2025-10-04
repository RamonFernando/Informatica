package TEMA7EjerciciosDeAlgoritmosRecursivos;

import java.util.Arrays;

public class EjercicioEjBusquedaBinariaRecursivo {

	// 3 20 52 60 61 70 75 81
	// Buscar el numero 70 (Dont exist)

	public EjercicioEjBusquedaBinariaRecursivo() {

	}

	public static void main(String[] args) {

		int[] numerosArray = { 3, 20, 52, 60, 61, 70, 75, 81 };
		System.out.println("Posicion: "
				+ buscar(numerosArray, 0, numerosArray.length - 1, 70));

		System.out.println(Arrays.binarySearch(numerosArray, 70));
	}

	public static int buscar(int[] numeros, int inicio, int fin, int num) {

		int medio = (inicio + fin) / 2;
		if (inicio > fin) {
			// Caso base
			return -1;
		} else if (numeros[medio] > num) {
			// Caso Recursivo
			return buscar(numeros, inicio, medio - 1, num);

		} else if (numeros[medio] < num) {
			return buscar(numeros, medio + 1, fin, num);
		} else {
			return medio;
		}

	}
}
