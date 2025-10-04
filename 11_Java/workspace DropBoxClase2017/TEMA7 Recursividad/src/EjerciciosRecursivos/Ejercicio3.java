package EjerciciosRecursivos;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(transforma(180));
	}

	public static String transforma(int dato) {

		if (dato == 0) {
			return "";
		} else {
			return transforma(dato / 16) + aHex(dato % 16);
		}

	}

	public static String aHex(int n) {

		switch (n) {
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
			return String.valueOf(n);
		}

	}

}
