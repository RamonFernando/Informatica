package Ejemplo14;

/**
 * En este ejemplo hacemos que un constructor llame a otro.
 * 
 * @author Ramon
 *
 */
public class MainEjemplo14 {
	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		c1.mostrar();
		
		System.out.println();
		
		Circulo c2 = new Circulo(10,20,"amarillo",50);
		c2.mostrar();
		
		System.out.println();
		
		Circulo c3 = new Circulo(15,33);
		c3.mostrar();

	}
}
