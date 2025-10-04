using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjerciciosBasicos_21_30
{
    internal class Program
    {
        static void Main(string[] args)
        {   
            // w3resource.com/csharp-exercises/basic-exercises-21-30/
            // 21. Verifique 20 o Sum Equals 20
            // Escriba un programa C# para verificar la suma de los dos enteros dados.
            // Devuelva verdadero si uno de los enteros es 20 o si su suma es 20.
            int num1 = 8;
            int num2 = 12;

            if (esNumero(10, 10)) 
                Console.WriteLine("Hay un resultado o numero igual a 20? ({0} + {1}), {2}", num1, num2, esNumero(num1, num2));
            else 
                Console.WriteLine("Hay un resultado o numero igual a 20? ({0} + {1}), {2}", num1, num2, esNumero(num1, num2));
    
            bool esNumero(int parNum, int parNum2) {
                if (parNum + parNum2 == 20 || parNum == 20 || parNum2 == 20) {
                    return true;
                }
                return false;  
            }

            // 22. Comprobar dentro de 20 de 100 o 200
            // Escriba un programa C# para verificar si el número entero dado está a una distancia menor(<=) de 20 posiciones de 100 o 200.
            // Console.WriteLine("Ingrese un numero entero: ");
            // int num3 = Convert.ToInt32(Console.ReadLine());
            int num3 = 150;
            Console.WriteLine("Comprobar si hay un numero en un rango de 20 posiciones cerca de 100 o 200");
            // Comprueba si el número está a una distancia menor (<=) de 20 posiciones de 100 o 200.
            Console.WriteLine(esNumero2(num3));
            bool esNumero2(int parNum3) {
                if (Math.Abs(parNum3 - 100) <= 20 || Math.Abs(parNum3 - 200) <= 20) 
                    return true;
                return false;
            }

            // 23. Convertir Cadena a Cajas Inferiores
            // Escriba un programa C# para convertir una cadena dada en minúsculas.
            string cadena = "HOLA MUNDO";
            Console.WriteLine("Cadena en minusculas: " + cadena.ToLower());

            // 24. Encuentra la Palabra Más Larga en la Cuerda
            // Escribe un programa C# para encontrar la palabra más larga en una cadena.
            string cadena2 = "Escriba un programa C# Sharp para mostrar el siguiente patrón usando el alfabeto.";
            string[] palabras = cadena2.Split(' '); // Split: Separa la cadena por espacios
            string palabraMasLarga = "";

            foreach (string palabra in palabras ) {
                if (palabra.Length > palabraMasLarga.Length)
                    palabraMasLarga = palabra;    
            }
            Console.WriteLine("Palabra mas larga: " + palabraMasLarga);

            // 25. Imprimir Números impares 1 a 99
            //Escriba un programa C# para imprimir números impares del 1 al 99. Imprime un número por línea.
            Console.WriteLine("Imprimir numeros impares del 1 al 99");
            mostrarImpares(9);

            void mostrarImpares(int numFinal) {
                for (int i = 1; i <= numFinal; i++) {
                    if (i % 2 != 0) 
                        Console.WriteLine(i);
                }
                
            }

            // 26. Suma de los Primos 500 Primos
            // Escriba un programa C# para calcular la suma de los primeros 500 números primos.

            Console.WriteLine("Suma de los 500 primos"); // Salida: 824693
              
            int sumaPrimos = 0;
            int numFinalPrimo = 500;
            int cont = 1;
            int numeroPrimo = 2;
         
            // Comprueba si un número es primo
            bool esPrimo(int numPrimo) {
                for (int i = 2; i <= Math.Sqrt(numPrimo); i++) {
                    if (numPrimo % i == 0) 
                        return false;
                }
                return true;
            }
            while (cont <= numFinalPrimo){
                if (esPrimo(numeroPrimo)) {
                    // Console.WriteLine(cont + ": " + numeroPrimo); // muestra los primos
                    cont++;
                    sumaPrimos += numeroPrimo;
                }
                numeroPrimo++;  
            }
            Console.WriteLine("Suma de los {0} primeros numeros primos: {1}", numFinalPrimo, sumaPrimos);

            // 27. Suma de Dígitos en Entero
            // Escriba un programa C# y calcule la suma de los dígitos de un número entero.
            int numero = 1234;
            int sumaDigitos = 0;

            while (numero > 0) {
                int digito = numero % 10;   // obtiene el ultimo digito del numero
                sumaDigitos += digito;      // suma cada digito en cada pasada del bucle
                numero /= 10;
            }
            Console.WriteLine("Suma de los digitos del numero: " + sumaDigitos); // Salida: 10 (1+2+3+4)

            // 28.Palabras Inversas en la Sentencia
            // Escribe un programa C# para revertir las palabras de una oración.
            string oracion = "Escriba un programa C# para revertir las palabras de una oración.";
            string[] palabrasOracion = oracion.Split(' ');
            string oracionInversa = "";

            for (int i = palabrasOracion.Length - 1; i >= 0; i--) {
                oracionInversa += palabrasOracion[i] + " ";
            }
            Console.WriteLine("Oracion: " + oracion);
            Console.WriteLine("Oracion inversa: " + oracionInversa);

            // 29. Tamaño de archivo en Bytes
            // Escriba un programa C# para encontrar el tamaño de un archivo especificado en bytes.
            FileInfo archivo = new FileInfo(@"C:\Users\Ramon\Ramon Dropbox\Ramon Perez\PC\Desktop\curso_udemy_JS\09_Curso_C#_IA_Ejercicios\Ejercicios_w3resource\EjerciciosBasicos_21-30\Program.cs");
            Console.WriteLine("Tamanio del archivo: " + archivo.Length + " bytes");

            // 30. Hexadecimal a Decimal
            // Escriba un programa C# para convertir un número hexadecimal en un número decimal.

            string hexval = "4B0";

            // Display the original hexadecimal number
            Console.WriteLine("Hexadecimal number: " + hexval);

            // Convert the hexadecimal string 'hexval' to its decimal equivalent
            int decValue = int.Parse(hexval, System.Globalization.NumberStyles.HexNumber);

            // Display a message indicating conversion to different number systems
            Console.WriteLine("Convert to-");

            // Display the decimal value obtained from the hexadecimal conversion
            Console.WriteLine("Decimal number: " + decValue);


            

            Console.ReadKey();

        }
    }
}
