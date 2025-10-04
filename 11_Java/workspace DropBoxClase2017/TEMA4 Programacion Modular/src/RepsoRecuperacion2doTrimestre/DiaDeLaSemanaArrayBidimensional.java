package RepsoRecuperacion2doTrimestre;

import java.util.Scanner;

public class DiaDeLaSemanaArrayBidimensional {

	private static String[] diaSemana = { "Lunes", "Martes", "Miercoles",
			"Jueves", "Viernes", "Sabado", "Domingo" };
	private static int[] numeroSemana = { 0, 1, 2, 3, 4, 5, 6 };
	

	public DiaDeLaSemanaArrayBidimensional() {

	}

	public static void main(String[] args) {

		
		mostrarDia(pedirDia());
	}

	private static void mostrarDia(int v1) {
		v1 = v1-1;
		System.out.println("El dia de la semana " + (v1 + 1) + " es el "
				+ diaSemana[v1] + " y esta en la posicion " + numeroSemana[v1] + " del array.");

	}

	private static int pedirDia() {
		int dia = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el dia de la semana que quieras saber");
		dia = entrada.nextInt();

		while (dia > 7 || dia < 1) {
			System.out.println("Parametro incorrecto");
			System.out.println("Introduzca otra vez el numero");
			dia = entrada.nextInt();
		}
		return dia;

	}

}
