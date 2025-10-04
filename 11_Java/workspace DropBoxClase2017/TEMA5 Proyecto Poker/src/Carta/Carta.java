/**
 * 
 */
package Carta;

/**
 * @author Ramon
 *
 */
public class Carta {

	/**
	 * Ejercicio sobre Metodos, toString,Compara, Getters y Setters con Switch
	 */
	// ENUNCIADO:
	// Crea un proyecto llamado Poker con una clase Carta. Esta clase
	// representará una carta de la baraja
	// francesa.
	// El valor de una carta será un número entre 1 y 13 (incluyendo sota,
	// reina y rey). El palo de una carta
	// puede ser diamantes, corazones, picas o tréboles, así que lo
	// representaremos por un número entre 0
	// y 3.
	// Añadiremos un método compara( ) que toma como parámetro otro objeto
	// de tipo Carta y devuelve
	// true si tienen el mismo valor y palo o false en caso contrario.
	// El método toString( ) devolverá una cadena de caracteres del tipo:
	// "Dos de corazones" o "Reina de
	// diamantes".
	// - int valor
	// - int palo
	// + Carta (int valor, int palo )
	// + todos los getters y setters
	// + boolean compara (Carta
	// otraCarta)
	// + String toString( )

	// Atributos

	private int valor;
	private int palo;
	private String datos;

	// Construcotres

	public Carta(int valor, int palo) {
		this.valor = valor;
		this.palo = palo;
	}

	// Metodos de acceso Getters and Setters

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getPalo() {

		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}

	// Boolean Metodo Compara
	public boolean compara(int getValor, int getPalo) {
		if (this.valor == getValor && this.palo == getPalo) {
			return true;
		} else {
			return false;
		}
	}

	// Metodo toString
	public String toString() {
		String[] nombres = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Sota",
				"Reina", "Rey" };
		String[] palos = { "Diamantes", "Corazones", "Picas", "Tréboles" };

		String valorString = nombres[valor - 1];
		String paloString = palos[palo];
		// return "La carta es el " + valor + " de " + obtenerPalo();
		return valorString + " de " + paloString;
		
	}

	public String obtenerValor() {
		switch (valor) {
		case 1:
			datos = "A";
			break;
		case 2:
			datos = "Dos";
			break;
		case 3:
			datos = "Tres";
			break;
		case 4:
			datos = "Cuatro";
			break;
		case 5:
			datos = "Cinco";
			break;
		case 6:
			datos = "Seis";
			break;
		case 7:
			datos = "Siete";
			break;
		case 8:
			datos = "Ocho";
			break;
		case 9:
			datos = "Nueve";
			break;
		case 10:
			datos = "Diez";
			break;
		case 11:
			datos = "Sota";
			break;
		case 12:
			datos = "Reina";
			break;
		case 13:
			datos = "Rey";
			break;

		default:
			System.out.println("Error, parametro incorrecto.");
			break;
		}

		return datos;
	}

	public String obtenerPalo() {
		switch (palo) {
		case 0:
			datos = "Diamantes";
			break;
		case 1:
			datos = "Corazones";
			break;
		case 2:
			datos = "Picas";
			break;
		case 3:
			datos = "Treboles";
			break;

		default:
			System.out.println("Error, parametro incorrecto");
			break;
		}
		return datos;

	}

}
