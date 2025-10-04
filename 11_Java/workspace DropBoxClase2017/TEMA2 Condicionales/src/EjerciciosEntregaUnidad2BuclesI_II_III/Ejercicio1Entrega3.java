/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio1Entrega3 {

	/**
	 * PDF-Ejercicios I Estructura de Condicionales
	 * Ejercicio 3 Entrega Operador Ternario
	 */
	public static void main(String[] args) {
		//  3.- Queremos diseñar un programa que solicite un número al usuario
		// y le responda "Es impar" o
		// "No es impar". Utiliza para ello la notación ? en lugar de if
		// asignando a una variable de tipo String al
		// resultado y mostrando después esta variable.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		
		System.out.println("Introduce un numero");
		num = sc.nextInt();
		
		String charter;
		charter = num%2==0 ? " Es par" : " Es impar";
		System.out.println("El numero " + num + charter);
		
		// if( num%2 == 0){
		//
		// System.out.println(num + " Es par");
		//
		// }else{
		// System.out.println(num + " Es impar");
		// }
		
		
		
		
		sc.close();


	}

}
