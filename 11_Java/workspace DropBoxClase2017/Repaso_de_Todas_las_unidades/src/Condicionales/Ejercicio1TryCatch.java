package Condicionales;
import java.util.InputMismatchException;
/**
 *  @author Ramon
 */
import java.util.*;
/**
 * 
 * PDF-Estructura de condicionales
 *
 */
 
public class Ejercicio1TryCatch {
	static double temp1;
	public static void main(String[] args) {
		// Crea un programa que pida la temperatura de un reactor nuclear. Si
		// ésta supera los 120ºC, se mostrará en pantalla el mensaje:
		// "TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS!
		Scanner scan = new Scanner(System.in);
		try
		{
			System.out.println("Introduzca temperatura: ");
			System.out.println("Introduzca -1 para finalizar.");
			float temp1 = scan.nextFloat();
			while(temp1 != -1){
				if(temp1 > 120){
					System.out.println("Temperatura del REACTOR CRITICA! " + temp1 + " Corred Insensatos!");
					
				}else{
					System.out.println("Temperatura del reactor correcta: " + temp1);
				}
				
				System.out.println("Introduzca temperatura: ");
				temp1 = scan.nextFloat();
			}
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Error de formato.");
			System.out.println(ex.toString());
			temp1 = scan.nextFloat();
		}
		catch(Exception ex)
		{
			System.out.println("Parametro incorrecto, por favor introduzca bien el numero.");
			System.out.println(ex.toString()); // Esto es para ver el tipo de dato de exception(Tipo de Clase).
		}
		scan.close();
	}
}
