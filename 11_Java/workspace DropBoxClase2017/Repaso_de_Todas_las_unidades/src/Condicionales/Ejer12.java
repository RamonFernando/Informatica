/**
 * 
 */
package Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejer12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			int mes;
			System.out.println("Introduzca un numero de mes entre 1 y 4 ");
			mes = sc.nextInt();
			while (mes < 1 || mes > 4) {
				System.out
						.println("Mes incorrecto, vuelva a intentarlo, el numero debe de estar entre 1 y 4");
				mes = sc.nextInt();
			}
			if(mes == 1){
				System.out.println("Mes " + mes + " Enero");
			}
			else if(mes == 2){
				System.out.println("Mes " + mes + " Febrero");
			}
			else if(mes == 3){
				System.out.println("Mes " + mes + " Marzo");
			}
			else{
				System.out.println("Mes " + mes + " Abril");
			}
		} catch (Exception e) {
			System.out.println("Parametro incorrecto ");
			System.out.println("Tipo de Error: " + e.toString());
			System.out.println("Fin del Programa.");
		}

		sc.close();
	}

}
