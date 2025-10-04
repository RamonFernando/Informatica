package Examen;

public class Ejercicio15 {

	public static void main(String[] args) {

		String[][] precios = { { "Tablet Samsung", "1120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		System.out.println("Artículos");
		System.out.println("=======================");
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i][0] + "\t" + precios[i][1]);
		}

		float total = 0;
		for (int i = 0; i < precios.length; i++) {
			total = total + Float.parseFloat(precios[i][1]);
		}

		System.out.println("\nTotal: " + total + " €.");

		int posMin = 0;
		int posMax = 0;
		float precio;
		float min;
		float max;
		for (int i = 0; i < precios.length; i++) {

			precio = Float.parseFloat(precios[i][1]);
			min = Float.parseFloat(precios[posMin][1]);
			max = Float.parseFloat(precios[posMax][1]);

			if (precio < min) {
				posMin = i;
			}

			if (precio > max) {
				posMax = i;
			}
		}

		System.out.println("Precio mínimo: " + precios[posMin][1]);
		System.out.println("Precio máximo: " + precios[posMax][1]);

	}

}
