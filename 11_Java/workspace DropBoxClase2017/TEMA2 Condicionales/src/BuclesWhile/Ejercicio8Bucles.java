/**
 * 
 */
package BuclesWhile;

/**
 * @author Ramon
 *
 */
public class Ejercicio8Bucles {

	/**
	 * PDF-Ejercicio de Bucles 8/22
	 * Descripcion:
	 * Condicionales: Bucles Ejercicio 8 con while.
	 */
	public static void main(String[] args) {
		// Crea un programa que muestre todos los números impares menores de 200.
		
		int i=1;
		int num=0;
		System.out.println("Numeros impares menores de 200");
		System.out.println("==============================");
		while(i<200){
			num = num +1;
			System.out.println("   Posicion " + num + " --> " + i);
			i= i+2;
		}

	}

}
