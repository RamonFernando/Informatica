package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio4 {

	public Ejercicio4() {
		// 4.- Escribe un método recursivo que permita calcular la división entera de dos números enteros
		// haciendo restas sucesivas.
		// Ejemplo:
		// División entera de 20 entre 6: 20 / 6 = 3
		// Método de restas sucesivas:
		// 20 – 6 = 14 1 resta
		// 14 – 6 = 8 2 restas
		// 8 – 6 = 2 3 restas
		// Ahora el resultado, 2, es menor que el divisor, 6. Ya no podemos
		// restar más. El resultado de la
		// división entera es el número de restas, 3.
	}

	public static void main(String[] args) {
		System.out.println(dividir(20, 6));

	}
	public static int dividir(int divisor, int dividendo){
		if (divisor < dividendo) {
			return 0;
		}else {
			return 1 + dividir(divisor - dividendo, dividendo);
		}
	}
}
