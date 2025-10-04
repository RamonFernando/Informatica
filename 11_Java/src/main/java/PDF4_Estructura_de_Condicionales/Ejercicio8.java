package PDF4_Estructura_de_Condicionales;

import java.util.Scanner;

/**
 * 
 * @author Ramon
 * Crea un programa que pregunte al usuario cómo se dice en inglés "ordenador". Si el usuario 
responde "computer" entonces recibirá una felicitación. Si no, recibirá un mensaje de consolación. 
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        // Metodo Scanner
        Scanner entrada = new Scanner(System.in);
        
        // Variables
        String pregunta = "ordenador";
        String palabra_clave = "computer";
        
        // Entrada de datos
        System.out.println("¿Como se dice en ingles " + "\'" + pregunta + "\'?");
        pregunta = entrada.nextLine();
        
        // Salida de datos
        System.out.println(pregunta.equals(palabra_clave) ? "Felicitaciones!" : "No has acertado, la respuesta era: "+palabra_clave);
        System.out.println("Fin");
        entrada.close();
    }
}
