package PDF4_Estructura_de_Condicionales;

import java.util.Scanner;
/**
 * @author Ramon
 * Crea un programa que pida al usuario una contraseña. Si escribe "1234" el programa responderá 
"Acceso concedido.". En caso contrario escribirá "Acceso denegado".
 */
public class Ejercicio4if_1linea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la contraseña");
        String password = sc.nextLine();
        System.out.println(password.equals("1234")? "Acceso concedido" : "Acceso Denegado");
        System.out.println("Fin");
        sc.close();
    }
}