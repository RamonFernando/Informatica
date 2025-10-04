/**
 * 
 */
package EjerciciosMetodos;

/**
 * @author Ramon
 *
 */
public class Ejercicio8MetodosMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 8.- Crea un método int max(int x, int y) que devuelva el mayor de los
		// números x e y. Análogamente, crea el método int min(int x, int y).
		
		int y=3;
		int x=10;
		System.out.println("El mayor de 3 y 10 es: "+ max(3,10));
		System.out.println("El menor de 3 y 10 es: "+ min(3,10));

	}
	static int max(int x, int y){
		if (x > y) {
			return x;
		}else {
			return y;
		}
//		return x > y ? x : y; // Usando operador ternario.
	}
	static int min(int x, int y){
		if (x < y) {
			return x;
		}else {
			return y;
		}
	}
}
