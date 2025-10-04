package RepsoRecuperacion2doTrimestre;

import java.util.Scanner;

public class Ejercicio10 {

	public Ejercicio10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 10.- Escribe un método que escriba en pantalla el nombre de un mes a
		// partir de su número. En caso
		// de que el número proporcionado no esté entre 1 y 12, deberá terminar
		// inmediatamente.
		
		metodoPedirDato();
		

	}

	private static void metodoPedirDato() {
		Scanner entrada = new Scanner(System.in);
		int mes = 0;
		
		System.out.println("Introduzca el numero de mes");
		mes = entrada.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("Enero,Marzo,Mayo,Julio,Agosto,Octubre,Diciembre");
			break;
		case 2: 
			
			System.out.println("Abril, Junio,Septiembre , Noviembre");
			break;
		case 3:
			System.out.println("Febrero");
		break;
		default:
			System.out.println("Entrada no valida");
			break;
		}
		
		
	}

}
