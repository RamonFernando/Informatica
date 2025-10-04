/**
 * 
 */
package Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejer2y3 {

	/**
	 * Repaso
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double prec = 0;
		double precioFinal;
		
		System.out.println("Introduzca Precio de compra: ");
		prec = sc.nextDouble();
		
		if (prec >= 80) {
			precioFinal = prec * 0.85;

			System.out.println("Importe total: " + prec + " € "
					+ "\ncon descuento del 15%: " + precioFinal + " €");

		} else if(prec > 5 && prec<=80) {
			precioFinal = prec * 0.90;
			System.out.println("Importe total: " + prec + " € "
					+ "\ncon descuento del 10%: " + precioFinal + " €");
		}
		else if(prec<=5){
			precioFinal = prec+2;
			System.out.println("Importe total: " + prec + " € " 
					+ "usted tiene un bonus de 2 € " 
					+ "Precio Final: " + precioFinal + " €");
		}

		sc.close();

	}
}
