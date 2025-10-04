package Switch;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Condicionales7 {

	/**
	 * Switch Ejemplo.
	 */
	public static void main(String[] args) {
		// Caso Ejemplo.

		Scanner entrada = new Scanner(System.in);
		System.out.println("Elige una opcion para el Archivo: ");
		System.out.println("=================================");

		System.out.println("(1) Crear ");
		System.out.println("(2) Renombrar");
		System.out.println("(3) Borrar");
		System.out.println("(4) salir");
		System.out.println(" ");
		int num = entrada.nextInt();
		switch (num) {
		case 1:
			System.out.println("Creando...");
			break;
		case 2:
			System.out.println("Renombrando...");
			break;
		case 3:
			System.out.println("Borrando...");
			break;

		case 4:
			System.out.println("Cerrando...");
			break;
		default:
			System.out.println("Opción incorrecta!");
		}

		entrada.close();
	}

}
