package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio10 {
	// 10.- Escribe un método int multiplicar(int[] lista, int n) que calcule la
	// multiplicación de los
	// elementos de un array lista de n números enteros.

	public Ejercicio10() {

	}

	public static void main(String[] args) {
		
		int[]numeros = {2,3,4,5,6,10,9};
		System.out.println("Array de numeros");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
			
		}
		System.out.println();
		System.out.println("La multiplicacion de los numeros del array es: " + multiplicar(numeros, numeros.length));

	}
	public static int multiplicar(int[]lista, int n){
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return lista[0];
		}else{
			return lista[n-1] * multiplicar(lista,n-1);
		}
	}
}
