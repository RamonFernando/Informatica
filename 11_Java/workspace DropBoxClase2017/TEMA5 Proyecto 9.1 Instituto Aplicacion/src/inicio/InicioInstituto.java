package inicio;

import java.util.Scanner;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class InicioInstituto {

	// Variable global que esta fuera del metodo main para que cualquier clase
	// pueda acceder a ella.
	private static Scanner sc = new Scanner(System.in);
	private static Instituto instituto = new Instituto();
	

	public static void main(String[] args) {
		menuPrincipal();
		
		

		// menuAlumnos();
		// menuGrupos();

	}

	// Todo metodo que este en Main debe ser static
	public static void menuPrincipal() {
		System.out.println("Menú Principal");
		System.out.println("*=*=*=*=*=*=*=*");
		System.out.println("1. Resumen");
		System.out.println("2. Alumnos");
		System.out.println("3. Grupos");
		System.out.println("4. Salir");

		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			menuPrincipalResumen();
			break;
		case 2:
			menuAlumnos();
			break;
		case 3:
			menuGrupos();
		case 4:
			System.out.println("Fin del Programa");
			System.out.println("*=*=*=*=*=*=*=*=*");
			System.exit(0);
		default:
			System.out.println("Error de entrada\n");
			menuPrincipal();
		}

	}

	public static void menuAlumnos() {
		System.out.println("Menú Alumnos");
		System.out.println("*=*=*=*=*==*");
		System.out.println("1. Listar Alumnos");
		System.out.println("2. Añadir");
		System.out.println("3. Eliminar");
		System.out.println("4. Buscar");
		System.out.println("5. Atras");

		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			Alumno a1 = new Alumno();
			a1.leeDatos();
			a1.toString();
			break;
		case 2:
			
				
			
			break;
		case 3:
			System.out.println("Seguro que desea eliminar al alumno " );
			System.out.println("Opcion 1.(Si) 2.(No)");
			int opc = 0;
			
			if (opc == 1) {
				
				System.out.println("Que alumno desea eliminar");
				int opc1 = sc.nextInt();
				
				
				System.out.println("Se ha eliminado al alumno ");
				
			}if (opc == 2) {
				System.out.println("No se ha realizado la accion de eliminar el alumno ");
			} 
		case 4:
			System.out.println("indica el numero de expediente del alumno ");
			int numExp = sc.nextInt();
			
		case 5:
			menuPrincipal();
			break;
		default:
			System.out.println("Error de entrada\n");
			menuPrincipal();
		}

	}

	public static void menuGrupos() {
		System.out.println("Menú Grupos");
		System.out.println("*=*=*=*=*==*");
		System.out.println("1. Listar Grupos");
		System.out.println("2. Mostrar alumnos por grupo");
		System.out.println("3. Añadir");
		System.out.println("4. Eliminar");
		System.out.println("5. Atras");
	}

	// Muestra el numero de alumnos y el numero de grupos.
	public static void menuPrincipalResumen() {
		System.out.println("Resumen del Instituto");
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("Alumnos: " + instituto.numAlumnos());
		System.out.println("Grupos: " + instituto.numGrupos());

	}
}
