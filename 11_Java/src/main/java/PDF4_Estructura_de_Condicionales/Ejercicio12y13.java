package PDF4_Estructura_de_Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 * 12.- Crea una aplicación que pida el número de mes y devuelva el nombre del mes (basta que lo 
haga para los meses de enero a abril). 
 */
public class Ejercicio12y13 {

    public static void main(String[] args) {
        
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int mes;
        
        // Entrada de datos
        System.out.println("Ejercicio 12 'Meses del año'");
        System.out.println("Introduce un numero de mes");
        mes = sc.nextInt();

        // Comprobacion y salida de datos
        while (mes < 1 || mes > 4) {
            System.out.println("Introduce un numero entre 1 y 5");
            mes = sc.nextInt();
        }
        if (mes >= 1 && mes <= 4) {
            if (mes == 1) {
                System.out.println("Enero");
            } else if (mes == 2) {
                System.out.println("Febrero");
            } else if (mes == 3) {
                System.out.println("Marzo");
            } else if (mes == 4) {
                System.out.println("Abril");
            }
        }
        System.out.println("Fin");
        sc.close();
    }
}
