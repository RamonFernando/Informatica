package RepsoRecuperacion2doTrimestre;

import java.util.Scanner;

public class Ejercicio3 {

	public Ejercicio3() {
		// TODO Auto-generated constructor stub
	}
	private static String nombre;
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 3.- Escribe un método que pida al usuario su nombre y devuelva la cadena introducida.
		
		metodoPreguntar();
		metodoNombre(nombre);
	}

	private static void metodoPreguntar() {
		System.out.println("Escriba su nombre ");
		nombre = entrada.nextLine();
		
		
	}

	private static String metodoNombre(String nombre) {
		
		System.out.println("Su nombre es " + nombre);
		return nombre;
		
		
	}

}
