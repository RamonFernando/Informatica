package Condicionales;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ramon
 *
 */
public class Ejer14y15 {

	/**
	 * PDF-
	 */
	public static void main(String[] args) {
		// 14.- Haz un programa que pida un número de mes entre 1 y 12. A
		// continuación devolverá el nombre del mes correspondiente.
		// 15.- Crea un programa que pida un número de mes entre 1 y 12. A
		// continuación devolverá el número de días de ese mes. Supón que no
		// existen años bisiestos.

		Scanner sc = new Scanner(System.in);

	try{
		int mes;

		System.out.println("Introduce numero de mes que este entre 1 y 12: ");
		System.out.println("**********************************************");
		mes = sc.nextInt();

		while (mes < 0 || mes > 12) {
			System.out.println("Introduzca mes valido.");
			mes=sc.nextInt();
		}

		switch (mes) {

		case 1:

			System.out.println("Mes 1:  Enero y tiene 30 dias");
			System.out.println("*****************************");
			break;
		case 2:

			System.out.println("Mes 2: Febrero y tiene 28 dias");
			System.out.println("******************************");
			break;
		case 3:

			System.out.println("Mes 3: Marzo y tiene 3 dias");
			System.out.println("***************************");
			break;
		case 4:

			System.out.println("Mes 4: Abril y tiene 30 dias");
			System.out.println("****************************");
			break;
		case 5:

			System.out.println("Mes 5: Mayo y tiene 31 dias");
			System.out.println("***************************");
			break;
		case 6:

			System.out.println("Mes 6: Junio y tiene 30 dias");
			System.out.println("****************************");
			break;
		case 7:

			System.out.println("Mes 7: Julio y tiene 31 dias");
			System.out.println("****************************");
			break;
		case 8:

			System.out.println("Mes 8: Agosto y tiene 31 dias");
			System.out.println("*****************************");
			break;
		case 9:

			System.out.println("Mes 9: Septiembre y tiene 30 dias");
			System.out.println("*********************************");
			break;
		case 10:

			System.out.println("Mes 10: Octubrey tiene 31 dias");
			System.out.println("******************************");
			break;
		case 11:

			System.out.println("Mes 11: Noviembrey tiene 30 dias");
			System.out.println("********************************");
			break;
		case 12:

			System.out.println("Mes 12: Diciembrey tiene 31 dias");
			System.out.println("********************************");
			break;
		default:
			System.out.println("Numero de mes incorrecto.");

		}
		System.out.println("Fin del programa.");
	}
	catch(Exception e ){
		System.out.println("Parametro incorrecto");
		System.out.println("Error: " + e.toString());
		System.out.println("Fin del programa.");
	}
		sc.close();

	}

}
