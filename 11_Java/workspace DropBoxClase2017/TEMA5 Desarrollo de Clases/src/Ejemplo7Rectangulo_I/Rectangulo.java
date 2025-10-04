/**
 * 
 */
package Ejemplo7Rectangulo_I;

/**
 * @author Ramon
 *
 */
public class Rectangulo {

	/**
	 * @param args
	 */
	
	// Atributos
	int x, y;
	int base, altura;
	String color;
	
	Rectangulo(int X, int Y, int Base, int Altura, String Color) {
		
		this.x = X;
		this.y = Y;
		this.base = Base;
		this.altura = Altura;
		this.color = Color;
	}
	
	// Metodos
	void mostrar(){
		System.out.println("Coordenadas: (" + x + y + ") "  );
		System.out.println("Tamaño: " + base + " x " + altura + (base*altura));
		System.out.println("Color: " + color);
	
	}

}
