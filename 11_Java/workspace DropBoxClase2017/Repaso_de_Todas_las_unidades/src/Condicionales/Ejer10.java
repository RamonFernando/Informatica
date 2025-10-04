/**
 * 
 */
package Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejer10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		try {
			double nota;
			System.out.println("Introduzca una nota entre 0 y 10");
			nota = sc.nextDouble();
			while (nota < 1 || nota > 10) {
				System.out
						.println("Numero incorrecto, introduzca una nota entre 1 y 10");
				nota = sc.nextDouble();
			}
			System.out.println("Calificacion");
			System.out.println("============");
			if (nota < 5) {
				System.out.println(nota + " Insuficiente");
			}
			else if(nota>= 5 && nota <6){
				System.out.println(nota + " Suficiente");
			}
			else if(nota>=5 && nota <=6){
				System.out.println(nota + " Bien");
			}
			else if(nota>=7 && nota <=8){
				System.out.println(nota + " Notable");
			}
			else if(nota>=9 && nota <=10){
				System.out.println(nota + " Sobresaliente");
			}
			System.out.println("=================");
		} catch (Exception e) {
			System.out.println("Parametro incorrecto ");
			System.out.println("Tipo de Error: " + e.toString());
			System.out.println("Fin del Programa.");
		}

		sc.close();
	}

}
