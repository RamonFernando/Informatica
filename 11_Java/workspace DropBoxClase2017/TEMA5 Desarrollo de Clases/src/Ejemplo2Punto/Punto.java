package Ejemplo2Punto;

public class Punto {
	// Atributos
	int x, y; // Coordenadas del punto
	String color; // Color del punto

	// Métodos
	void mostrar() {
		System.out.println("Este punto tiene coordenadas (" + x + "," + y + ") y es de color " + color);
	}

	void inicializar() {
		x = 0;
		y = 0;
		color = "blanco";
	}

	void desplazarX(int dx) {
		x = x + dx;
	}

	void desplazarY(int dy) {
		y = y + dy;
	}

	void desplazar(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

}