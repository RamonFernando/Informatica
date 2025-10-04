package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio9 {

	// 9.- Crea un método int sumar(int[] lista, int n) que calcule la suma de
	// los elementos de un array
	// lista de n números enteros.
	public Ejercicio9() {

	}

	public static void main(String[] args) {

		int[] numeros = { 10, 20, 15, 25 };
		System.out.println("Array de numeros");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		System.out.println("La suma de los numeros del array es: "
				+ sumar(numeros, numeros.length));

	}

	public static int sumar(int[] lista, int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return lista[0];
		} else {
			return lista[n - 1] + sumar(lista, n - 1);
		}
	}

}
