/**
 * 
 */
package Ejemplo1Persona;

/**
 * @author Ramon
 *
 */
public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Main para hacer pruebas

		Persona p1;
		p1 = new Persona("Y1059197S ", "Ramon ", "Perez ", 28);

		p1.dni = "Y1059197S";
		p1.nombre = "Ramon";
		p1.apellidos = "Perez";
		p1.edad = 28;

		System.out
				.println("Nombre completo: " + p1.nombre + " " + p1.apellidos);

		if (p1.edad >= 18) {
			System.out.println("Puedes entrar.");
		} else {
			System.out.println("No puedes entrar, eres menor de edad.");
		}
		Profesora p2;
		p2 = new Profesora();

		p2.dni = "4892217900T";
		p2.nombre = "Javiera";
		p2.apellidos = "Lemenz";
		p2.altura = 1.73;

		System.out.println("Profesora");
		System.out.println("----------");
		System.out.println("DNI: " + p2.dni + "\nNombre: " + p2.nombre
				+ "\nApellidos: " + p2.apellidos + "\nAltura: " + p2.altura);

	}

}
