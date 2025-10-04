package PDF2_bucles;

import java.util.Scanner;

/**
 * @author Ramon
 * Utiliza un bucle for para preguntar 5 veces por un número entero, y al final devolver la frase 
"Has fallado".
 */
public class bucles4For {
    public static void main(String[] args) {
        System.out.println("Bucles Ejercicio 4");
        System.out.println("Adivina un número");
        System.out.println("Tienes 5 oportunidades para adivinar un numero entre 1 y 10");
        
        Scanner sc = new Scanner(System.in);
        // Variables
        final int NUMERO_SECRETO = 5;
        int num = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Intento " + i + ":");
            System.out.println("Introduce un número");
            num = sc.nextInt();
            // Modificacion si acierta cambia el mensaje
            if (num == NUMERO_SECRETO) {
                System.out.println("Has acertado");
                break;
            }else{
                System.out.println("Has fallado");
            }
        }
        
       
        sc.close();
        System.out.println("\nFIN");
    }
}
