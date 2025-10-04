import java.awt.image.ByteLookupTable;

/**
 * 
 */

/**
 * @author Ramon
 *
 */
public class Practica13Conversiones {

	/**
	 * Conversiones implicitas y explicitas.
	 */
	public static void main(String[] args) {
		// Conversiones implicitas. Se mete un numero pequeño en un numero mas
		// grande

		// byte edad = 40;
		// short numero;
		// numero = edad;
		//
		// int numeroInt;
		// numeroInt = numero;
		//
		// System.out.println(numero);

		// Conversiones explicitas: Cuando se mete una variable mas grande en
		// una mas pequeña ejemplo un int dentro de un byte.

		int precio = 50;

		byte precioByte = (byte) precio; // Esta es la manera de convertir un
											// int a un byte.

		double precioArticulo = 2300.55;
		float precioFloat = (float) precioArticulo; // Formula para convertir de
													// una variable a otra.

		long precioLong = 127382;
		short precioShort = (short) precioLong;
		
		System.out.println(precioLong);

	}

}
