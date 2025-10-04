/**
 * 
 */
package Condicionales2;

/**
 * @author Ramon
 *
 */
public class Ejercicio16 {

	/**
	 * PDF- Ejercicio Bucles II 16/22
	 */
	public static void main(String[] args) {
		// 16.- Crea un programa que muestre las diez primeras potencias del
		// número 2 (o sea, 2, 4, 8, 16, etc.).
		
		System.out.println("Potencias de 2");
		System.out.println("*=*=*=*=*=*=*=*");
		
		int num=2;
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i + "º Potencia: " + num);
			num=num*2;
			
		}
		System.out.println("*=*=*=*=*=*=*=*");
		System.out.println("Fin del pograma");
	}

}
