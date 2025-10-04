package TEMA7EjerciciosDeAlgoritmosRecursivos;

import java.util.Arrays;

public class EjerBusqBinariaAlgoIterativoA {
	// 3 20 52 60 61 70 75 81 24
	// Buscar el numero 70 (Dont exist) con busqueda binaria

	public static void main(String[] args) {

		int[] numeros = { 3, 20, 52, 60, 61, 70, 75, 81, 24 };
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));

		System.out.println("El numero esta en la posicion: "
				+ buscar(numeros, 0, numeros.length, 24)
				+ " y es el numero es: "
				+ numeros[buscar(numeros, 0, numeros.length, 24)]);

	}

	public static int buscar(int[] lista, int inicio, int fin, int x) {

		while (inicio <= fin) {
			int medio = (inicio + fin) / 2;
			if (lista[medio] > x) {
				fin = medio - 1;
			} else if (lista[medio] < x) {
				inicio = medio + 1;
			} else if (lista[medio] == x) {
				System.out.println("Inicio: " + inicio + " <--> " + " Fin "
						+ fin);
				return medio;
			}
		}
		System.out.println("No se encontro el numero");
		return -1;
	}
}
