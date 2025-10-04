/**
 * 
 */
package Inicio;

import Auxiliar.Alumno;
import Auxiliar.Grupo;
import Instituto.Instituto;

/**
 * @author Ramon
 *
 */
public class InicioInstituto {

	/**
	 * Clase Inicio
	 */
	public static void main(String[] args) {
		
	// Prueba con grupo	
		Grupo g1 = new Grupo();
		g1.leeDatos();
		System.out.println(g1.toString());
		
		Grupo g2 = new Grupo("ESO",2,"B");
		
		// Parametros de Alumno
		Alumno al1 = new Alumno(1,"Perez","Ramon",g2);
		Alumno al2 = new Alumno(2,"Aguilar","Javier",g2);
		Alumno al3 = new Alumno(3,"Garcia","Coca",g2);

		
	Instituto i1 = new Instituto();
	
	i1.addAlumno(al1);
	i1.addAlumno(al2);
	i1.addAlumno(al3);
	
	// Metodo MuestraAlumno
	i1.muestraAlumnos();
	System.out.println("Numero de alumnos: " + i1.numAlumnos());
	
	// Metodo delAlumno
	i1.delAlumno(3);
	
	// Metodo muestraAlumno
	System.out.println("El alumno esta en la posicion " + i1.buscaAlumno(1));
	
	}

	

}
