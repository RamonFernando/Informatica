public class Main {
	/**
	 * @author Ramon
	 */

	/*
	 * Clase Main para realizar pruebas de entrada y salida de datos
	 */
	public static void main(String[] args) {
		// Metodo Main

		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("*=* ELECTRODOMESTICOS *=*");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");

		// Informacion de Motores
		Motor m1 = new Motor("BMW", "V10");
		Motor m2 = new Motor("Samsung", "V12");
		Motor m3 = new Motor("General Electric", "V12");
		System.out.println("*=*= Metodo Agregar *=*=*");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");

		// Informacion de Lavadoras
		Lavadoras l1 = new Lavadoras(1, m1, "BMW", 130);
		Lavadoras l2 = new Lavadoras(2, m2, "Samsung", 250);
		Lavadoras l3 = new Lavadoras(3, m1, "Siemens", 410);
		Lavadoras l4 = new Lavadoras(4, m3, "LG", 399);

		// System.out.println(l1.toString());
		// System.out.println(l2.toString());
		// System.out.println(l3.toString());
		// System.out.println(l4.toString());

		Lavadoras l5 = new Lavadoras(5, m2, "Siemens", 300);
		Taller t1 = new Taller();
		t1.listaLavadoras();

		// Metodo Agregar
		// Agregamos las lavadoras a la lista
		t1.addLavadora(l1);
		t1.addLavadora(l2);
		t1.addLavadora(l3);
		t1.addLavadora(l4);
		t1.addLavadora(l5);
		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("*=* Lista de Articulos *=");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		t1.listaLavadoras();

		// Metodo buscar
		// Con dos formas distintas de mostrarlo, una directamente por el
		// toString y otra por el syso del Main indicando tambien la posicion
		// del Array
		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("*=*=* Metodo Buscar *=*=*");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		t1.buscaLavadora(4);
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("Su articulo esta en la posicion: "
				+ t1.buscaLavadora(3) + " de Lavadoras");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		// t1.buscaLavadora(5);
		System.out.println("Su articulo esta en la posicion: "
				+ t1.buscaLavadora(5) + " de Lavadoras");

		// Metodo borrar
		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("*=*=* Metodo Borrar *=*=*");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		t1.borrarLavadora(5);
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		t1.borrarLavadora(1);
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		t1.listaLavadoras();

		// Agregamos de nuevo todos los articulos a la lista
		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("*=*=* Metodo Agregar *=*=");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		t1.addLavadora(l1);
		t1.addLavadora(l5);
		
		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("*=* Lista de Articulos *=");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		t1.listaLavadoras();


		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("*=* Fin del Programa *=*=");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("*=* Alumno: Ramon FPA *=*");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
	}

}
