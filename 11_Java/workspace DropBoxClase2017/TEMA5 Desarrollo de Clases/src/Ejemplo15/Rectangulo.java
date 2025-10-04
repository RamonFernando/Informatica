package Ejemplo15;

public class Rectangulo {

	// Atributos
	private int x, y;
	private int base, altura;
	private String color;

	// Constructores
	Rectangulo() {

	}

	Rectangulo(int x, int y, int base, int altura, 
			String color) {
		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
		this.color = color;
	}
	
	Rectangulo(String color){
		this(0,0,0,0,color);
	}

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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y = y;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
