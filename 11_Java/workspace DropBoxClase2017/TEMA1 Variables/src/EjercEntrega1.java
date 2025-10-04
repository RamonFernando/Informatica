import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ramon
 *
 */
public class EjercEntrega1 {

	/**
	 * Ejercicios para Entregar
	 */
	public static void main(String[] args) {
		// Calculadora
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime un numero del 0 al 127");
		float numero1 = entrada.nextFloat();
		
		System.out.println("Dime un numero del 0 al 127");
		float numero2 = entrada.nextFloat();
		
		float resultado = numero1 * numero2;
		
		System.out.println("El resultado es " + resultado);
		
		entrada.close();

	}

}
