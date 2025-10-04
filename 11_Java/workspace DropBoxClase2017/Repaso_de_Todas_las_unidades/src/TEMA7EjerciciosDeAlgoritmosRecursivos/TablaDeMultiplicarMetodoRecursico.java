package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class TablaDeMultiplicarMetodoRecursico {
	
	// Tabla de Multiplicar 
	public TablaDeMultiplicarMetodoRecursico() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println(tablaMultiplicar(3, 10));
		
		
	}
	
	public static String tablaMultiplicar(int num, int num1){
		if (num1 == 0) {
			//return String.ValueOf(num*num1);
			return String.valueOf(0);
		}else{
			System.out.println(num * (num1));
			return  tablaMultiplicar(num, num1-1);
		}
	}
}

// public static void main(String[] args) {
//
// System.out.println(multiplica(5, 0));
//
// }
//
// public static String multiplica(int a, int b) {
//
// if (b == 10) {
// return String.valueOf(a * b);
// } else {
// return String.valueOf(a * b) + "\n" + String.valueOf(multiplica(a, b + 1));
// }
//
// }
// }