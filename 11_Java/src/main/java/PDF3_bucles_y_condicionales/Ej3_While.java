package PDF3_bucles_y_condicionales;
import java.util.Scanner;
/**
 * @author Ramon
 * 
 * Crea una aplicación para probar la capacidad de cálculo mental de los usuarios. Se calcularán 
dos números aleatorios entre 1 y 100 y se mostrarán en pantalla. A continuación el usuario deberá 
escribir el resultado de la suma de ambos números y se le indicará si ha acertado o no.
 Estas acciones se repetirán indefinidamente mediante un bucle while.
 Ayuda: Puedes generar un número aleatorio mayor o igual a 0 y menor que 1 con la orden 
Math.random( ). Si lo multiplicas por 100 y le sumas 1, entonces obtendrás un número entre 1 y 
100, ambos inclusive:
 (int) (Math.random()*100 + 1)
    **Ayuda: Puedes hacer que un bucle se ejecute indefinidamente si pones entre paréntesis una 
    **condición que siempre sea verdadera.
 */
public class Ej3_While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ejercicio 3");
        System.out.println("Adivine el resultado de la suma de dos números entre 1 y 100 Presiona 0 para terminar");
        
        // Variables
        int num1,num2;
        int suma = 1;

        // Algoritmo
        while (suma != 0) {
            num1 = (int) Math.round(Math.random() * 100 + 1);
            num2 = (int) Math.round(Math.random() * 100 + 1);
            
            System.out.println(num1 + " + " + num2 + " = ?");
            System.out.println("Introduce el resultado de la suma de ambos números");
            suma = sc.nextInt();
            if (suma != 0) {
                System.out.println(suma == num1 + num2 ? "Has acertado" : "Has fallado");
            } else {
                System.out.println("Cerrando...\nFin del Programa");
                break;
            }
        }
        sc.close();
    }
}
