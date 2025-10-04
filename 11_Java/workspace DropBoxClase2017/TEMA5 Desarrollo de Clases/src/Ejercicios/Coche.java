/**
 * 
 */
package Ejercicios;

/**
 * @author Ramon
 *
 */
public class Coche {

	/**
	 * @param Ramon
	 */
	
		// Ejercicio
		//
		// 1. Desarrollar una clase Coche (y una clase Main para utilizarla).
		// 1. Atributos: marca, modelo, color, matricula, precio y descuento.
		// 2. Métodos: arrancar, detenerse, acelerar, frenar, verPrecio
		// (devuelve un valor a partir del precio y el descuento).
		// 2. Desde la clase Main crear un par de objetos de la clase Coche.
		// Asignar un valor a la variable descuento de uno de ellos y comprobar
		// que ese valor se ha cambiado en todos los demás.
		// 3. Comprobar que se puede acceder a la variable descuento usando
		// el nombre de la clase en lugar del nombre de una instancia:
		// Coche.descuento.
		
		// Atributos
		
		private String marca;
		private String modelo;
		private String color;
		private String matricula;
		private double precio;
		double descuento;
		
		
		
		
		
		// Constructor Generate constructor use fields
		public Coche(String marca, String modelo, String color, String matricula, double precio, double descuento) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.color = color;
			this.matricula = matricula;
			this.precio = precio;
			this.descuento = descuento;
		}
		
		// Metodos
		void Arrancar(){
			System.out.println("Arrancando...");
		}
		void Detenerse(){
			System.out.println("Deteniendo...");
		}
		void Acelerar(){
			System.out.println("Acelerando...");
		}
		void Frenar(){
			System.out.println("Frenando...");
		}
		double verPrecio(){
			return precio-descuento;
		}
		void mostrar(){
			System.out.println("Audi");
			System.out.println("A4");
			System.out.println();
		}
		// "Audi","A4","5879 FDS","Negro",15,50
		
		// Gets y Sets
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		
		
		
	

}
