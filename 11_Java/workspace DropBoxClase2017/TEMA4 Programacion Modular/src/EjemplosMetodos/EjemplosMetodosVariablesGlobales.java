/**
 * 
 */
package EjemplosMetodos;

import java.util.Scanner;

/**
 * @author horabaixa
 *
 */
public class EjemplosMetodosVariablesGlobales {

	/**
	 * @param args
	 */
	static String nombre; // Variable global
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leerNombre();
		System.out.println("El nombre es " + nombre);
	}
	
	static void leerNombre(){
		Scanner entrada = new Scanner(System.in);	// Variable local
		System.out.println("¿Cómo te llamas?");
		nombre = entrada.nextLine();
	entrada.close();
	}
	
}
	