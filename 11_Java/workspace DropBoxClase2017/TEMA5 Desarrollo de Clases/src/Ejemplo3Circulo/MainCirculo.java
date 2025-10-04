package Ejemplo3Circulo;

public class MainCirculo {
	public static void main(String[] args) {
		Circulo c1 = new Circulo();

		c1.x = 10;
		c1.y = 10;
		c1.radio = 5;
		c1.color = "rojo";

		c1.mostrar();

		System.out.println("El área de c1 es " + c1.area());
		System.out.println("El perímetro de c1 es " + c1.perimetro());
	}
}
