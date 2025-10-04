/**
 * 
 */
package EjemplosMetodos;



/**
 * @author Ramon
 *
 */
public class EjemploParametros6 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int temperaturas[] = {20,15,18,21,12,10};
		float num = 27.3F;
		System.out.println("El area de un cuadrado es: " + areaCuadrado(num) + "m².");
		System.out.println("Array Ordenado");
		System.out.println("==============");
		ordenar(temperaturas);
		
	}

	static float areaCuadrado(float lado) {
		float resultado = lado * lado;
		return resultado;
	}

	static void ordenar(int valores[]) {

		int aux;
		int posMin;
		for (int i = 0; i < valores.length; i++) {
			posMin = i;
			for (int j = i + 1; j < valores.length; j++) {
				if (valores[j] < valores[posMin]) {
					posMin = j;
				}
				aux = valores[i];
				valores[i] = valores[posMin];
				valores[posMin] = aux;
			}
		}
		for (int k = 0; k < valores.length; k++) {
			System.out.print(valores[k] + " ");
		}
	}
}
