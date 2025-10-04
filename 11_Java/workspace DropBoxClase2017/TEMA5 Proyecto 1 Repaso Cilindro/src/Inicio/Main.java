/**
 * 
 */
package Inicio;

import java.util.Scanner;

import Geometria.Cilindro;

/**
 * @author Ramon
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// La variable PI deberá ser estática y constante (no vale usar
		// Math.PI).
		// El método toString ( ) deberá devolver una cadena con el valor de los
		// atributos del cilindro.
		// En el método main:
		// • Se pedirá al usuario los datos del primer cilindro y se creará un
		// objeto del tipo Cilindro usando el constructor por defecto.
		// • Se mostrará el área y el volumen de ese cilindro.
		// • Se pedirá al usuario los datos del segundo cilindro y se creará un
		// objeto del tipo Cilindro usando el constructor con parámetros.
		// • Se mostrará el área y el volumen de ese cilindro.
		// • Por último se mostrará un mensaje al
		// usuario con los datos del segundo cilindro (altura y radio) usando el
		// método toString ( )
	}

	static Scanner sc = new Scanner(System.in);

	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {

		Cilindro c1 = new Cilindro(10, 4);
		System.out.println("Parte 1");
		System.out.println("Datos del Cilindro 1");
		System.out.println("El area del cilinbdro es " + c1.getArea());
		System.out.println("El volumen del cilindro es " + c1.getVolumen());
		System.out.println("------------------------------------");
		System.out.println("Parte 2");
		Cilindro c2 = new Cilindro();
		c2.leeDatos();
		System.out.println("Datos del Cilindro 2");
		// c2.setAltura(20);
		// c2.setRadio(10);
		System.out.println(c2.toString());
		// System.out.println("El area es " + c2.getArea());
		// System.out.println("El volumen es " + c2.getVolumen());
		System.out.printf("Area : %.3f", c2.getArea());
		System.out.println();
		System.out.printf("Volumen: %.3f", c2.getVolumen());

	}

}
