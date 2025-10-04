package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio11A {

	public static void main(String[] args) {
		double[] pesos = { 100, 90, 56.5, 62 };
		System.out.println("Peso máximo: " + mayor(pesos, pesos.length));
	}

	public static double mayor(double[] lista, int n) {

		if (n == 1) {
			// Caso base: el array tiene un solo elemento.
			return lista[0];
		} else {
			// Caso recursivo.
			return Math.max(lista[n - 1], mayor(lista, n - 1));
		}

	}
	
}
