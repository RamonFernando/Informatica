package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio11B {

	// 11.- Crea un método que permita obtener el mayor elemento de un array de
	// números decimales (double).

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]numeros = {20.3,14.2,10,28};
		System.out.println("Mayor numero del array es: " + mayorElemento(numeros, numeros.length));
		
	}
	public static double mayorElemento(double[]lista, int n){
		if (n == 1) {
			return lista[0];
		}else {
			return Math.max(lista[n-1], mayorElemento(lista, n-1));
		}
	}
	
}
