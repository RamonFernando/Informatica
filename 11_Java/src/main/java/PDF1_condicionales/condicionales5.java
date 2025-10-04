/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF1_condicionales;

import java.util.Scanner;

/**
 *
 * @author Ramon
 * Diseña una aplicación donde un usuario pueda elegir el idioma de una frase de saludo. En primer
 lugar se mostrará un menú:
 (1) Francés
 (2) Inglés
 (3) Alemán
 (4) Italiano
 El usuario escribirá un número entero entre 1 y 4 para señalar qué opción quiere y, a continuación, 
aparecerá la frase "Buenos días" en el idioma que corresponda (puedes usar Google translator). Si 
escribe otro número, el mensaje se mostrará en español.
 Utiliza la instrucción switch
 */
public class condicionales5 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5 de Condicionales");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero correspondiente para ver el saludo");
        System.out.println("(1) Frances");
        System.out.println("(2) Ingles");
        System.out.println("(3) Aleman");
        System.out.println("(4) Italiano");
        
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("(1) Bonjour");
        }else if(num == 2){
            System.out.println("(2) Good Morning");
        } else if(num == 3){
            System.out.println("(3) Guten Morgen");
        } else if(num == 4){
            System.out.println("(4) Buongiorno");
        }else{
            System.out.println("(!) Buenos Dias");
        }
        System.out.println("Fin del Programa");
        
        sc.close();
    }
}
