package PDF4_Estructura_de_Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 * Escribe un programa que pregunte el precio de un producto. Si vale más de 80 €, le hará un 
descuento del 10%. Se mostrará en pantalla el precio final. 
 */
public class Ejercicio2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        double precio = sc.nextDouble();
        if (precio > 80) {
            System.out.println("El descuento del 10% es de (" + (precio * 0.9 - precio)*-1 + "€)");
            System.out.println("El precio final es de: " + (precio * 0.9));
        } else {
            System.out.println("El precio final es de: " + precio + "€");
            
        }
        System.out.println("Fin");
        sc.close();
    }
}
