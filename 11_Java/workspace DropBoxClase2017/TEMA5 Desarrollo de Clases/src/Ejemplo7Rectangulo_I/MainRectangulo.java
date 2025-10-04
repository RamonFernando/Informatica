/**
 * 
 */
package Ejemplo7Rectangulo_I;

/**
 * @author Ramon
 *
 */
public class MainRectangulo {

	/**
	 * Metodos y Constructores: Rectangulo
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo r1;
		
		r1 = new Rectangulo(5, 10, 5, 10, "Gris");
		
		r1.x = 5;
		r1.y = 10;
		r1.base = 5;
		r1.altura = 10;
		r1.color = "Gris";
		
		System.out.println("Eje: x " + r1.x + " Eje: y " + r1.y + " Base: " + r1.base + " Altura: " + r1.altura + " Color: " + r1.color  );
	}

}
