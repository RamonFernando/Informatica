/**
 * 
 */
package Arrays_SimplesEjemplos;

/**
 * @author Ramon
 *
 */
public class Ejemplo21ArrayBidimensional {

	/**
	 * Ejemplo de un Array Bidimencional
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tablas o matriz de 4 filas y 3 columnas.
		double medidas[][] = {  { 8.5, 1020, 40 }, 
								{ 14.2, 1021, 35 }, 
								{ 11, 1022, 45 }, 
								{ 7, 1023, 50 } };
		// double medidas[][] = {{Fila 1 Columna 1,2,3},{Fila 1 Columna
		// 1,2,3},{Fila 1 Columna 1,2,3},{Fila 1 Columna 1,2,3};

		// Fila 0 columna 1,2,3
		medidas[0][0] = 8.5;
		medidas[0][1] = 1020;
		medidas[0][2] = 40;

		// Fila 1 columna 1,2,3
		medidas[1][0] = 14.2;
		medidas[1][1] = 1021;
		medidas[1][2] = 35;

		// Fila 2 columna 1,2,3
		medidas[2][0] = 11;
		medidas[2][1] = 1022;
		medidas[2][2] = 45;

		// Fila 3 columna 1,2,3
		medidas[3][0] = 7;
		medidas[3][1] = 1023;
		medidas[3][2] = 50;
		
		for (int i = 0; i < medidas.length; i++) {
			System.out.println(medidas[i][0] + " " + medidas[i][1] + " " + medidas[i][2]);
		}
	}

}
