package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio3 {

	public Ejercicio3() {
		// 3.- Crea una clase con un método transforma(int dato) que transforme
		// un número entero
		// en base diez a hexadecimal. Utiliza un procedimiento recursivo.
		// Ayuda: Crea un método auxiliar:
		// String aHex(int n)
		// que tome un número entre 0 y 15 y lo devuelva expresado en
		// hexadecimal. Puedes usar un switch
		// para esto.
	}

	public static void main(String[] args) {
		//
		System.out.println(transforma(180));
	}

	public static String transforma(int dato) {
		// Caso Base
		if (dato == 0) {
			return "";
			// Caso Recursivo
		} else {
			return transforma(dato / 16) + aHex(dato % 16);
		}

	}

	public static String aHex(int dato) {
		switch (dato) {
		case 10:
			return "A";
		case 11:
			return "B";
		case 12:
			return "C";
		case 13:
			return "D";
		case 14:
			return "E";
		case 15:
			return "F";

		default:
			return String.valueOf(dato);
		}
	}
}
