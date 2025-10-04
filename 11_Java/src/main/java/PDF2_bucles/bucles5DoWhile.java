package PDF2_bucles;
import java.lang.Math;
import java.util.Scanner;
/**
 * @author Ramon
 * Diseña un programa que invente un número aleatorio. A continuación pedirá al usuario que lo 
adivine. Si el usuario falla, entonces el programa le dará otra oportunidad. Una vez que el usuario 
adivina el número o falla tres veces, el programa termina. 
Utiliza un bucle do-while.
Ayuda: Puedes generar un número aleatorio mayor o igual a 0 y menor que 1 con la orden 
Math.random( ). Si lo multiplicas por 10 y le sumas 1, entonces obtendrás un número entre 1 y 10, 
ambos inclusive:
 (int) (Math.random()*10 + 1)
 */
public class bucles5DoWhile {
    public static void main(String[] args) {
        System.out.println("Bucles Ejercicio 5");
        System.out.println("Adivina el número (1-10), tienes 3 oportunidades");
        System.out.println("------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        // Variables
        int numero_aleatorio = (int) Math.round(Math.random() * 10 + 1);
        int intentos = 1;
        do {
            System.out.println("Intento " + intentos + ":");
            System.out.println("Introduce un número"); 
            int num = sc.nextInt();
            if (num == numero_aleatorio) {
                System.out.println("Has acertado!");
                break;
            }else if(intentos == 3){
                System.out.println("Has perdido, el numero era: " + numero_aleatorio);
                break;
            }else{
                System.out.println("Has fallado");
            }
            intentos++;
            
        } while (intentos <= 3);
        
        sc.close();
        System.out.println("\nFIN");
    }
}
