package RepsoRecuperacion2doTrimestre;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio11 {

	public static void main(String[] args) {
		// 11.- Crea un método que tome un array de Strings, y un String.
		// Devolverá la posición del String
		// dentro del array, ó -1 si no lo encuentra. Utiliza dos instrucciones
		// return.
		String[] planetas = { "Mercurio", "Venus", "Tierra", "Marte",
				"Júpiter", "Saturno", "Urano", "Neptuno", "Plutón" };

		System.out.println(metodoPosicion(planetas, "Tierra"));

	}

	private static int metodoPosicion(String[] planetas, String string ) {
		System.out.println(Arrays.toString(planetas));
		int posMin = -1;

		for (int i = 0; i < planetas.length; i++) {
			

			if (planetas[i].equals(string)) {
				posMin = i;
				System.out.println(planetas[posMin]);
				
			}
			
			
		}
		return posMin;

	}
}
