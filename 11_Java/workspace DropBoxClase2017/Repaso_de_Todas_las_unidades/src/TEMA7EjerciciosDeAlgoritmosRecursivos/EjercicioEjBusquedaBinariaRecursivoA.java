package TEMA7EjerciciosDeAlgoritmosRecursivos;

import java.util.Arrays;

public class EjercicioEjBusquedaBinariaRecursivoA {

	// 3 20 52 60 61 70 75 81
	// Buscar el numero 70 (Dont exist) con busqueda recursiva
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = { 3, 20, 52, 60, 61, 70, 75, 81, 24 };
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		System.out.println("El numero esta en la posicion: "
				+ buscar(numeros, 0, numeros.length, 75) + " y es el "
				+ numeros[buscar(numeros, 0, numeros.length, 75)]);
	}

	public static int buscar(int[] lista, int inicio, int fin, int x) {

		int medio = (inicio + fin) / 2;
		// Caso Base
		if (inicio > fin) {
			return -1;
		}
		// Caso Recursivo
		else if (lista[medio] > x) {
			return buscar(lista, inicio, medio - 1, x);
		} else if (lista[medio] < x) {
			return buscar(lista, medio + 1, fin, x);
		} else if (lista[medio] == x) {
			System.out.println("Inicio: " + inicio + " <--> " + " Fin " + fin);
			return medio;
		}

		return medio;
	}
}
