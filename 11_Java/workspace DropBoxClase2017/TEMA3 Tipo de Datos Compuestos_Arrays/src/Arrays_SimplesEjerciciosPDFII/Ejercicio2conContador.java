/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

/**
 * @author Ramon
 *
 */
public class Ejercicio2conContador {

	/**
	 * @PDF-Ejercicio de Arrays II 2/17 Descripcion: Búsqueda en Arrays
	 *                desordenados 1-4
	 */
	public static void main(String[] args) {

		// 2.- Crea una aplicación que vaya leyendo y guardando en un array las
		// estaturas de 10 personas. A continuación, recorrerá el array y nos
		// informará de si alguna de estas estaturas es mayor de 1'90 m.

		float estaturas[] = { 1.80F, 1.90F, 1.75F, 1.70F, 1.92F, 1.95F, 1.68F,
				1.86F, 1.80F, 1.72F };

		// Declaracion de variables.
		int cantidad = 0;

		System.out.println("Estaturas de 10 personas.");
		System.out.println("*=*=*=**=*=*=*=*=*=*=*=*=*");
		for (int i = 0; i < estaturas.length; i++) {

			if (estaturas[i] > 1.90) {

				cantidad++;
				System.out
						.println("\nEn la posicion "
								+ i
								+ " hay una persona con mas de \"1.90\" cm de estatura.");
				System.out.println("\"" + estaturas[i] + "cm\"");
				System.out
						.println("La cantidad de personas con mas de \"1.90 cm\" es/son: "
								+ cantidad);

			}

		}
		System.out.println("\nFin del programa.");
		System.out.println("*=*=*=*=*=*=*=*=*");
	}

}
