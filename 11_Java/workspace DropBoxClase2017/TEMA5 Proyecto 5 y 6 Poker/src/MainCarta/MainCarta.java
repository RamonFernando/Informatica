/**
 * 
 */
package MainCarta;

import Carta.Baraja;
import Carta.Carta;

/**
 * @author Ramon
 *
 */
public class MainCarta {

	/**
	 * Ejercicio sobre Metodos, toString,Compara, Getters y Setters con Switch
	 */

	public static void main(String[] args) {

		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("*=*=*=*=*=* Proyecto T5 Poker *=*=*=*=*=*=*");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("Alumno: Ramon Fernando"
				+ "\nProfesor: Carlos Bsogort"
				+ "\nAsignatura: Programacion\nCurso: 2016-2017");

		// Objetos
		// Carta c1 = new Carta(8, 1);
		// Carta c2 = new Carta((int)(Math.random()*13+1), (int)
		// (Math.random()*3));
		// Carta c3 = new Carta((int)(Math.random()*13+1), (int)
		// (Math.random()*3));
		//
		// System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		// System.out.println("La carta 1 tiene: ");
		// System.out.println("La carta es el " + c1.obtenerValor() + " de "
		// + c1.obtenerPalo());
		// System.out.println("El número de tu carta es: " + c1.getValor());
		// System.out.println("El palo es: " + c1.obtenerPalo());
		// System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		// System.out.println("La carta 2 tiene: ");
		// System.out.println("La carta es el " + c2.obtenerValor() + " de "
		// + c2.obtenerPalo());
		// System.out.println("El número de tu carta es: " + c2.getValor());
		// System.out.println("El palo es: " + c2.obtenerPalo());
		// System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		//
		// // Metodo toString
		// System.out.println("El toString de Carta 1 y 2");
		// System.out.println(c1.toString());
		// System.out.println(c2.toString());
		// // Metodo Compara
		// System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		// System.out.println("El metodo Compara Carta 1 y 2");
		// System.out.println("¿La carta " + c1.getValor() + " es igual al "
		// + c1.getPalo() + " = "
		// + c1.compara(c1.getValor(), c1.getPalo()));
		// System.out.println("¿La carta " + c2.getValor() + " es igual al "
		// + c2.getPalo() + " = "
		// + c2.compara(c2.getValor(), c2.getPalo()));
		// System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		// System.out.println("Carta 3");
		// System.out.println(c3.obtenerValor() + " " +c3.obtenerPalo());
		//
		// System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		// System.out.println("*=*=*=*=*= Fin del Programa *=*=*=*=*=*=*=*");
		// System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
	
		Baraja unaBaraja = new Baraja();
		unaBaraja.ordenar();
		
		unaBaraja.Mostrar();
	
	
	}

	
}
