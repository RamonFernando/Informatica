package EjerciciosRecursivos;

import java.util.Scanner;

public class Ejercicio2_De_entero_a_Binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numero, exp, digito;
		double binario;

		do {
			System.out.print("Introduce un numero entero >= 0: ");
			numero = sc.nextInt();
		} while (numero < 0);

		exp = 0;
		binario = 0;
		while (numero != 0) {
			digito = numero % 2;
			binario = binario + digito * Math.pow(10, exp);
			exp++;
			numero = numero / 2;
		}
		System.out.printf("Binario: %.0f %n", binario);
	}
}
