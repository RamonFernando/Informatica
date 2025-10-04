package PDF3_bucles_y_condicionales;
import java.util.Scanner;
/**
 * @author Ramon
 * Escribe un programa que invente un nº aleatorio entre 1 y 10. El usuario tendrá que adivinarlo en
 tres intentos como máximo. Al finalizar el programa se le dirá si ha acertado el número y en cuántos
 intentos lo ha hecho. Utiliza while y break. y Math.random
 */
public class Ej1_While_Break {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Variables
    int numero_aleatorio = (int) Math.round(Math.random() * 10 + 1);
    int intentos = 1;
    int num = 0;

    System.out.println("Ejercicio 1");
    System.out.println("Adivine el numero entre 1 y 10");
    
    
    while(intentos <= 3 ){
        
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
    
    System.out.println("\nFIN");
    sc.close();
    }
}
