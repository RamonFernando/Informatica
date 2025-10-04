/**
 * 
 */
package EjemplosMetodos;

/**
 * @author horabaixa
 *
 */
public class EjemploMetodosParametros3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("El area de un circulo de radio 5m es " + areaCirculo(5) + " m²");
		System.out.println("El perimetro de un círculo de radio 5m es " + periCirculo(5) + "m²");
		
	}
	static double areaCirculo(double radio){
		double area = 3.141592 * radio;
		return area;
	}
	
	static double periCirculo(double radio){
		return 2 * 3.141592 * radio;
	}
}
