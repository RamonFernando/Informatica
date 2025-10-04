package PDF4_Estructura_de_Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 * Crea un programa que pida la temperatura de un reactor nuclear. Si ésta supera los 120ºC, se 
mostrará en pantalla el mensaje: "TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, 
INSENSATOS! 
 */
public class Ejercicio1_IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura");
        int temperatura = sc.nextInt();
        if (temperatura > 120) {
            System.out.println("Temperatura del reactor critica. ¡Corred, insensatos!");
        }
        System.out.println("Fin");
        sc.close();
    }
}
