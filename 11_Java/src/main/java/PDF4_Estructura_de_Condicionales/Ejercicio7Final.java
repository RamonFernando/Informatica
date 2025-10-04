package PDF4_Estructura_de_Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 * Juego de adivinar el número secreto. El ordenador nos preguntará un número del 1 al 10. Si 
coincide con el número secreto (que habrás codificado como una constante entera) nos felicitará. Si 
no, nos dirá que hemos fallado. 
 */
public class Ejercicio7Final {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre 1 y 10");
        int num = sc.nextInt();
        final int NUMERO_SECRETO = 7;
        System.out.println(num == NUMERO_SECRETO ? "Has acertado" : "Has fallado");
        System.out.println("Fin");
        sc.close();
    }
}
