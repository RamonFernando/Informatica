package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio7 {

	public Ejercicio7() {

	}

	// 7.- Escribe un método String invertir(int n) que invierta las cifras
	// de un número entero, devolviendo
	// 2 el resultado como un String. Por ejemplo:
	// Si n = 456, entonces invertir(456) = "654"
	// Ayuda: Puedes aplicar las operaciones módulo (n%10) y división (n/10)
	// para descomponer el
	// número.
	public static void main(String[] args) {
		int x = 197;
		System.out.println("Original: " + x);
		System.out.println("Invertido: " + invertir(x));
	}

	public static String invertir(int n) {
		if (n < 10) {
			return String.valueOf(n);
		} else {
			return n % 10 + invertir(n / 10);
		}
	}
}
