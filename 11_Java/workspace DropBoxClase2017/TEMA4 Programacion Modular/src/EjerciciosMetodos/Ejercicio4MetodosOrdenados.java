/**
 * 
 */
package EjerciciosMetodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio4MetodosOrdenados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 4.- Desarrolla un método que tome un array de números enteros y lo
		// muestre ordenado
		Scanner sc = new Scanner(System.in);
		
		
		// Declarar variable
		// int numero = 0;
		final int fin = -1;
		int posMin = 0;
		int aux = 0;
		
		System.out.println("Introduzca 10 numeros por pantalla");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		
		int valores[] = new int[10];
		
		for (int i = 1; i < valores.length; i++) {
			System.out.println("Numero " + i);
			valores[i] = sc.nextInt();
			if (valores[i] == fin) {
				break;
			}
		}
		for (int i = 0; i < valores.length; i++) {
			posMin = i;
			for (int j = i+1; j < valores.length; j++) {
				if (valores[j] < valores[posMin]) {
					posMin = j;
				}
			}
		aux = valores[i];
		valores[i] = valores[posMin];
		valores[posMin] = aux;
		
		
		}
		
		for (int k = 0; k < valores.length; k++) {
			System.out.print(valores[k] + " ");
		}
		
		sc.close();
		
	}
//	static void ordenar(){
//		
//	}
}
