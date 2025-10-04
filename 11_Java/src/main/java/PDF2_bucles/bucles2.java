package PDF2_bucles;
/**
 * @author Ramon
 * Modifica el programa anterior para que no aparezcan los múltiplos de 5 sino que, al final, 
simplemente se muestre la suma de todos ellos. Utiliza un bucle while.
 */
public class bucles2 {
    public static void main(String[] args) {
        System.out.println("Bucles Ejercicio 1");
        System.out.println("Multiplos de 5 de 1 a 1000");
        
        // Variables
        int contador = 5;
        int suma = 0;
        int cont = 1;
        // Bucle que da los multiplos de 5 del 1 al 1000
        
        while (contador <= 1000) {
            suma += contador;
            System.out.println(cont + "º: " +  contador + " Suma Total: " + suma + "");
            contador+=5;
            cont++;
            
        }
        System.out.println("\nSuma total es: " + suma);
        System.out.println("\nFIN");
    }
    }

