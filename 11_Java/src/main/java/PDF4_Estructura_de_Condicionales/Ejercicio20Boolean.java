package PDF4_Estructura_de_Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 * 20.- Escribe un programa que pida la edad del usuario. Si ésta es menor de 18 años, el valor de la 
variable mayorDeEdad será verdadero. Si no, será falso. Al final se mostrará este valor. 
 */
public class Ejercicio20Boolean {
    public static void main(String[] args) {
        
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int edad;
        boolean mayorEdad = false;
        try {
            // Entrada de datos
            System.out.println("Ejercicio 20 'Edad mayor o no'");
            System.out.println("Introduce tu edad");
            edad = sc.nextInt();
            
            // Salida de datos
            System.out.println((edad <= 18) ? mayorEdad : !mayorEdad);
            System.out.println("Edad: " + edad);
          
        } catch (Exception InputMismatchException) {
            System.out.println("Error");
            System.out.println("La edad debe ser un entero");
        } finally {
            System.out.println("Fin");
            sc.close();
        }
    }
}
