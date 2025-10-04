/**
 * 
 */
package Arrays_SimplesEjercicios;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio4 {

	/**
	 * @PDF-Ejercicios Arrays I 4/17
	 */
	public static void main(String[] args) {
		// 4.- Crea un array llamado companyeros con 4 posiciones y ve asignando
		// a cada una de ellas el nombre de uno de los cuatro compañeros más
		// cercanos a tu sitio. Haz que después se muestren todos los valores
		// mediante un bucle for.
		
		Scanner sc = new Scanner(System.in);
		
		String companyeros[] = new String[4];
		
		System.out.println("Array de Nombres");
		System.out.println("----------------");
		System.out.println("Introduce 4 nombres");
		
		for (int i = 0; i < companyeros.length; i++) {
			System.out.println((i+1) + "º Nombre: ");
			companyeros[i] = sc.nextLine();
		}
		System.out.println("\n---------------------  ");
		
		for (int i = 0; i < companyeros.length; i++) {
			System.out.println((i+1) + " " + companyeros[i]);
		}
		System.out.println("---------------------");
		System.out.println("  Fin del Programa");
		sc.close();
	}

}
