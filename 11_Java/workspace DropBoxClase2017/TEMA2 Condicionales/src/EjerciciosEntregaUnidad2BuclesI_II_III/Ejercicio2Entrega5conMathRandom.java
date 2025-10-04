/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio2Entrega5conMathRandom {

	/**
	 * Ejercicio 5 Bucles
	 */
	public static void main(String[] args) {
		// 5.- Diseña un programa que invente un número aleatorio. A continuación pedirá al usuario que lo
		// adivine. Si el usuario falla, entonces el programa le dará otra oportunidad. Una vez que el usuario
		// adivina el número o falla tres veces, el programa termina.
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int secr=(int) (Math.random()*10+1);
		int j=1;
		System.out.println(" Adivina el numero aleatorio entre 1 y 10");
		System.out.println("	Tienes solo 3 oportunidades");
		System.out.println("**===============*****=================**");
		
		// num = (int)(Math.random()*4 + 1);
		System.out.println("Debug: " + secr);
		num = secr;
		
		for (int i = 1; i < 4; i++) {
			
			System.out.println("Oportunidad: " + "\"" + i+ "\"" + " de 3");
			num = sc.nextInt();
			
			if(num == secr){
				System.out.println("    Has acertado!");
				break;
			}
			
		}
		if(num != secr){
			System.out.println("    Has fallado!");
		}
		
		
		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("  Fin del programa");
		
		
		sc.close();
	}

}
