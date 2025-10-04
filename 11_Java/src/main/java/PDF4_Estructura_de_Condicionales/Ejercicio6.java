package PDF4_Estructura_de_Condicionales;

import java.util.Scanner;
/**
 * @author Ramon
 * Crea una aplicación que pregunte el precio de un producto y el número de unidades compradas. 
Si el coste de la compra es mayor de 75 €, se le hará un 15% de descuento. En caso contrario, se le 
hará sólo un 5% de descuento. 
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Variables
        double precio, descuento1, descuento2;
        int unidades;
        double total;
        
        // Insercion de datos
        System.out.println("Introduce el precio del producto");
        precio = sc.nextDouble();
        System.out.println("Introduce las unidades");
        unidades = sc.nextInt();
        
        // Algoritmo de precios
        total = precio * unidades;
        descuento1 = total * 0.85;
        descuento2 = total * 0.95;

        // Salida de datos
        System.out.println("El precio total sin descuento es de: " + total);
        System.out.println((total > 75) ? "Precio con descuento del 15% = "+(descuento1) : "Precio con descuento del 5% = "+(descuento2));
        System.out.println("Fin");
        sc.close();
    }
}
