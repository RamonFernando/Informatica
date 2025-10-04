/**
 * 
 */
package Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejer4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String pass = "";
		final String PASSWORD = "1234";
			System.out.println("Introduzca la contraseña: ");
			pass= sc.nextLine();
			if(pass.equals(PASSWORD)){
				System.out.println("Acceso concedido");
			}else{
				System.out.println("Acceso denegado");
			}
			
		
		
		
		
		sc.close();
	}

}
