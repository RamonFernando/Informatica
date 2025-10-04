package Unidad4;

import java.lang.reflect.Array;
import java.util.*;
import java.awt.*;

public class OrdenarDescendentVariable {

	// Variable global. Array no inicialitzat.
	private int[] llistaEnters = new int[10];
	Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {

		// En aplicar disseny descendent, ara cal declarar "lector" com a global

		OrdenarDescendentVariable programa = new OrdenarDescendentVariable();
		programa.inicio();
	}

	public void inicio() {
		llegirLlista();
		ordenarLlista();
		mostrarLlista();
	}

	private void mostrarLlista() {
		for (int i = 0; i < llistaEnters.length; i++) {
			System.out.println(llistaEnters[i]);
		}
		Arrays.toString(llistaEnters);
	}

	private void ordenarLlista() {
		Arrays.sort(llistaEnters);

	}

	// Mètode amb les instruccions per llegir la llista.
	// El primer valor sera la llargària
	public void llegirLlista() {
		System.out.println("Escriu una llista de valors enters i prem retorn.");
		System.out.println("El primer valor indica la mida de la seqüència.");
		llegirMida();
		llegirValors();
	}

	public void llegirMida() { // Metode que llegeix el primer valor
		// Lectura
		int mida = 0;
		// int index = 0;

		if (lector.hasNextInt()) {
			mida = lector.nextInt();
			
		} else {
			lector.next();
		}
		llistaEnters = new int[mida]; // Inicialitizació diferida de l’array
	}

	public void llegirValors() {
		int index = 0;
		while (index < llistaEnters.length) {
			if (lector.hasNextInt()) {
				llistaEnters[index] = lector.nextInt();
				index++;
				
				
			} else {
				lector.next();
			}
		}
		lector.nextLine();
	} // La resta de mètodes no canvien ...
}
