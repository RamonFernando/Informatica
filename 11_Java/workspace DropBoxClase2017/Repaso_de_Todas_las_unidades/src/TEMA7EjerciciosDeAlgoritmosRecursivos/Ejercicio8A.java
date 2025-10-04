package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio8A {
	// 8.- Escribe un método int sumar(int n) que sume las cifras del número que
		// se le pasa como
		// parámetro.
		// Por ejemplo:
		// Si n = 456, entonces sumar(456) = 4 + 5 + 6 = 15
		// Ayuda: Puedes aplicar las operaciones módulo (n%10) y división (n/10)
		// para descomponer el
		// número.
	public static void main(String[] args) {
		System.out.println("Suma: " + suma(456));

	}
	public static int suma(int n){
		if (n == 0) {
			return 0;
		}else {
			return n%10 + suma(n/10);
		}
	}
}
