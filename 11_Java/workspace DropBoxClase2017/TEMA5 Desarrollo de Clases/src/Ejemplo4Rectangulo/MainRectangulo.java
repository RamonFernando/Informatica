package Ejemplo4Rectangulo;

public class MainRectangulo {

	public static void main(String[] args) {
		Rectangulo rec1 = new Rectangulo();
		rec1.x = 10;
		rec1.y = 15;
		rec1.base = 100;
		rec1.altura = 200;
		rec1.color = "azul";

		rec1.mostrar();
		System.out.println("El área de rec1 es " + rec1.area());
		System.out.println("El perímetro de rec1 es " + rec1.perimetro());

		System.out.println();
		System.out.println("Desplazamos el rectángulo 2 píxeles a la derecha " + "y 5 píxeles hacia arriba");
		rec1.mover(2, 5);
		rec1.mostrar();

		System.out.println();
		System.out.println("¿Está (300,300) dentro del rectángulo?");
		System.out.println(rec1.estaDentro(300, 300));
	}

}