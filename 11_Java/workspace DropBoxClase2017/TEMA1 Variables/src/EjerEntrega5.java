import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ramon
 *
 */
public class EjerEntrega5 {

	/**
	 * Ejercicio5
	 */
	public static void main(String[] args) {
		// Crea un programa que pida el nombre de un producto en venta, su
		// precio y el descuento que
		// se le debe hacer. Mostrará todos los datos junto al precio rebajado.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca el nombre de un producto: ");
		String nombre = entrada.nextLine();

		System.out.println("Introduzca precio: ");
		float precio = entrada.nextFloat();

		System.out.println("Que descuento desea hacer: ");
		

		float porcentaje = entrada.nextFloat();

		

		porcentaje = precio - ((precio * porcentaje) / 100F);

		System.out.println("Datos del producto" + "\n==================");
		System.out.println("Nombre: " + nombre + "\nPrecio " + precio + "€" + "\nDescuento " + porcentaje + "€");
		

		entrada.close();
	}

}
