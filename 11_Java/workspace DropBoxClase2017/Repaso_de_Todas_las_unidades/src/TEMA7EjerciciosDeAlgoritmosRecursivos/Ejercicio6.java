package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio6 {

	public Ejercicio6() {
		// 6.- Escribe un método que calcule el mínimo de un array. Tomará como parámetros un array de
		// enteros y un entero que representa el número de elementos del array.
		// Devolverá el valor más
		// pequeño dentro del array. 
		
	}

	public static void main(String[] args) {
		int[] precios = {23,15,18,20,57};
		System.out.println("Mínimo: " + minimo(precios, precios.length));

	}
	public static int minimo(int[] lista, int num){
		if (num == 1) {
			return lista[0];
		}else{
			return Math.min(minimo(lista, num - 1), lista[num - 1]);
		}
	}
}
