/**
 * @author Ramon
 */
package instituto;

import auxiliar.Alumno;
import auxiliar.Grupo;

/**
 * La clase Instituto representa los datos de un Instituto, con sus alumnos y
 * grupos, así como las operaciones con ambos.
 * 
 * @author gabi
 *
 */
public class Instituto {

	// Atributos
	private final int MAX_ALUMNOS = 30;
	private final int MAX_GRUPOS = 20;
	private Alumno alumnos[] = new Alumno[MAX_ALUMNOS];
	private Grupo grupos[] = new Grupo[MAX_GRUPOS];

	// Constructores
	
	/**
	 * Añade el alumno que se le pasa como argumento al array alumnos[].
	 * 
	 * @param alu
	 *            Alumno que hay que dar de alta en el instituto.
	 */
	public void addAlumno(Alumno alu) {

		// Comprobamos que no haya un alumno con ese número de expediente.
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == alu.getNumExpediente()) {
				System.out.println("Número de expediente repetido.");
				return;
			}
		}

		// Comprobamos que el grupo exista.
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null && grupos[i].getNumGrupo() == alu.getNumGrupo()) {
				System.out.println("No existe el grupo. Operación cancelada.");
				return;
			}
		}

		// Añadimos al alumno.
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alu;
				break;
			}
		}

	}
	
	/**
	 * Elimina un alumno
	 * @param numExp Número de expediente del alumno
	 */

	public void delAlumno(int numExp) {

		int posicion = buscaAlumno(numExp);
		if (posicion != -1) {
			alumnos[posicion] = null;
		}

	}
	
	
	/**
	 * Muestra una lista con todos los alumnos
	 */

	public void muestraAlumnos() {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(alumnos[i].toString());
			}
		}
	}

	/**
	 * Devuelve el número de alumnos del instituto.
	 * 
	 * @return Número de alumnos del instituto.
	 */
	public int numAlumnos() {
		int suma = 0;

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				suma++;
			}
		}
		return suma;
	}

	/**
	 * Devuelve el número de grupos del instituto
	 * 
	 * @return número de grupos del instituto
	 * 
	 */
	
	
	public int numGrupos() {
		int suma = 0;
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null) {
				suma++;
			}
		}
		return suma;
	}

	/**
	 * Busca si un alumno está matriculado en el centro, y devuelve su posición
	 * en el array alumnos[].
	 * 
	 * @param numExp
	 *            Número de expediente del alumno.
	 * @return Posición en el array alumnos del alumno que hemos 
	 * 		   recibido como
	 *         parámetro, o -1 si no se encuentra.
	 */
	public int buscaAlumno(int numExp) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExp) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * Muestra los grupos
	 */
	
	public void muestraGrupos() {
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null) {
				System.out.println(grupos[i].toString());
			}
		}
	}

	/**
	 * Muestra los alumnos de un grupo
	 * @param numGrupo numero del grupo
	 */
	
	public void muestraAlumnosGrupo(int numGrupo) {
		System.out.println("Exp.\tApellidos\tNombres\tGrupo");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumGrupo() == numGrupo) {

				System.out.println(alumnos[i].toString());
			}
		}
		System.out.println();
	}
	
	/**
	 * Añade un grupo
	 * @param grup nombre del grupo
	 */

	public void addGrupo(Grupo grup) {
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] == null) {
				grupos[i] = grup;
				break;
			}
		}
	}

	/**
	 * Elimina un grupo
	 * @param numGrupo numero de grupo que elimina
	 */
	
	public void delGrupo(int numGrupo) {

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumGrupo() == numGrupo) {
				System.out.println("No se puede eliminar el grupo. Hay alumnos matriculados.");
				return;
			}
		}

		int posicion = buscaGrupo(numGrupo);
		if (posicion != -1) {
			grupos[posicion] = null;
		}
	}

	/**
	 * Busca un grupo en el instituto
	 * @param numGrupo numero de grupo que busca
	 * @return te devuelve si existe o no el grupo
	 */
	
	public int buscaGrupo(int numGrupo) {
		for (int i = 0; i < alumnos.length; i++) {
			if (grupos[i] != null && grupos[i].getNumGrupo() == numGrupo) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * Arrays de alumnos
	 * @return alumnos
	 */
	
	public Alumno[] getAlumnos() {
		return alumnos;
	}

}