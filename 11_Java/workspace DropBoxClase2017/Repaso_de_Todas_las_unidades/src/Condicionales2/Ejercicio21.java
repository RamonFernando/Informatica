/**
 * 
 */
package Condicionales2;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 21.- Crea un programa que vaya pidiendo cinco números para mostrar
		// sus tablas de multiplicar. Si el número introducido es 1, el programa
		// escribirá el mensaje "¡No seas tonto!" y se volverá a formular la
		// pregunta.
		// Utiliza la instrucción continue.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tabla de multiplicar.");
		int num=0;
		
		for (int i = 1; i < 6; i++) {
			System.out.println("Introduce el " + i + "º numero");
			num = sc.nextInt();
			if(num == 1){
				i--;
				System.out.println("No seas tonto!");
				continue;
			}
			for (int j = 1; j < 11; j++) {
				System.out.println(num + " x " + j + " = " + (num*j));
			
			}
		}
		
		
		
		
		
		
		sc.close();

	}

}
