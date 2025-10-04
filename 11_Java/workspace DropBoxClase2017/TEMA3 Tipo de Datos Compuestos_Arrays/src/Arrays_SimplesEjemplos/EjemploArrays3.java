/**
 * 
 */
package Arrays_SimplesEjemplos;

/**
 * @author Ramon
 *
 */
public class EjemploArrays3 {

	/**
	 * PDF-Arrays
	 */
	public static void main(String[] args) {
		// Crea un array con los nombres de los meses del año.
		// Despues, muestra todos los valores usando un bucle while.

		String meses[] = new String[12];

		meses[0] = "Enero";
		meses[1] = "Febrero";
		meses[2] = "Marzo";
		meses[3] = "Abril";
		meses[4] = "Mayo";
		meses[5] = "Junio";
		meses[6] = "Julio";
		meses[7] = "Agosto";
		meses[8] = "Septiembre";
		meses[9] = "Octubre";
		meses[10] = "noviembre";
		meses[11] = "Diciembre";
		
		int i=0;
		int num= 1;
		while(i < meses.length){
			System.out.println("Mes " + num + " = " + meses[i]);
			i++;
			num++;
		}
		
		
		// int num=1;
		// for (int i = 0; i < meses.length; i++) {
		// System.out.println("Mes " + num + " = " + meses[i]);
		// num++;
		// }

	}

}
