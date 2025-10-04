/**
 * 
 */
package EjemplosMetodos;

/**
 * @author Ramon
 *
 */
public class EjemplosMetodos {

	/**
	 * @param Metodos
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Llamando a mayordomo");
		mayordomo();
		System.out.println("Mas instrucciones...\n");
		System.out.println("Tabla de Multiplicar del 5");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		tablaDel5();
	}
	// Muestra una frase en pantalla
	static void mayordomo(){
		System.out.println("¿Que se le ofrece?");
	}
	// Metodo que escribe la tabla de multiplicar del 5
	static void tablaDel5(){
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("5 x " + i + " = " + (5*i));
		}
	}
}
