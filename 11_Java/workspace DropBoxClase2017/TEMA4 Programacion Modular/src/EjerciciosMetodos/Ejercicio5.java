/**
 * 
 */
package EjerciciosMetodos;

/**
 * @author Ramon
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 4.- Desarrolla un método que tome un array de números enteros y lo
		// muestre ordenado
		// 5.- Modifica la actividad anterior para que el método
		// devuelva el array ordenado.

		int valores[] = { 10, 90, 2, 38, 47, 25, 14 };
		int valoresOrdenados[] = ordenar(valores);
		
		 
		 for (int i = 0; i < valoresOrdenados.length; i++) {
			 System.out.print(valoresOrdenados[i] + " ");
		}

	}

	static int[] ordenar(int valores[]) {
		// Declaracion de variables
		int posMin = 0;
		int aux = 0;

		for (int i = 0; i < valores.length; i++) {
			posMin = i;
			for (int j = i + 1; j < valores.length; j++) {
				if (valores[j] < valores[posMin]) {
					posMin = j;
				}
			}
			aux = valores[i];
			valores[i] = valores[posMin];
			valores[posMin] = aux;
		}

		

		return valores;
	}
}
