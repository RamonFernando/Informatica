package PDF4_Estructura_de_Condicionales;

import java.time.Year;
import java.util.Scanner;
/**
 * @author Ramon
 * 16.- Modifica el programa anterior para que pida el año en curso y el número de mes. Y devuelva el 
número de días de ese mes (ahora sí debes tener en cuenta el asunto de los años bisiestos).
 */
public class Ejercicio16TryCatchWhileSwich {

    public static void main(String[] args) {
        
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int mes = 0, anio = 0;
        int numMeses1 = 31, numMeses2 = 30, numMeses3 = 28, numMeses4Bisiesto = 29;

        // Entrada de datos
        System.out.println("Ejercicio 15");

        // Comprobacion y salida de datos
        try {
            while ((mes < 1 || mes > 12)) {
                System.out.println("Introduce un numero de mes entre 1 y 12 y un año entre 1 y 9999");
                    System.out.println("Introduce el mes");
                    mes = sc.nextInt();
                    System.out.println((mes > 0 && mes < 13) ? "" : "Mes no valido");
            }
            while ((anio < 1 || anio > 9999)) {
                System.out.println("Introduce el año");
                anio = sc.nextInt();
                System.out.println((anio > 0 && anio < 9999) ? "" : "Año no valido");
            }
        } catch (Exception e) {
            System.out.println("Error mes o año no valido");
            System.out.println("Tipo de error: " + e.toString());
            
        }
        switch (mes) {
            // Meses con 31 dias
            case 1 : case 5 : case 7 : case 8 : case 10 : case 12:
                System.out.println(numMeses1 + " dias");
                break;
    
            // Meses con 30 dias
            case 3: case 4: case 6: case 9: case 11:
                System.out.println(numMeses2 + " dias");
                break;
    
            // Meses con 28 dias
            case 2:
            // Comprobamos si el año es bisiesto (anio % 4 == 0) && (anio % 400 == 0) && (anio % 100 != 0)
            //(anio divisible entre 4 o entre 400 (bisiesto) y no divisible entre 100 (no bisiesto))
            if (Year.isLeap(anio)) {
                System.out.println("Este año es bisiesto y tiene 366 dias, Febrero: " + numMeses4Bisiesto + " dias");
            } else {
                System.out.println(numMeses3 + " dias");
                break;
            }
        }
        System.out.println("Fin");
        sc.close();
    }
        
}


