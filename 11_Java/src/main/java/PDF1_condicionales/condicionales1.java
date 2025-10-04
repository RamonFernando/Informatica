/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PDF1_condicionales;

import java.util.Scanner;

/**
 *
 * @author Ramon
 * 
 * 1.- Queremos crear una aplicación que controle el acceso a un ordenador pidiendo una clave de 
    acceso. 
    El programa pedirá una cadena de caracteres al usuario. La comparará con la cadena "java8" y si 
    son iguales, escribirá "Acceso permitido". En caso contrario escribirá "Acceso denegado". 
    Para guardar la clave "java8" utiliza una constante llamada CLAVE_REQUERIDA.
    * [Ayuda: Recuerda que para comparar dos cadenas no podemos utilizar el símbolo == sino que hay 
que usar variable.equals(cadena).]
 */
public class condicionales1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Variables
        String CLAVE_REQUERIDA = "java8";
        
        System.out.println("Ejercicio 1");
        System.out.println("-----------");
        System.out.print("Ingrese clave de Usuario");
        String clave = scan.nextLine();
        if (clave.equals(CLAVE_REQUERIDA)) {
            System.out.println("Acceso Permitido");
        }else{
            System.out.println("Acceso Denegado");
        }
        
        
        scan.close();    
    }
}
