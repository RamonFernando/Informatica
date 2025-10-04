package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio1 {

	// 1.- Crea una clase con un método:
	// String transforma(int dato)
	// que transforme un número entero en base diez a binario. Utiliza un
	// procedimiento recursivo.

	public static void main(String[] args) {
		System.out.println(transforma(10));

	}

	public static String transforma(int dato) {

		// Caso Base
		if (dato == 0) {
			return "";
		} else {
			// Caso Recursivo
			return transforma(dato / 2) + dato % 2;

		}
	}
}
