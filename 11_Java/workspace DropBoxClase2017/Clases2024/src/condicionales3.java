/**
 * @author Ramon
 * Queremos diseñar un programa que solicite un número al usuario y le responda "Es impar" o 
"No es impar". Utiliza para ello la notación ? en lugar de if asignando a una variable de tipo String 
el resultado y mostrando después esta variable.
 */
public class condicionales3 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 3");
        System.out.println("============");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Es impar");
        } else {
            System.out.println("No es impar");
        }

        String resultado = (num % 2 == 0) ? "No es impar" : "Es impar";
        System.out.println("El resultado es: " + resultado);
        System.out.println("Fin");
        sc.close();
    }
}
