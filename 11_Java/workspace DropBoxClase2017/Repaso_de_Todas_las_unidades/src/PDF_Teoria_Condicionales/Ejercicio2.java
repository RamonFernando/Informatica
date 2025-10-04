/**
 * 
 */
package PDF_Teoria_Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio2 {

	/**
	 * @PDF-Teoria
	 */
	// Variables Finalles.
	// Descuento del 8%
	public static final float DESCUENTO = 8F;
	// Descuento cuando es mayor que 100 €.
	public static final float COMPRA_MIN = 100F;
	// Descuento maximo permitido 10 €.
	public static final float DESCUENTO_MAX = 10F;

	public static void main(String[] args) {
		// Cuando hay un descuento maximo y el descuento lo supera, aqui esta lo
		// que se debe de hacer.

		float precio;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el precio de la compra ");
		precio = sc.nextInt();

		if (precio > 0) {
			float descuentopara = precio * DESCUENTO / 100;
			if (precio > COMPRA_MIN) {
				if(descuentopara>DESCUENTO_MAX){
					descuentopara = DESCUENTO_MAX;
				}
				precio = precio - descuentopara;
			}
		}else{
			System.out.println("El precio final a pagar es " + precio + " €");
		}

		sc.close();

	}

}
