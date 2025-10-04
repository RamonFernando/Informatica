package PDF4_Estructura_de_Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 * 15.- Crea una aplicación que pida el número de mes y devuelva el nombre del mes (basta que lo 
haga para los meses de enero a abril).
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int mes;
        int numMeses1 = 31, numMeses2 = 30, numMeses3 = 28;

        // Entrada de datos
        System.out.println("Ejercicio 15 'Meses del año'");
        System.out.println("Introduce un numero de mes");
        mes = sc.nextInt();
        
        // Comprobacion y salida de datos
        while (mes < 1 || mes > 12) {
            System.out.println("Introduce un numero entre 1 y 12");
            mes = sc.nextInt();
        }
        switch (mes) {
            // Meses con 31 dias
            case 1 : case 5 : case 7 : case 8 : case 10 : case 12:
                System.out.println(numMeses1);
                break;

            // Meses con 30 dias
            case 2: case 4: case 6: case 9: case 11:
                System.out.println(numMeses2);
                break;

            // Meses con 28 dias
            case 3:
                System.out.println(numMeses3);
                break;
        }
        sc.close();
    }
}
