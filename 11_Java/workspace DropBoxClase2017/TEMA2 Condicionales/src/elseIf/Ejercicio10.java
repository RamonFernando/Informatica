package elseIf;
import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio10 {

	/**
	 * PDF-Ejercicio de Condicionales 10/22
	 * Descripcion:
	 * Condicionales Ejercicio con if/else.
	 */
	public static void main(String[] args) {
		// Diseña un programa que pida una nota entera entre 0 y 10 y la
		// convierta a la calificación correspondiente (Insuficiente,
		// Suficiente, Bien, Notable y Sobresaliente).
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entre 0 y 10" + "\n=================================");
		
		float nota = entrada.nextInt();
		
		if(nota >0 && nota < 3){
			System.out.println("Insuficiente");
		}
		else if(nota >=3 && nota <=5){
			System.out.println("\n=================================");
			System.out.println("Suficiente");
		}
		else if(nota >=6 && nota <= 7){
			System.out.println("\n=================================");
			System.out.println("Bien");
		}
		else if(nota>7 && nota <=8){
			System.out.println("\n=================================");
			System.out.println("Notable");
		}
		else if(nota>8 && nota <=10){
			
			System.out.println("\n=================================");
			System.out.println("Sobresaliente");
		}
		entrada.close();
	}

}
