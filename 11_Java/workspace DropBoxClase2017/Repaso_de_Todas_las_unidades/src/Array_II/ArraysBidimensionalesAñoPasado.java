package Array_II;
/**
 * 
 * @author Ramón
 *
 */
import java.util.Scanner;

public class ArraysBidimensionalesAñoPasado {

	public static void main(String[] args) {
		// Programa que lea el nombre y precio de tres articulos y los actualice
		// añadiendoles el 21% de IVA a todos. Finalmente mostrará una lista con
		// los nombres y precios actualizados de todos.
		Scanner entrada = new Scanner(System.in);
		String[][] precios = new String[3][2];
		float precioArticulo;
		
		for (int i = 0; i < precios.length; i++) {
			System.out.println("Introduce Nombre: ");
			precios[i][0] = entrada.nextLine();
			System.out.println("Introduce precio: ");
			precios[i][1] = entrada.nextLine();
		}
		
		for (int j = 0; j < precios.length; j++) {
			precioArticulo = Float.parseFloat(precios[j][1]);

			precioArticulo = precioArticulo + precioArticulo * 21 / 100;
			precios[j][1] = String.valueOf(precioArticulo);
		}
		System.out.println("\n\nLista de precios....................");
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i][0] + "..." + precios[i][1] + " €");
		}
		entrada.close();
	}
	
}
