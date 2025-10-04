package Ejemplos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {

		List<String> nombres = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			nombres.add(leerContacto());

		}

		System.out.println("Lista completa:");
		for (String nombre : nombres) {

			System.out.println(nombre);

		}

		System.out.println("Elemento en la posición 2:");
		System.out.println(nombres.get(2));

		System.out.println("Borramos el elemento 'b':");
		nombres.remove("b");

		System.out.println("Lista completa:");
		for (String nombre : nombres) {

			System.out.println(nombre);

		}

		System.out.println("Número de elementos en el ArrayList:");
		System.out.println(nombres.size());

		System.out.println("Borrar la lista:");
		nombres.clear();

		System.out.println("Lista completa:");
		for (String nombre : nombres) {

			System.out.println(nombre);

		}

	}

	private static String leerContacto() {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Nombre del contacto: ");
		String nombre = entrada.nextLine();

		return nombre;

	}
}