package PDF4_Estructura_de_Condicionales;
import java.util.Scanner;
/**
 * @author Ramon
 * 21.- Crea un programa que pregunte el nombre del usuario y luego lo escriba. Ahora bien, si el 
usuario no introduce nada, el nombre deberá quedar con el valor "Desconocido".
 */
public class Ejercicio21 {
    public static void main(String[] args) {

        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        String nombre;
        boolean dato = true;
        // Entrada de datos
        System.out.println("Ejercicio 21");
        System.out.println("Introduce tu nombre");
        nombre = sc.nextLine();
        
        // Salida de datos
        System.out.println((nombre == null || nombre.equals(""))? !dato + "\nDesconocido" : dato + "Tu nombre es "+nombre);
        System.out.println("Fin");
        sc.close();
    }
}
