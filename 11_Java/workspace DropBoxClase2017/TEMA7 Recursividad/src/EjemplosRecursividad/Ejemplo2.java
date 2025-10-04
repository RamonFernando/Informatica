package EjemplosRecursividad;

public class Ejemplo2 {

	public static void main(String[] args) {
		// Metodo recursivo
		System.out.println(transforma(10));
	}
	public static String transforma(int n){
		if (n == 0) {
			return "";
		}else {
			return transforma(n/2) + " " + n%2;
		}
	
	}
}
