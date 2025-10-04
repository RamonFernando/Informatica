/**
 * 
 */
package Arrays_SimplesEjemplos;

/**
 * @author horabaixa
 *
 */
public class Ejemplo22ArrayBidimensionales {

	/**
	 * Arrays Bidimensionales
	 */
	public static void main(String[] args) {
		// Declarar un array que contendra una tabla con nombres y edades de
		// cuatro personas.

		String datosAlumnos[][] = { 
				{ "Teo Waelder", "20" }, 
				{ "Gustavo Baquerizo", "20" }, 
				{ "Patryk Bojar", "18" },
				{ "Matias Beraldo", "20" } };

		// Mostramos los datos
		for (int i = 0; i < datosAlumnos.length; i++) {
			System.out.println(datosAlumnos[i][0] + " " 
					  + "\"" + datosAlumnos[i][1] + "\" años.");
		}
	}

}
