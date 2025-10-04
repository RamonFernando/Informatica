/**
 * 
 */
package Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejer6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double precio;
		int unidades;
		double precioFinal;
		System.out.println("Introduzca precio de producto: ");
		precio = sc.nextDouble();
		System.out.println("Introduzca numero de unidades: ");
		unidades = sc.nextInt();
		
		precioFinal = precio*unidades;
		if(precioFinal>75){
			
			System.out.println("Importe total: " + precioFinal + " €");
			System.out.println("Con descuento del 15%");
			System.out.println("Total a pagar: "  + (precioFinal*0.85) + " €" );
			
		}else{
			System.out.println("Importe total: " + precioFinal + " €");
			System.out.println("Con descuento del 5%");
			System.out.println("Total a pagar: " + (precioFinal*0.95) + " €" );
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
