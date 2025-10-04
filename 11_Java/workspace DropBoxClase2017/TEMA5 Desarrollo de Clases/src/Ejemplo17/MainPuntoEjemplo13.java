package Ejemplo17;

/**
 * En este ejemplo hacemos que un constructor llame a otro.
 * 
 * @author Ramon
 *
 */
public class MainPuntoEjemplo13 {

	public static void main(String[] args) {

		Punto p1 = new Punto();
		p1.setX(10);			
		p1.setY(20);
		p1.setColor("Rojo");
		System.out.println("Hay " + p1.contadorPersonas + " puntos.");

		Punto p2 = new Punto();
		p2.setX(5);
		p2.setY(15);
		p2.setColor("Verde");
		System.out.println("Hay " + p2.contadorPersonas + " puntos.");
		
		
		p1.mostrar();
		p2.mostrar();
		
		Punto p3 = new Punto(10,10);
		p3.mostrar();
		System.out.println("Hay " + p3.contadorPersonas + " puntos.");
		
		System.out.println("Inicializamis p1");
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
