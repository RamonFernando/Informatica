package PDF4_Estructura_de_Condicionales;
import java.util.Scanner;
/**
 * 
 * @author Ramon
 * 18.- Crea un programa que pida un número entero por teclado, entre 1 y 10. Si el usuario escribe un 
número entero, se escribirá su valor en pantalla. Si lo que escribe no es un entero, se mostará un 
mensaje de error. 
 */
public class Ejercicio18y19_TryCatch {

    public static void main(String[] args) {

        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int num = 0;
        try {
            // Entrada de datos
            System.out.println("Ejercicio 18 y 19");
            System.out.println("Introduce un numero entero entre 1 y 10");
            num = sc.nextInt();

            // Salida de datos
            if (num >= 1 && num <= 10) {// Numero entre 1 y 10 y debe ser un entero (int)
                System.out.println(num == 3 ? "Has acertado el numero! " + num : "EL numero es " + num);
            }
            // Control de errores de un numero entero
        } catch (Exception InputMismatchException) {
            System.out.println("Error");
            System.out.println("El numero debe ser un entero");
        } finally {
            System.out.println("Fin");
            sc.close();
        }
        

    }
}
