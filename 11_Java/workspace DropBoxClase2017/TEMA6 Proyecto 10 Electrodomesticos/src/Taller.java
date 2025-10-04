/*
 * Clase Taller
 */
public class Taller {

	/**
	 * Atributos de la clase taller MAX_LAVADORAS, lavadoras[] lavadoras
	 */
	private int MAX_LAVADORAS = 20;
	// El array lavadoras[] es un array con MAX_LAVADORAS elementos
	private Lavadoras[] lavadoras = new Lavadoras[MAX_LAVADORAS];

	/**
	 * Taller: Constructor vacio.
	 */
	public Taller() {
		// Constructor vacio de taller
	}

	// Metodos de acceso para la clase Lavadora
	// ListaLavadoras(),addLavadoras,int buscaLavadoras,borraLavadora

	/**
	 * Metodo listaLavadora: Muestra la lista de las lavadoras en stock
	 */
	public void listaLavadoras() {
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] != null) {
				System.out.println(lavadoras[i].toString());
			}
		}
	}

	/**
	 * Metodo addLavadora: Agrega un nuevo equipo a la lista ya existente
	 * 1er Paso Comprobar que el id no este repetido
	 * 2do Paso Agregar el id a la lista
	 * @param lav
	 */
	public void addLavadora(Lavadoras lav) {
		// Comprobamos que no haya ningun id de lavadora igual
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] != null && lavadoras[i].getId() == lav.getId()) {
				System.out
						.println("Número del producto (id) Lavadora se encuentra repetido.");

				return;
			}
		}
		// Añadimos el nuevo producto (id) Lavadora
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] == null) {
				lavadoras[i] = lav;
				System.out.println("Agregado producto: " + lavadoras[i]);
				break;
			}
		}

	}

	
	/**
	 * Metodo buscaLavadora: Devuelve la posicion del equipo en el array(id)
	 * lavadoras[]
	 * 
	 * @param id
	 * 		Identificador del producto
	 * @return 
	 * 		si encuentra el id devolvera la posicion, en caso contrario -1
	 */
	
	public int buscaLavadora(int id) {
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] != null && lavadoras[i].getId() == id) {
				System.out.println("Su articulo es: " + "Lavadora");
				System.out.println(lavadoras[i]);
				// System.out.println(lavadoras[i].toString());
				return i;
			}
		}
		return -1;
	
	}

	
	/**
	 * Metodo borrarLavadora: Metodo para eliminar
	 * 1er Paso comprobar que el id exista
	 * 2do Paso borrar el id seleccionado
	 * @param id
	 */
	public void borrarLavadora(int id) {
		for (int i = 0; i < lavadoras.length; i++) {
			int pos = buscaLavadora(id);
			if (pos != -1) {
				lavadoras[pos] = null;
				System.out.println("Borrado Articulo: " + id );
				
			}
		}
	}

}
