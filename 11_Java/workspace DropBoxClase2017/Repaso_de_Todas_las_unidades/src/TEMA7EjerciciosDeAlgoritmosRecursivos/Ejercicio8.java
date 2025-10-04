package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio8 {
	// 8.- Escribe un método int sumar(int n) que sume las cifras del número que
	// se le pasa como
	// parámetro.
	// Por ejemplo:
	// Si n = 456, entonces sumar(456) = 4 + 5 + 6 = 15
	// Ayuda: Puedes aplicar las operaciones módulo (n%10) y división (n/10)
	// para descomponer el
	// número.

	public Ejercicio8() {

	}
	public static void main(String[] args){
		int x = 456;
		System.out.println("Original: " + x);
		System.out.println("Suma: " + sumar(x));
		System.out.println("La suma de las cifras del número " + x + " es " + sumar(x));
	}
	

	public static int sumar(int n) {
		if (n == 0) {
			return 0;
		}
		// Caso base
		if (n < 10) {
			return n;
		} else {
			// Caso recursivo
			return n % 10 + sumar(n / 10);
		}
	}

}
