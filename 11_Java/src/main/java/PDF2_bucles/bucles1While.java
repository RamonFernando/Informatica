/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF2_bucles;

/**
 *
 * @author Ramon
 * Escribe todos los múltiplos de 5 entre 1 y 1000. Utiliza un bucle while y haz que la variable 
contador se incremente de 5 en 5.
 */
public class bucles1While {
    public static void main(String[] args) {
        
        System.out.println("Bucles Ejercicio 1");
        System.out.println("Multiplos de 5 de 1 a 1000");
        
        // Variables
        int contador = 5;
        int cont = 1;
        // Bucle que da los multiplos de 5 del 1 al 1000
        
        while (contador <= 1000) {
            System.out.println(cont + ": " +  contador);
            contador += 5;
            cont++;
        }
        
        System.out.println("\nFIN");
    }
}
