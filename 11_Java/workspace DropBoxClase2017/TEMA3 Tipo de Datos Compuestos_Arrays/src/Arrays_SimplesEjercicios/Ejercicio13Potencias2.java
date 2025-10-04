/**
 * 
 */
package Arrays_SimplesEjercicios;

/**
 * @author Ramon
 *
 */
public class Ejercicio13Potencias2 {

	/**
	 * @PDF- Ejercicios Arrays I 13/17 Descripcion: Potencias Math.pow con While.
	 */
	public static void main(String[] args) {
		// 13.- Crea un programa que rellene un array llamado potencias con las
		// primeras 20 potencias de 2. Haz que después se muestren todos los
		// valores mediante un bucle while.

		int potencias[] = new int[21];
		
		
		System.out.println("Potencias del numero 2");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
		
		int num;
		for (int i = 0; i < potencias.length; i++) {
			num = (int) Math.pow(2, i);
			potencias[i] = num;
		}
		
		
		int i = 1;
		while (i < 21) {

			System.out.println(i  + "º posicion: " + potencias[i]);
			i++;
		}

	}

}
