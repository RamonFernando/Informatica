
/**
 * @author Ramon
 *
 */
public class Practica9OperacionesRelacionales {

	/**
	 * Operaciones Relacionales(El resultado de una operacion relacional es un
	 * booleano)
	 */
	public static void main(String[] args) {
		// A==B A es igual a B
		// A!=B A es distinto de B
		// A>B A es mayor que B
		// A>=B A es mayor igual que B
		// A<B A es menor que B
		// A<=B A es menor igual que B

		int A = 10;
		int B = 20;

		boolean resultado = (A == B);
		boolean resultado1 = (A >= B);
		boolean resultado2 = (A != B);

		System.out.println(resultado);
		System.out.println(resultado1);
		System.out.println(resultado2);
	}

}
