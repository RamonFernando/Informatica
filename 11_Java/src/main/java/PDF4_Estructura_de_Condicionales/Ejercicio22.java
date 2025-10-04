package PDF4_Estructura_de_Condicionales;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        String dia;
        String cierre1 = "20:00h", cierre2 = "14:00h";
        boolean entreSemana = true;
        
        // Entrada de datos
        System.out.println("Ejercicio 22");
        System.out.println("Introduce el número 1 si es fin de semana o cualquier caracter si es entre semana");
        dia = sc.nextLine();
        
        // Salida de datos
        System.out.println((dia.equals("1") && entreSemana)? "Fin de semana "+cierre2 : "Entre semana "+cierre1);
        System.out.println(dia.equals("1")? entreSemana : !entreSemana);
        System.out.println("Fin");
        sc.close();
    }
}