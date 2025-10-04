/**
 * 
 */

/**
 * @author Ramon
 *
 */
public class Inicio {

	/**
	 * 
	 */
	public Inicio() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Figura2D f1 = new Circulo(20, 20, 20, "Verde");

		System.out.println("Area = " + f1.area());
		System.out.println("Perimetro = " + f1.perimetro());
		System.out.println("------------------------");

		f1 = new Rectangulo();

		Circulo c1 = new Circulo(10, 10, 50, "Azul");
		Dibujar(c1);

		Rectangulo r1 = new Rectangulo();
		Dibujar(r1);
	}

	public static void Dibujar(Dibujable dib) {
		dib.Dibujar();
	}
}
