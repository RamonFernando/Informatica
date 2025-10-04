/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

public class Main {

	/**
	 * @param Ramon
	 */
	public static void main(String[] args) {
		// Ejercicio
		//
		// 1. Desarrollar una clase Coche (y una clase Main para utilizarla).
		// 1. Atributos: marca, modelo, color, matricula, precio y descuento.
		// 2. Métodos: arrancar, detenerse, acelerar, frenar, verPrecio
		// (devuelve un valor a partir del precio y el descuento).
		// 2. Desde la clase Main crear un par de objetos de la clase Coche.
		// Asignar un valor a la variable descuento de uno de ellos y comprobar
		// que ese valor se ha cambiado en todos los demás.
		// 3. Comprobar que se puede acceder a la variable descuento usando
		// el nombre de la clase en lugar del nombre de una instancia:
		// Coche.descuento.
		Scanner sc = new Scanner(System.in);
		String metodo = "";

		System.out.println("Ejercicio de Metodos");
		System.out.println("--------------------");
		
		Coche c1 = new Coche("Audi","A4","5879 FDS","Negro",15,50);
		c1.descuento = 15.50;
		
		
		c1.Arrancar();
		c1.Detenerse();
		c1.Frenar();
		

		sc.close();

	}

}
