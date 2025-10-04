/**
 * 
 */
package EjemplosMetodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class EjemploMetodosParametros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nombre de usuario: ");
		String nombreUsuario = sc.nextLine();
		saludos(nombreUsuario);
		
		sc.close();
	}
	static void saludos(String nombre){
		System.out.println("Buenos dias " + nombre + " ¿Como estas? ");
	}
}
