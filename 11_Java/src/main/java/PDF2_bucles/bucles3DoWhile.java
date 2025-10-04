package PDF2_bucles;
/**
 * @author Ramon
 * Crea una aplicación que calcule una lista con las potencias de 3 menores que 12000. Haz que en 
cada pasada del bucle se muestre el exponente y el valor de la potencia. Utiliza un bucle do-while.
 */
public class bucles3DoWhile {

    public static void main(String[] args) {
        System.out.println("Bucles Ejercicio 3");
        System.out.println("Multiplos de 5 de 1 a 1000");
        
        // Variables
        int potencia = 3;
        int nuemro = 3;
        int cont = 1;
        
        // Bucle que da los multiplos de 5 del 1 al 1000
            System.out.println("Potencias de 3 menores a 12000");
            System.out.println("------------------------------");
        do {
            System.out.println(cont + "º: " + potencia + "^" + nuemro + " = " +  (potencia *= 3));
            cont++;
        } while (potencia <= 12000);
        System.out.println("\nFIN");
    }
}
    
