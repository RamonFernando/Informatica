package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio1A {

	// 1.- Crea una clase con un método:
	// String transforma(int dato)
	// que transforme un número entero en base diez a binario. Utiliza un
	// procedimiento recursivo.
	
	public static void main(String[] args) {
		
		System.out.println("Numero en Binario: " + transforma(10));
		
	}
	public static String transforma(int dato){
		
		if (dato == 0) {
			return "";
		}else {
			return transforma(dato/2) + dato%2;
		}
	}
}
