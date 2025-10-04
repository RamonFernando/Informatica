/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF1_condicionales;

import java.util.Scanner;

/**
 *
 * @author Ramon Un profesor quiere una aplicación que muestre las notas de un
 * examen con diferente color según este esquema: • Nota < 4: Rojo. • 4 <= Nota < 5: Verde.
 * • Nota >= 5: Azul. El programa pedirá una nota (puede tener decimales) y
 * devolverá el nombre del color a usar. Utiliza las instrucciones if y else if.
 *
 */
public class condicionales4 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 4");
        System.out.println("-----------");
        Scanner sc = new Scanner(System.in);
        float nota = 0;

        System.out.println("Ingrese una nota (0 - 10): ");
        nota = sc.nextFloat();

        while (nota > 10 || nota < 0) {
            System.out.print("Nota incorrecta \n");
            nota = sc.nextFloat();
        }

        if (nota >= 0 && nota < 4) {
            System.out.print("rojo \n");
            sc.nextLine();
        } else if (nota >= 4 && nota < 5) {
            System.out.print("verde \n");
            sc.nextLine();
        } else if (nota > 5 && nota <= 10) {
            System.out.print("azul \n");

        }

        System.out.print("Su nota es: " + nota + "\n");
        System.out.println("FIN");
        sc.close();
    }
}
