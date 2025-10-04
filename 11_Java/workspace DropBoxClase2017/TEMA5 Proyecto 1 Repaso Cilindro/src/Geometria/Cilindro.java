/**
 * 
 */
package Geometria;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Cilindro {

	/**
	 * 
	 */

	private int altura;
	private int radio;
	private double PI = 3.141592;

	public Cilindro() {

	}

	public Cilindro(int Altura, int Radio) {
		this.altura = Altura;
		this.radio = Radio;
	}

	// Getters and Setters
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	// Metodos de acceso

	public double getArea() {
		double area;
		area = 2 * PI * radio * (altura + radio);

		return area;
	}

	public double getVolumen() {
		double volumen;
		volumen = PI * radio * radio * altura;
		return volumen;
	}

	public void leeDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los la altura");
		altura = sc.nextInt();
		System.out.println("Introduzca el radio");
		radio = sc.nextInt();

	}

	/**
	 * toString que muestra altura y radio del cilindro
	 */
	public String toString() {

		return "La altura del cilindro es " + altura + " y el Radio es "
				+ radio;
	}

	public void Mostrar() {
		System.out.println("Altura " + altura);
		System.out.println("Radio " + radio);

	}
}
