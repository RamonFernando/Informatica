package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio6A {
	// 6.- Escribe un método que calcule el mínimo de un array. Tomará como parámetros un array de
	// enteros y un entero que representa el número de elementos del array.
	// Devolverá el valor más
	// pequeño dentro del array.
	public static void main(String[] args) {
		
		int[]numerosArray = {17,19,15,14,11};
		System.out.println("Minimo: " + minimo(numerosArray, numerosArray.length));

	}
	public static int minimo(int[]numeros,int n){
		if (n == 1) {
			return numeros[0];
		}else {
			return Math.min(minimo(numeros, n-1), numeros[n-1]);
		}
	}
}
