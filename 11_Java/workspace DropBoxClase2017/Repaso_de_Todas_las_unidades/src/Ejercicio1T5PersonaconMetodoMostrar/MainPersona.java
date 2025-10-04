/**
 * 
 */
package Ejercicio1T5PersonaconMetodoMostrar;

/**
 * @author Ramon
 *
 */
public class MainPersona {

	/**
	 * Ejercicio con 2 Objetos y 2 constructores + el Metodo Mostrar()
	 */
	public static void main(String[] args) {
		// Atributos
		// Atributos Profesora: DNI,Nombre,Apellidos,Edad,Altura
		// Atributos Persona: DNI, Nombre, Apellidos, Edad
		// Crear 1 objeto para cada Clase(Persona y Profesora)
		// Con edad si es menor de 18 no puede pasar.
		// Crear metodo para mostrar los atributos.

		PersonaMetodoMostrar p1;
		p1 = new PersonaMetodoMostrar("Y1059197S", "Ramon", "Perez", 28);
		p1.dni = "Y1059197S";
		p1.nombre = "Ramon";
		p1.apellidos = "Perez";
		p1.edad = 28;

		Profesora p2;
		p2 = new Profesora("35253738T", "Laura", "Rodriguez", 35, 1.73);
		p2.dni = "35253738T";
		p2.nombre = "Laura";
		p2.apellidos = "Rodriguez";
		p2.edad = 35;
		p2.altura = 1.73;
		System.out.println("---------------------------------");
		if (p1.edad >= 18) {
			System.out.println("Acceso Autorizado!");
		} else {
			System.out.println("Acceso Denegado!");
		}
		System.out.println("---------------------------------");
		System.out.println("El alumno: " + p1.nombre
				+ " tiene los siguientes datos: ");
		p1.mostrar();
		System.out.println("---------------------------------");
		System.out.println("La Profesora " + p2.nombre
				+ " tiene los siguientes datos: ");
		p2.mostrar();
		System.out.println("---------------------------------");
		System.out.println("-- Fin del Programa --");
	}

}
