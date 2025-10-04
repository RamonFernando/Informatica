import java.util.Scanner;

public class EjercicioWhileBreak {

	public EjercicioWhileBreak() {
		
		Scanner sc = new Scanner(System.in);
	int intentos = 1;
	int numero_aleatorio = (int) (Math.random()*10 + 1);
	int numero;
	
	System.out.println("Ingresa el numero (3 intentos)");
	numero = sc.nextInt();
while (intentos <= 3) {
            
            if(numero == numero_aleatorio){
                System.out.println("<p>HAS ACERTADO No al " + intentos + " intento No: " + numero_aleatorio + "</p>");
                
                break;
            }
            if(intentos == 3) {
                System.out.println("<p>HAS PERDIDO No: {$intentos} el numero era {$numero_aleatorio} </p>");
                
                break;
            } else {
                System.out.println("<p>HAS FALLADO No. intentos: " + intentos + "</p>");
                
            }
            intentos++;
        }
	sc.close();
	}
	
}
