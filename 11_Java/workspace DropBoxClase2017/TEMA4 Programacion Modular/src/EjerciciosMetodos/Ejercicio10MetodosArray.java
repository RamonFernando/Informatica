/**
 * 
 */
package EjerciciosMetodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio10MetodosArray {

	/**
	 * Utilizar el metodo meses dentro de un array
	 */
	public static void main(String[] args) {
		// 10.- Escribe un método que escriba en pantalla el nombre de un mes a
		// partir de su número. En caso
		// de que el número proporcionado no esté entre 1 y 12, deberá terminar
		// inmediatamente.

		Scanner sc = new Scanner(System.in);
		int mes;
		System.out.println("-------------------");
		System.out.println("-- Meses del año --");
		System.out.println("-------------------");
		System.out.println("Introduce un numero de mes: ");
		System.out.println("---------------------------");
		meses(mes = sc.nextInt());
		System.out.println("----------------------");
		System.out.println("-- Fin del Programa --");
		System.out.println("----------------------");

		sc.close();

	}
	
	static void meses(int mes){
		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre"};
		if (mes >= 1  && mes < 13) {
			System.out.println("El numero de mes " + mes + " es: " + meses[mes-1] + ".");
			
		}else {
			System.out.println("Error, mes incorrecto");
			
		}
		// System.out.println("----------------------");
		// System.out.println("-- Fin del Programa --");
	}
}
