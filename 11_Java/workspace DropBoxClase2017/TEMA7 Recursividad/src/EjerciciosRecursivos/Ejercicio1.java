package EjerciciosRecursivos;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Metodos recursivos
		System.out.println(transforma(10));
		
	}
	public static String transforma(int n){
		if (n == 0) {
			// Caso base: Cuando el numero que le pasas a n da 0
			return "";
		}else {
			// Caso recursivo
			return transforma(n/2) + n%2;
		}
	}
}
