package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio9A {
	// 9.- Crea un método int sumar(int[] lista, int n) que calcule la suma de
	// los elementos de un array
	// lista de n números enteros.
	public static void main(String[] args) {
			
		int[]numeros = {4,5,6};
		System.out.println("La suma del array es: " + sumar(numeros, numeros.length));

	}
	public static int sumar(int[] lista, int n){
		if (n == 1) {
			return lista[0];
		}else {
			return sumar(lista, n-1) + lista[n-1];
		}
	}
}
