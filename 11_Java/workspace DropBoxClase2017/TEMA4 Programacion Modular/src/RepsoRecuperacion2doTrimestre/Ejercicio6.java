package RepsoRecuperacion2doTrimestre;

import java.util.Scanner;

public class Ejercicio6 {

	public Ejercicio6() {
		// TODO Auto-generated constructor stub
	}
	static double decimal;
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		// 6.- Crea un método que tome un número decimal y devuelva su cuadrado.
		
		metodoPregunta();
		metodoCuadrado();
		
	}

	private static void metodoPregunta() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un numero decimal");
		decimal = entrada.nextDouble();
	}

	private static void metodoCuadrado() {
		double decimal1 = decimal*2;
		
		System.out.println("El cuadrado de " + decimal +  " es " + decimal1);
		
		
	}

}
