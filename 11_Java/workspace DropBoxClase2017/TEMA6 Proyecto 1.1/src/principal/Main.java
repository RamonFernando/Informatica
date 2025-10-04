/**
 * @author Ramon
 *
 */
package principal;

public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente("62277217J", "López", "Lucía", "7281-1212-2332-9922");
		c.mostrar();

		Empleado e = new Empleado("61235726", "Sánchez", "Carlos", "Jefe");
		e.mostrar();

		Persona p;
		p = new Cliente("12332312322K", "Pepito", "Perez", "1236-1232-1983-2721");
		p.mostrar();

		p = new Empleado("12332312334K", "Peter", "Paez", "Encargado");
		p.mostrar();

	}

}
