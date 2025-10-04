/**
 * 
 */
package Arrays_I;

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

		String matriculas[] = new String[100];
		
		System.out.println("Matriculas");
		System.out.println("----------");
		for (int i = 0; i < matriculas.length; i++) {
			if (matriculas[i] == null) {
				System.out.println((i+1) + " \"Sin matricula\"");
			}else {
				System.out.println(matriculas[i]);
			}
		}
	}

}
