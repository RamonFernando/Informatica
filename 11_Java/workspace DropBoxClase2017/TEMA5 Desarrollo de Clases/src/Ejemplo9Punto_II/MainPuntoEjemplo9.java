package Ejemplo9Punto_II;

/**
 * En este ejemplo hacemos que un constructor llame a otro.
 * 
 * @author csogorb
 *
 */
public class MainPuntoEjemplo9 {

	public static void main(String[] args) {

		Punto p1 = new Punto();
		p1.x = 10;			
		p1.y = 20;
		p1.color = "rojo";

		Punto p2 = new Punto(5, 15, "verde");

		p1.mostrar();
		p2.mostrar();
		
		Punto p3 = new Punto(10,10);
		p3.mostrar();

	}

}
