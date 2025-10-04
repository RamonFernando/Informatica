package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio7A {
	
	// // 7.- Escribe un método String invertir(int n) que invierta las cifras
	// de un número entero, devolviendo
	// 2 el resultado como un String. Por ejemplo:
	// Si n = 456, entonces invertir(456) = "654"
	// Ayuda: Puedes aplicar las operaciones módulo (n%10) y división (n/10)
	// para descomponer el
	// número.
	
	public Ejercicio7A() {
		
	}

	public static void main(String[] args) {
		
		int n = 456;
		System.out.println("Original: " + n);
		System.out.println("Numero invertido: " + invertir(n));

	}
	public static String invertir(int n){
		if (n < 10) {
			return String.valueOf(n);
		}else {
			return n%10 + invertir(n/10);
		}
		
	}
}
