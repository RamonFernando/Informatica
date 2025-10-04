/**
 * 
 */
package Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejer5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mes;
		
		
		try{
			System.out.println("Introduzca un numero de mes entre 1 y 12: ");
			mes = sc.nextInt();
			while(mes<1 || mes>12){
				System.out.println("Mes incorrecto");
				System.out.println("Introduzca un numero de mes entre 1 y 12: ");
				mes = sc.nextInt();
			}
			if(mes>0 && mes <13){
				System.out.println("Mes correcto!");
			}
		}catch(Exception e){
			System.out.println("Parametro incorrecto!");
			System.out.println("Error " + e.toString());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
