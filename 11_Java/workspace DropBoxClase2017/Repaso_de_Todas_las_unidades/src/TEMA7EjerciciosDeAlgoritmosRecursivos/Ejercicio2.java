package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio2 {

	public Ejercicio2() {
		// 2.- Realiza el ejercicio anterior con un
		// algoritmo iterativo.
		// Numero de base 10 a binario
	}

	public static void main(String[] args) {
		System.out.println(transforma(10));

	}

	public static String transforma(int num) {

		String cadena = "";
		if (num > 0) {
			while (num > 0) {
				cadena = num % 2 + cadena;
				num = num / 2;
			}
		} else if (num == 0) {
			cadena = "0";
		} else {
			cadena = "No se ha podido convertir a binario";
		}
		return cadena;
	}
}
