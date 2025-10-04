package RepsoRecuperacion2doTrimestre;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {

	public Ejercicio12() {
		// TODO Auto-generated constructor stub
	}

	private static int numeros[] = new int[5];
	private static int random = (int) (Math.random()*10);

	public static void main(String[] args) {
		// 12.- Desarrolla modularmente (usando tres métodos, además de main( ))
		// un programa que solicite
		// por consola una lista de números enteros, los ordene y los muestre en
		// pantalla.

		metodopedir();
		metodoOrdenar();
		metodoMsotrar();

	}

	private static void metodopedir() {
		Scanner entrada = new Scanner(System.in);
		

		System.out.println("Introduzca por consola 5 numeros");

		for (int i = 0; i < numeros.length; i++) {
			random = (int) (Math.random()*100);
			System.out.println((i+1) + "º Numero");
			System.out.println(numeros[i] = random);
		}

		entrada.close();
	}

	private static void metodoOrdenar() {
		// Arrays.sort(numeros);
		int posMin = 0;
		int aux = 0;

		for (int i = 0; i < numeros.length; i++) {
			posMin = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}
			aux = numeros[posMin];
			numeros[posMin] = numeros[i];
			numeros[i] = aux;

		}

	}

	private static void metodoMsotrar() {
		
		System.out.println(Arrays.toString(numeros));
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

}
