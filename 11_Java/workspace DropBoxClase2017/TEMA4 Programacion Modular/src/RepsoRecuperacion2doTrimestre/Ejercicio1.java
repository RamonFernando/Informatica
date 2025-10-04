package RepsoRecuperacion2doTrimestre;

import java.util.Scanner;

public class Ejercicio1 {

	public Ejercicio1() {
		// TODO Auto-generated constructor stub
	}

	static Scanner entrada = new Scanner(System.in);

	private static String nombre = "";
	private static int edad = 0;
	private static String saludos;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		metodoEdad();
		metodoSaludo(nombre, edad);
	}

	private static void metodoEdad() {
		// TODO Auto-generated method stub

		System.out.println("Introduzca su nombre");
		nombre = entrada.nextLine();
		System.out.println("Introduzca su edad");
		edad = entrada.nextInt();

	}

	private static String metodoSaludo(String nombre, int edad) {

		String saludos = "Hola " + nombre + ", no parece que tenga " + edad
				+ " años";
		System.out.println(saludos);
		return saludos;
	}
}
