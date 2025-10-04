/**
 * 
 */
package Algebra;

/**
 * @author Ramon
 *
 */
public class Polinomio {

	/**
	 * @param args
	 */
	private double[] coeficientes;

	// Constructores
	public Polinomio() {
		// Creamos un polinomio de grado 2 con
		// coeficientes 0.
		coeficientes = new double[3];
	}

	public Polinomio(int grado) {
		// Creamos un polinomio del grado indicado
		// con coeficientes 0.
		coeficientes = new double[grado + 1];
	}

	public Polinomio(double[] coefs) {
		coeficientes = coefs;
	}

	public int getGrado() {
		return coeficientes.length - 1;
	}

	// Suma un polinomio p a nuestro polinomio.
	// Damos por supuesto que ambos son del mismo grado.
	public Polinomio sumar(Polinomio q) {

		// Obtenemos los coeficientes de q
		double[] coeficientesQ = q.getCoeficientes();

		// Creamos un array de coeficientes que contendrá
		// la suma de los coeficientes de los dos polinomios.
		double[] suma = new double[coeficientes.length];

		// Vamos sumando los coeficientes de los dos polinomios
		// y guardándolos en el array suma.
		for (int i = 0; i < coeficientes.length; i++) {
			suma[i] = coeficientes[i] + q.getCoeficientes()[i];
		}
		return new Polinomio(suma);
	}

	public Polinomio restar(Polinomio q) {

		// Obtenemos los coeficientes de q
		double[] coeficientesQ = q.getCoeficientes();

		double[] resta = new double[coeficientes.length];

		// Creamos un array de coeficientes que contendrá
		// la resta de los coeficientes de los dos polinomios.
		for (int i = 0; i < resta.length; i++) {
			resta[i] = coeficientes[i] - q.getCoeficientes()[i];
		}
		return new Polinomio(resta);
	}
	
	public void mostrarCoeficientes() {
		// Muestra en una fila los coeficientes de este polinomio.

		System.out.print("Coeficientes: ");
		for (int i = 0; i < coeficientes.length; i++) {
			System.out.print(coeficientes[i] + " ");
		}
		System.out.println();
	}
	
	public String toString() {
		String salida = "";
		double valor;

		for (int i = 0; i < coeficientes.length; i++) {
			valor = coeficientes[i];
			if (i >= 2) {
				salida += "+" + String.valueOf(valor) + "x^" + i;
			} else if (i >= 1) {
				salida += "+" + String.valueOf(valor) + "x";
			} else {
				salida += String.valueOf(valor);
			}
		}

		return salida;
	}

	public double evaluar(double x) {
		double total = 0;
		double valor;
		for (int i = 0; i < coeficientes.length; i++) {
			valor = coeficientes[i] * Math.pow(x, i);
			total = total + valor;
		}
		return total;
	}

	// Set y get
	public double[] getCoeficientes() {
		return coeficientes;
	}

	public void setCoeficientes() {
		this.coeficientes = coeficientes;
	}



	

}
