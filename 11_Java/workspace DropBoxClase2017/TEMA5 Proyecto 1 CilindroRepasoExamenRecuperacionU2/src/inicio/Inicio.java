package inicio;

import geometria.Cilindro;

import java.util.Scanner;

public class Inicio {

	public Inicio() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("Introduzca la altura del cilindro");
		int altura = entrada.nextInt();
		System.out.println("Introduzca el radio del cilindro");
		int radio = entrada.nextInt();
		System.out.println("- - - - - - - - - - - ");
		Cilindro c1 = new Cilindro(altura, radio);
		System.out.println("Datos: Cilindro 1" + c1.toString());
		System.out.println("Area: " + c1.getArea());
		System.out.printf("Volumen %.3f", c1.getVolumen());
		System.out.println();
		System.out.println("- - - - - - - - - - - ");
		Cilindro c2 = new Cilindro(5, 2);
		System.out.println("Datos: Cilindro 2 " + c2.toString());
		System.out.println("Area " + c2.getArea());
		System.out.println("Volumen " + c2.getVolumen());

	}

}
