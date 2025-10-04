/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF1_condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 * Queremos diseñar un programa que solicite un número al usuario y le responda "Es impar" o 
"No es impar". Utiliza para ello la notación ? en lugar de if asignando a una variable de tipo String 
el resultado y mostrando después esta variable.
 */
public class condicionales2 {
    public static void main(String[] args) {
         System.out.println("Ejercicio 2");
        System.out.println("============");
        Scanner sc = new Scanner(System.in);

        final String Nombre_REQUERIDO = "ramon";
        final String PASSWORD_REQUERIDO = "java8";

        System.out.println("Introduce tu nombre de usuario: ");
        String nombre = "ramon";
        System.out.println("Introduce tu password: ");
        String password = "java8";

        if (nombre.equals(Nombre_REQUERIDO) && password.equals(PASSWORD_REQUERIDO)) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
        
        System.out.println("Fin");
        sc.close();
        
    }
}
