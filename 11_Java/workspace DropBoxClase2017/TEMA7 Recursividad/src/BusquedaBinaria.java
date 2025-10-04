
public class BusquedaBinaria {

	public static void main(String[] args) {
		// Busqueda Binaria
		
		int[] edades = {20,25,27,31,50,54};
		int x = 1; // Valor que buscamos en el array
		// El numero x que vamos a buscar en el array edades
		System.out.println("Resultado: " + busqueda(edades, 50));
	}

	public static int busqueda(int[] valores, int x) {
		int inicio = 0;
		int fin = valores.length - 1;
		int medio = 0;

		while (inicio <= fin) {
			medio = (inicio + fin) / 2;

			if (x < valores[medio]) {
				fin = medio;
			} else if (x > valores[medio]) {
				inicio = medio + 1;
			} else {
				return medio;
			}
			System.out.println("inicio = " + inicio + "; fin = " + fin);
		}
		return -1;
	}

}
