/**
 * 
 */
package Carta;

/**
 * @author Ramon
 *
 */
public class Baraja {
	// Añade al proyecto anterior una clase llamada
	// Baraja, que representará una baraja francesa.
	// El único atributo de la clase Baraja será un array de 52 objetos Carta.
	// La clase dispondrá de métodos para ordenar la baraja (o sea colocar las
	// cartas de menor a mayor
	// para cada palo), para barajar las cartas (colocarlas aleatoriamente),
	// para cortar la baraja (dividir el
	// mazo en dos partes y darles la vuelta) y para extraer una carta de arriba
	// del mazo.
	// También habrá un método para mostrar una lista con las cartas de la
	// baraja.

	// - Carta[52] cartas
	// + Baraja ( )
	// + ordenar ( )
	// + barajar ( )
	// + cortar ( )
	// + extraer ( )
	// + mostrar ( )
	private int carta;
	private Carta[] cartas = new Carta[52];

	// Constructor
	public Baraja() {

	}

	// Constructor 2...
	// public Baraja(int carta, Carta[] cartas) {
	//
	// this.carta = carta;
	// this.cartas = cartas;
	// }

	// Metodos
	public void ordenar() {
		for (int palo = 0; palo <= 3; palo++) {
			
			for (int valor = 1; valor <= 13; valor++) {
				// Comprobacion con syso...
				 System.out.print("(" + valor + "," + palo + ")");
				 cartas[palo*13+valor-1] = new Carta(valor,palo);
				 new Carta(valor,palo);
			}
			System.out.println("");
		}
	
	}

	public void barajar() {
		for (int i = 0; i < cartas.length; i++) {
			
		}
	}

	public void cortar() {

	}

	public void extraer() {
		System.out.println("La primera carta extraida es " + cartas[0]);
	}

	public void Mostrar() {
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
	
	}

	// Getters y Setters
	public int getCarta() {
		return carta;
	}

	public void setCarta(int carta) {
		this.carta = carta;
	}

	public Carta[] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}
}
