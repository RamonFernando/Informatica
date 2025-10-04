package Ejemplo2Punto;

public class Ejemplo2 {

	public static void main(String[] args) {

		Punto p1 = new Punto();
		p1.x = 10;
		p1.y = 20;
		p1.color = "rojo";

		Punto p2 = new Punto();
		p2.x = 5;
		p2.y = 15;
		p2.color = "verde";

		p1.mostrar();
		p2.mostrar();

		System.out.println("Inicializamos p1");
		p1.inicializar();
		p1.mostrar();

		System.out.println("Desplazamos p2 100px a la derecha");
		p2.mostrar();
		p2.desplazarX(100);
		p2.mostrar();

		System.out.println("Desplazamos p2 10px a la derecha y 20px hacia arriba");
		p2.mostrar();
		p2.desplazar(10, 20);
		p2.mostrar();
	}

}
