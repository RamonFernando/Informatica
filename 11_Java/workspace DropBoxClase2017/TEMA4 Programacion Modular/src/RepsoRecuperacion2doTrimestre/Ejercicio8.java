package RepsoRecuperacion2doTrimestre;

public class Ejercicio8 {

	public Ejercicio8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 8.- Crea un método int max(int x, int y) que devuelva el mayor de los
		// números x e y.
		// Análogamente crea el método int min(int x, int y).

		metodoXY();

	}

	private static void metodoXY() {

		int x = 10;
		int y = 3;

		System.out.println("El mayor numero entre " + y + " y " + x + " es "
				+ max(10, 3));
		System.out.println("El menor numero entre " + y + " y " + x + " es "
				+ min(10, 3));

	}

	private static int min(int x, int y) {
		if (y < x) {
			return y;
		} else {
			return x;
		}
	}

	private static int max(int x, int y) {

		if (x > y) {
			return x;
		} else {
			return y;
		}

	}

}
