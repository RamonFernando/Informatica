package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio5 {

	public Ejercicio5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 5.- Escribe un método que calcule recursivamente la suma de todos los
		// números enteros entre 1 y n.
		
		System.out.println("Rsultado " + suma(5));

	}
	public static int suma(int n){
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}else {
			return n + suma(n-1);
		}
	}
}
