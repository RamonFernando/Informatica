package PDF4_Estructura_de_Condicionales;
import java.util.Scanner;

/**
 * 
 * @author Ramon
 * 17.- Calculadora. Crea un programa que pregunte dos números al usuario. A continuación mostrará 
un menú similar a éste: 
1) Suma 
2) Resta 
3) Multiplicación 
4) División 
El usuario escribirá el número correspondiente a la operación que desea. Entonces se mostrará el 
resultado. El programa terminará cuando el usuario escriba el número 0.
 */
public class Ejercicio17CalculadoraDoWhileSwich {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio17");
        System.out.println("===========");
        System.out.println("Calculadora (+ - * / ^) preciona 0 para finalizar");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicación");
        System.out.println("4) División");
        System.out.println("5) Potencia");
        System.out.println("6) Resto");
        

        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, operador = 1;
        
        do {
            // Entrada de datos
            System.out.println("Introduce el operador");
            operador = sc.nextInt();
            if (operador == 0 || operador < 0 || operador > 6) {
                break;
            }
            System.out.println("Introduce el primer numero");
            num1 = sc.nextInt();
            System.out.println("Introduce el segundo numero");
            num2 = sc.nextInt();
        
            // Comprobacion y salida de datos
            switch (operador) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    if (num2 > 0) {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir entre 0");
                    }
                    break;
                case 5:
                    for (int i = 1; i < num2; i++) {
                        System.out.println(num1 + " ^ " + num2 + " = " + (num1 *= num2));
                    }
                    break;
                case 6:
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                    break;
            }
        } while (operador != 0);
        
        System.out.println("Fin del Programa");
        sc.close();
    }
}
