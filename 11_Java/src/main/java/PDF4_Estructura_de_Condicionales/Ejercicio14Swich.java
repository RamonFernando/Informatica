package PDF4_Estructura_de_Condicionales;

import java.util.Scanner;
/**
 * @author Ramon
 * 13.- Modifica el programa anterior para sólo haga el proceso si el número de mes está entre 1 y 4.
 */

public class Ejercicio14Swich {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 12 'Meses del año'");
        System.out.println("Introduce un numero de mes");
        int mes = sc.nextInt();

        while (mes < 1 || mes > 12) {
                System.out.println("Introduce un numero entre 1 y 12");
                mes = sc.nextInt();
        }
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Mes no valido");
                break;
        }
        
        System.out.println("Fin");
        sc.close();
    }
}
