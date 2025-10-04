package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio2A {
	// 1.- Crea una clase con un método:
	// String transforma(int dato)
	// que transforme un número entero en base diez a binario. Utiliza un
	// procedimiento recursivo.
	// 2.- Realiza el ejercicio anterior con un
	// algoritmo iterativo.
	// Numero de base 10 a binario

	public static void main(String[] args) {
		System.out.println(transforma(0));
	}
	public static String transforma(int dato){
		String cadena = "";
		if (dato > 0) {
			while(dato > 0){
				cadena = dato%2 + cadena;
				dato = dato/2;
			}
		}else if(dato == 0){
			System.out.println("No se pudo convertir a binario");
			return "-1";
			
		}
		return cadena;
	}
	
}
// return transforma(dato/2) + dato%2;