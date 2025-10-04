package PDF4_Estructura_de_Condicionales;
/**
 * @author Ramon
 * Crea un programa que pregunte un número de mes. Si el número introducido está entre 1 y 12, 
mostrará un mensaje de aceptación: "Mes correcto". De lo contrario, se mostrará un mensaje de 
error: "Mes no válido".
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int mes = sc.nextInt();
        System.out.println((mes >= 1 && mes <= 12) ? "Mes correcto" : "Mes no valido");
        System.out.println("Fin");
        sc.close();
    }
}
