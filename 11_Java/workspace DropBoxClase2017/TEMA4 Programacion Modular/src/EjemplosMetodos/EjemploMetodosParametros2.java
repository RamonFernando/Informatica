/**
 * 
 */
package EjemplosMetodos;

import java.util.Scanner;



/**
 * @author horabaixa
 *
 */
public class EjemploMetodosParametros2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tabla de Multiplicar");
		System.out.println("====================");
		int numero = 0;
		if (numero == 0) {
			System.out.println("Introduce un numero: ");
			numero = sc.nextInt();
		}
		tablaMultiplicar(numero);
		System.out.println("\n");
		System.out.println("Tablas de Multiplicar del 1 al 10");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		tablaMultiplicar1();
		System.out.println("\n==================");
		System.out.println("Fin del Programa");
		sc.close();
	}
	static void tablaMultiplicar(int numero){
		for (int i = 1; i < 11; i++) {
			
			System.out.println(numero + " x " + i + " = " + (i*numero));
			
		}
	}
	static void tablaMultiplicar1(){
		for (int i = 1; i < 11; i++) {
			System.out.println();
			System.out.println("Tabla del " + i);
			System.out.println("============");
			for (int j = 1; j < 11; j++) {
				
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
	}
}
