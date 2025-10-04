package RepsoRecuperacion2doTrimestre;

import java.util.Scanner;

public class Ejercicio9 {

	static int añoBiciesto;
	static boolean eof;
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// 9.- Crea un método que tome como parámetro un entero representando un
		// año, y devuelva true o false indicando si es bisiesto o no.

		biciesto(añoBiciesto);

		System.out.println("Introduzca el año para saber si es biciesto o no");
		añoBiciesto = entrada.nextInt();

		if (biciesto(añoBiciesto)) {
			System.out.println("Es biciesto el año " + añoBiciesto + " si ");
		} else {
			System.out.println("Es biciesto el año " + añoBiciesto + " no ");
		}

	}

	private static boolean biciesto(int añoBiciesto) {
		// Formula (num % 4 == 0) && (num % 100 != 0 || num % 400 == 0)

		if ((añoBiciesto % 4 == 0) && (añoBiciesto % 100 != 0)
				|| (añoBiciesto % 400 == 0)) {

			return true;
		} else {

			return false;
		}

	}

}
