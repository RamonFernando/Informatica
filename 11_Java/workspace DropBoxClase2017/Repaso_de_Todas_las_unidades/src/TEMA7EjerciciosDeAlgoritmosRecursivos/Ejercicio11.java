package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio11 {
	// 11.- Crea un método que permita obtener el mayor elemento de un array de
	// números decimales (double).

	public Ejercicio11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		double[] numeros = { 20.3, 12.2, 3.1, 19.5, 14.7,21.2 };
		System.out.println("Array de numeros");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		System.out.println("El mayor elemento del array numeros es: "
				+ mayorElemento(numeros, numeros.length));

	}

	public static double mayorElemento(double[] lista, int n) {
		if (n == 1) {
			return lista[0];
		} else {
			return Math.max(lista[n - 1], mayorElemento(lista, n - 1));

		}
	}

}
