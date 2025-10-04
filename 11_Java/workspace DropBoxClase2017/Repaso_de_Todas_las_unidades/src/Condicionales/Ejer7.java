/**
 * 
 */
package Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejer7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		final int variableFinal= 4;
		try{
			System.out.println("Introduzca un numero entre 1 y 10");
			num = sc.nextInt();
			while(num <1 || num > 10){
				System.out.println("Error, introduce un numero entre 1 y 10: ");
				num = sc.nextInt();
			}
			if(num == variableFinal){
				System.out.println("Has acertado!");
			}else{
				System.out.println("Has fallado!");
			}
			
		}catch(Exception e){
			System.out.println("Parametro incorrecto");
			System.out.println("Error: " + e.toString());
		}
		sc.close();
	}

}
