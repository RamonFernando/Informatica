/**
 * 
 */
package Arrays_SimplesEjercicios;

/**
 * @author Ramon
 *
 */
public class Ejercicio12 {

	/**
	 * @PDF-Ejercicios Arrays I 12/17
	 */
	public static void main(String[] args) {
		// 12.- Escribe una aplicación que cree un array de 100 posiciones
		// llamado matriculas y rellene todas las posiciones con el valor por
		// defecto "sinmatricula". Haz que después se muestren todos los valores
		// mediante un bucle for.

		// Declarar el array.
		String matriculas[] = new String[100];

		// Recorrerlo asignando a cada posicion el valor "sin matricula."

		for (int i = 0; i < matriculas.length; i++) {
			matriculas[i] = "sin matriculas";

		}

		// Recorrer para mostrar por pantalla todos los valores.
		System.out.println("Listado de matrículas.");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
		for (int i = 0; i < matriculas.length; i++) {
			System.out.println((i + 1) + "º -- " + matriculas[i]);
		}

	}

}
