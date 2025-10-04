package PDF4_Estructura_de_Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 * Modifica el ejercicio anterior de manera que si la compra es inferior a 5 €, se sumen 2 euros a la 
factura por gastos de gestión.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        double precio = sc.nextDouble();
        if (precio < 5) {
            System.out.println("El precio final es de: " + (precio + 2));
        } else if(precio > 80) {
            System.out.println("El descuento del 10% es de (" + (precio * 0.9 - precio)*-1 + "€)");
            System.out.println("El precio final es de: " + (precio * 0.9));
        } else {
            System.out.println("El precio final es de: " + precio);
        }
        System.out.println("Fin");
        sc.close();
    }
}
