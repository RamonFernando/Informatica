package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio10A {
	// 10.- Escribe un método int multiplicar(int[] lista, int n) que calcule la
	// multiplicación de los
	// elementos de un array lista de n números enteros.

	public static void main(String[] args) {
		
		int[] numeros = {5,6,7};
		System.out.println("Resultado: " + multiplicar(numeros, numeros.length));
	}
	public static int multiplicar(int[]lista, int n){
		if (n == 1) {
			return lista[0];
		}else {
			return lista[n-1] * multiplicar(lista, n-1);
		}
	}
}
