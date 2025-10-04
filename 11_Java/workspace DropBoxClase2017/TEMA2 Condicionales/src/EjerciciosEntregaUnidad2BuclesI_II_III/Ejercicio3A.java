/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio3A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//  3.- Queremos diseñar un programa que solicite un número al usuario
		// y le responda "Es impar" o
		// "No es impar". Utiliza para ello la notación ? en lugar de if
		// asignando a una variable de tipo String al
		// resultado y mostrando después esta variable.
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		int num1 = 2;
		
		System.out.println("Introduce un numero!");
		num = sc.nextInt();
		
		if(num%num1==0){
			System.out.println("Es par!");
		}else{
			System.out.println("Es impar!");
		}
		
		
		
		
		
		sc.close();
		
		
	}

}
