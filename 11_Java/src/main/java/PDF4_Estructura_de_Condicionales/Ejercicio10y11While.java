package PDF4_Estructura_de_Condicionales;
import java.util.Scanner;
/**
 * @author Ramon
 *  10.- Diseña un programa que pida una nota entera entre 0 y 10 y la convierta a la calificación 
correspondiente (Insuficiente, Suficiente, Bien, Notable y Sobresaliente). 
    11.- Modifica el programa anterior para que acepte una nota con decimales (por ejemplo, si la nota 
es menor que 5, la calificación será de Insuficiente). 
 */
/**
 * @author Ramon
 */
public class Ejercicio10y11While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 10");
        System.out.println("============");
        
        // Variables
        double num;
        
        // Entrada de Datos
        System.out.println("Introduce tu nota del curso: (0 - 10)");
        num = sc.nextDouble();
        
        // Salida de Datos
        while (num < 0 || num > 10) {
            System.out.println("Introduce una nota entre 0 y 10");
            num = sc.nextInt();
        }
        if (num < 5) {
            System.out.println("Insuficiente");
        } else if (num >= 5 && num < 6) {
            System.out.println("Suficiente");
        } else if (num >= 6 && num < 7) {
            System.out.println("Bien");
        } else if (num >= 7 && num < 9) {
            System.out.println("Notable");
        }else {
            System.out.println("Sobresaliente");
        }
        System.out.println("Fin");
        sc.close();
    }
}
