/**
 * 
 */
package EjerciciosMetodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio10Metodos {

	/**
	 * Ejercicios PDF-
	 * 
	 */
	public static void main(String[] args) {
		// 10.- Escribe un método que escriba en pantalla el nombre de un mes a
		// partir de su número. En caso
		// de que el número proporcionado no esté entre 1 y 12, deberá terminar
		// inmediatamente.
		Scanner sc = new Scanner(System.in);
		int num1=0;
		
		if (num1==0) {
			System.out.println("Escriba un numero de mes: ");
			System.out.println("-------------------------");
			num1= sc.nextInt();
			
			if (num1 < 1 || num1 > 12) {
				System.out.println("Error, mes incorrecto.");
				
			}
			switch(num1){
			case 1:
				System.out.println("El mes " + num1 + " es: Enero");
				break;
			case 2: 
				System.out.println("El mes " + num1 + " es: Febrero");
				break;
			case 3:
				System.out.println("El mes " + num1 + " es: Marzo");
				break;
			case 4: 
				System.out.println("El mes " + num1 + " es: Abril");
				break;
			case 5: 
				System.out.println("El mes " + num1 + " es: Mayo");
				break;
			case 6:
				System.out.println("El mes " + num1 + " es: Junio");
				break;
			case 7: 
				System.out.println("El mes " + num1 + " es: Julio");
				break;
			case 8:
				System.out.println("El mes " + num1 + " es: Agosto");
				break;
			case 9:
				System.out.println("El mes " + num1 + " es: Septiembre");
				break;
			case 10:
				System.out.println("El mes " + num1 + " es: Octubre");
				break;
			case 11:
				System.out.println("El mes " + num1 + " es: Noviembre");
				break;
			case 12:
				System.out.println("El mes " + num1 + " es: Diciembre");
				break;
			}
		}
		
		
		
		System.out.println("-------------------------");
		System.out.println("Fin del Programa");
		sc.close();
		
		
		
	}
	static int mes(int num){
		return num;
	}
	
}
