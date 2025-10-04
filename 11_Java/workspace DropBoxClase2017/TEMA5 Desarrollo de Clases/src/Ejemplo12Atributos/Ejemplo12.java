package Ejemplo12Atributos;



/**
 * En este ejemplo hacemos que un constructor llame a otro.
 * 
 * @author csogorb
 *
 */
public class Ejemplo12 {

	public static void main(String[] args) {

		Persona p1;
		p1 = new Persona("82911922H", "Jose Antonio", "Coca", 21);

		System.out.println("Nombre completo: " + p1.nombre + " " + p1.apellidos);

		if (p1.edad >= 18) {
			System.out.println("Puede entrar a la discoteca.");
		} else {
			System.out.println("No puede entrar a la discoteca.");
		}

		Persona p2 = new Persona();
		p2.dni = "3782363H";
		p2.nombre = "Gustavo";
		p2.apellidos = "Baquerizo";
		p2.edad = 21;

		System.out.println("Me llamo " + p2.nombre + " " + p2.apellidos + " y tengo " + p2.edad + " años.");

		// Utilizamos el método mostrar()
		System.out.println("\nDatos de p1:\n");
		p1.mostrar();

		System.out.println("Creamos una tercera persona");
		Persona p3 = new Persona("Carlos", "Sogorb");
		p3.mostrar();

	}

}