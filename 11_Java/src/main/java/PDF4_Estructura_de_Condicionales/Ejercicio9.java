package PDF4_Estructura_de_Condicionales;
import java.util.Scanner;
/**
 * @author Ramon
 * Crea un programa que pregunte el precio de un producto y el número de unidades compradas. Si 
el coste de la compra es menor de 100 €, el cliente no tiene derecho a un descuento. Si el coste 
sobrepasa los 200 €, el descuento será del 15%. De lo contrario será del 10% solamente. 
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Variables
        double precio, descuento1, descuento2;
        int unidades;
        double total;
        
        // Entrada de datos
        System.out.println("Ejercicio 9");
        System.out.println("Introduce el precio del producto");
        precio = sc.nextInt();
        System.out.println("Introduce el numero de unidades");
        unidades = sc.nextInt();
        
        // Algoritmo de precios
        total = precio * unidades;
        descuento1 = total * 0.85;
        descuento2 = total * 0.90;
        
        // Salida de datos
        if (total < 100 ) {
            System.out.println("El precio total es de: " + total);
        } else {
            System.out.println("El precio total sin descuento es de: " + total);
            System.out.println((total > 200)? "Precio con descuento del 15% = "+(descuento1) : "Precio total con descuento del 10% = "+(descuento2));
        }
        System.out.println("Fin");
        sc.close();
    }
}
