package Ejemplo4Rectangulo;

public class Rectangulo {

	// Atributos
	int x, y;
	int base, altura;
	String color;

	// Métodos
	void mostrar() {
		System.out.println("Coordenadas: (" + x + "," + y + ")");
		System.out.println("Tamaño: " + base + "x" + altura);
		System.out.println("Color: " + color);
	}

	int area() {
		return base * altura;
	}

	int perimetro() {
		return 2 * base + 2 * altura;
	}

	void mover(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	boolean estaDentro(int a, int b) {
		if (a > x && a < x + base && b > y - altura && b < y) {
			return true;
		}

		return false;
	}
}
