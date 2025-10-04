package RepasoExamenRecuperacionU2;

public class Ejercicio14Bidimensional {

	public Ejercicio14Bidimensional() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 14.- Esta tabla muestra los nombres y precios de cuatro artículos de
		// unos grandes almacenes:
		// Guarda la información en un array llamado precios. Después, muestra
		// esta información en pantalla y calcula el precio total de los cuatro
		// artículos.

		String precios[][] = { { "Tablet Samsung", "1520" },
				{ "Móvil Sony", "15" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		System.out.println("Articulos");
		System.out.println("========================");
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i][0] + "\t" + precios[i][1]);

		}
		double total = 0;
		for (int i = 0; i < precios.length; i++) {
			total = total + Double.parseDouble(precios[i][1]);

		}
		System.out.println("Total: " + total + "€");

		// 15.- Añade al programa anterior otro bucle que recorra el array y
		// encuentre el menor y el mayor precio.
		int posMin = 0;
		int posMax = 0;
		int min = 0;
		int max = 0;
		float precio = 0;

		for (int i = 0; i < precios.length; i++) {
			precio = Float.parseFloat(precios[i][1]);
			min = Integer.parseInt(precios[posMin][1]);
			max = Integer.parseInt(precios[posMax][1]);
			if (min > precio) {
				posMin = i;
			}
			if (max < precio) {
				posMax = i;
			}

		}
		System.out.println("Precio Minimo: " + precios[posMin][1]+ " posicion: " + posMin);
		System.out.println("Precios Maximo: " + precios[posMax][1] + " posicion: " + posMax);
	}

}
