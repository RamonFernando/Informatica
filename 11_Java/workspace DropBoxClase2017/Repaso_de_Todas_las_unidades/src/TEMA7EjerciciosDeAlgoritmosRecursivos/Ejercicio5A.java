package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio5A {
	// 5.- Escribe un método que calcule recursivamente la suma de todos los
	// números enteros entre 1 y n.
	
	public static void main(String[] args) {
		System.out.println("Resultado: " + suma(5));

	}
	public static int suma(int n){
		if (n == 1) {
			return 1;
		}else {
			return suma(n-1) + n;
		}
	}
}
