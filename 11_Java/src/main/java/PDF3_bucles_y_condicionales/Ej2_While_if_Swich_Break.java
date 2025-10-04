package PDF3_bucles_y_condicionales;
import java.util.Scanner;
/**
 * @author Ramon
 * Añade al final del programa anterior el código necesario para que indique la puntuación obtenida
 por el jugador:
 • Si ha acertado en un intento → Recibe 10 puntos.
 • Si ha acertado en dos intentos → Recibe 5 puntos.
 • Si ha acertado en tres intentos → Recibe 2 puntos.
 • En otro caso → Recibe 0 puntos.
 */

public class Ej2_While_if_Swich_Break {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Variables
    int numero_aleatorio = (int) Math.round(Math.random() * 1 + 1);
    int intentos = 1;
    int num = 0;

    System.out.println("Ejercicio 1");
    System.out.println("Adivine el numero entre 1 y 10");
    
    while(num <= 3 ){
        System.out.println("Intento " + intentos + ":");
        System.out.println("Introduce un número");
        num = sc.nextInt();
        
        if (num == numero_aleatorio) {
            System.out.println("Has acertado! al " + intentos + "º intento");
            break;
        }else if(intentos == 3){
            System.out.println("Has perdido, el numero era: " + numero_aleatorio);
            break;
        }else{
            System.out.println("Has fallado");
        }
        
        intentos++;
    }
    // Se comprueba la condicion del while para dar una respuesta concreta de asignacion de puntos
    switch (intentos) {
        case 1:
            System.out.println("Recibes 10 puntos");
            break;
    
        case 2:
            System.out.println("Recibes 5 puntos");
            break;
    
        case 3:
            // Si el usuario ha acertado en 3 intentos le asigna los puntos y sale del switch
            // De lo contrario recibe 0 puntos
            if (intentos == 3 && num == numero_aleatorio) {
                System.out.println("Recibes 2 puntos");
                break;
            }else{
                System.out.println("Recibes 0 puntos");
                break;
            }
    }
    
    System.out.println("\nFin del Programa");
    sc.close();
    }
}
