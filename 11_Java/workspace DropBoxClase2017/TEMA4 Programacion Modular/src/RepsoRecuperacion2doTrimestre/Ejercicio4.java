package RepsoRecuperacion2doTrimestre;

import java.util.Arrays;

public class Ejercicio4 {

	public Ejercicio4() {
		// TODO Auto-generated constructor stub
	}

	static int numeros[] = { 45, 29, 38, 3, 10, 72, 61 };

	public static void main(String[] args) {
		// 4.- Desarrolla un método que tome un array de números enteros y lo
		// muestre ordenado.
		// 5.- Modifica la actividad anterior para que el método devuelva el
		// array ordenado

		ordenArray();

	}

	private static void ordenArray() {

		// Arrays.sort(numeros);
		int posMin = 0;
		int aux = 0;

		for (int i = 0; i < numeros.length; i++) {
			posMin = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[posMin] > numeros[j]) {
					posMin = j;
				}
			}
			aux = numeros[posMin];
			numeros[posMin] = numeros[i];
			numeros[i] = aux;

		}

		for (int i = 0; i < numeros.length; i++) {

			System.out.print(numeros[i] + " ");
		}

	}

}
