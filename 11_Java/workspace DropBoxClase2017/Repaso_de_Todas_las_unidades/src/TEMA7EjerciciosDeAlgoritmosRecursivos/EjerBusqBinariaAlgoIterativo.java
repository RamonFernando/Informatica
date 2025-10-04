package TEMA7EjerciciosDeAlgoritmosRecursivos;

import java.util.Arrays;

public class EjerBusqBinariaAlgoIterativo {

	// 3 20 52 60 61 70 75 81
	// Buscar el numero 70 (Dont exist)
	public static void main(String[] args) {

		int[] numeros = { 3, 20, 52, 60, 61, 70, 75, 81, 24 };
		System.out.println("Array Original");
		System.out.println(Arrays.toString(numeros));
		System.out.println("Array ordenado");
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		System.out.println();
		System.out.println("Posiciones");
		System.out.println("Su numero esta en la posicion: "
				+ buscar(numeros, 0, numeros.length, 24));
		System.out.println("----------------------------------------");
		System.out.println("Su numero esta en la posicion: "
				+ buscar(numeros, 0, numeros.length, 61) + " y es el numero: "
				+ numeros[buscar(numeros, 0, numeros.length, 61)]);
		System.out.println("----------------------------------------");
		System.out.println();
	}

	public static int buscar(int[] lista, int inicio, int fin, int x) {

		while (inicio <= fin) {
			int medio = (inicio + fin) / 2;
			if (lista[medio] > x) {
				fin = medio - 1;
			} else if (lista[medio] < x) {
				inicio = medio + 1;
			} else if (lista[medio] == x) {
				return medio;
			}
			System.out.println("Inicio: " + inicio + " <--> " + "Fin: " + fin);
		}
		System.out.println("No se encontro el numero");
		return -1;

	}
}
