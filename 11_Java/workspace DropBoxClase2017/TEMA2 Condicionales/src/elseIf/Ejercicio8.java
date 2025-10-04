package elseIf;
import java.util.*;


/**
 * @author Ramon
 *
 */
public class Ejercicio8 {

	/**
	 * PDF-Ejercicio de Condicionales 8/22
	 * Descripcion:
	 * Condicionales Ejercicio con if/else.
	 * Condicionales Programas Estructurados.
	 */
	public static void main(String[] args) {
		// Crea un programa que pregunte al usuario cómo se dice en inglés
		// "ordenador". Si el usuario responde "computer" entonces recibirá una
		// felicitación. Si no, recibirá un mensaje de consolación.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Como se dice en ingles ordenador: ");
		String word = entrada.next();
		
		if(word.equals("computer")){
			System.out.println("Felicidades, es correcto");
		}else{
			System.out.println("Es incorrecto");
		}
		
		entrada.close();
	}

}
