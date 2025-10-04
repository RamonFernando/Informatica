/**
 * 
 */
package Arrays_SimplesEjemplos;

/**
 * @author Ramon
 *
 */
public class Ejemplo19 {

	/**
	 * Ejemplo ordenar array.
	 */
	public static void main(String[] args) {
		// Ordenar array.
		double precios[]={10.4,5.6,12,15,3.1,5};
		double aux;
		int posMin;
		
		for (int i = 0; i < precios.length - 1; i++) {
			System.out.println("--> " + (i+1) + "º vez" + " <-- ");
			System.out.println("*=*=*=*=*=*=*");
			posMin = i;
			for (int j = i+1; j < precios.length; j++) {
				if (precios[j]<precios[posMin]) {
					posMin = j;
				}
			}
			aux = precios[i];
			precios[i] = precios[posMin];
			precios[posMin] = aux;
			
			for (int k = 0; k < precios.length; k++) {
				System.out.print(precios[k] + " ");
			}
			System.out.println("\n ");
			
		}
	}

}
