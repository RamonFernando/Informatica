using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.NetworkInformation;
using System.Text;
using System.Threading.Tasks;

namespace EjerciciosBasicos_31_40
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // 31. Multiplica Dos Arrays
            // Escriba un programa C# para multiplicar los elementos correspondientes de dos matrices enteras.
            Console.WriteLine("Multiplica Dos Arrays");
            int[] array1 = { 1, 2, 3, 4, 5 };
            int[] array2 = { 6, 7, 8, 9, 10 };

            for (int i = 0; i < array1.Length; i++){
                Console.Write("[" + array1[i] + " " + array2[i] +  "]");    
            }
            Console.WriteLine();
            for (int i = 0; i < array1.Length; i++){
                Console.WriteLine("Posicion: {0}: {1} x {2} = {3}",i, array1[i], array2[i], (array1[i] * array2[i]));
            }

            // 32.Cuatro Copias de los Últimos Cuatro Caracteres
            // Escriba un programa C# para crear una cadena de cuatro copias, tomando los últimos cuatro caracteres de una cadena dada. Si la cadena dada es inferior a 4, devuelva la original.
            // Ingrese un string : El zorro marrón rápido salta sobre el perro perezoso.

            Console.WriteLine("Cuatro Copias de los Últimos Cuatro Caracteres");
            Console.WriteLine("Ingrese un string: ");
 
            // string str1 = Console.ReadLine();
            // Console.WriteLine(str1.Length < 4 ? str1 : str1.Substring(str1.Length - 4));

            string str = "El zorro marrón rápido salta sobre el perro perezoso.";
            if (str.Length > 4){
                // If the length is less than 4, concatenate the input string thrice
                // If the length is greater than or equal to 4, concatenate the last 4 characters of the input string four times
                Console.WriteLine("El zorro marrón rápido salta sobre el perro perezoso.");
                Console.WriteLine(str.Length < 4 ? str + str + str : str.Substring(str.Length - 4) + str.Substring(str.Length - 4) + str.Substring(str.Length - 4) + str.Substring(str.Length - 4));
            }

            // 33. Verifique el múltiplo de 3 o 7
            // Escriba un programa C# para verificar si un número positivo dado es un múltiplo de 3 o 7.

            Console.WriteLine("Verifique el múltiplo de 3 o 7");
            Console.WriteLine("Ingrese un numero: ");
            int num = 21;
            // int num = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine((num % 3 == 0 || num % 7 == 0) ?  $"El numero {num} es multiplo de 3 o 7" : $"El numero {num} no es multiplo de 3 o 7" );

            // 34.Check String Comienza con Word
            /* Escriba un programa C# para verificar si una cadena comienza con una palabra específica.
            Nota: Supongamos que la oración comienza con "Hola"
            Datos de muestra: string1 = "Hola cómo estás?"
            Resultado: Hola */
            string string1 = "Hola cómo estás?";
            Console.WriteLine("Check String Comienza con Word");
            // Console.WriteLine("Ingrese una palabra: ");
            // string palabra = Console.ReadLine();
            string palabra = "Hola";
            Console.WriteLine(string1.StartsWith(palabra) ? $"La palabra \"{palabra}\" comienza con {string1}" : $"La palabra \"{palabra}\" no comienza con {string1}");

            // 35.Comprobar Números Menos de 100 y Mayor de 200
            // Escriba un programa C# para verificar dos números dados donde uno es menor que 100 y el otro es mayor que 200.

            Console.WriteLine("Comprobar Números Menos de 100 y Mayor de 200");
            Console.WriteLine("Ingrese un numero: ");

            // int num1 = Convert.ToInt32(Console.ReadLine());
            // int num2 = Convert.ToInt32(Console.ReadLine());
            int num1 = 50;
            int num2 = 250;
            Console.WriteLine((num1 < 100 && num2 > 200) ? $"Los numeros {num1} y {num2} cumplen con la condicion" : $"Los numeros {num1} y {num2} no cumplen con la condicion");

            // 36. Compruebe el entero en Rango - 10 a 10
            // Escriba un programa C# para verificar si un número entero (de los dos números enteros dados) está en el rango: - 10 a 10.
            // Datos de prueba: - 5, 8
            Console.WriteLine("Compruebe el entero en Rango - 10 a 10");
            Console.WriteLine("Ingrese un numero: ");
            // int num1 = Convert.ToInt32(Console.ReadLine());
            // int num2 = Convert.ToInt32(Console.ReadLine());
            int num3 = -5;
            int num4 = 11;
            Console.WriteLine((num3 >= -10 && num3 <= 10) ? $"El numero {num3} esta en el rango - 10 a 10" : $"El numero {num3} no esta en el rango - 10 a 10");
            Console.WriteLine((num4 >= -10 && num4 <= 10) ? $"El numero {num4} esta en el rango - 10 a 10" : $"El numero {num4} no esta en el rango - 10 a 10");
       
            // 37. Eliminar 'HP' de String
            // Escriba un programa C# para comprobar si "HP" aparece en la segunda posición de una cadena y devuelva la cadena sin "HP".
            // Datos de prueba: Tutorial PHP

            Console.WriteLine("Eliminar 'HP' de String");
            // Console.WriteLine("Ingrese un string: ");
            // string str = Console.ReadLine();
            string str2 = "PHP Tutorial PHP";
            
            Console.WriteLine(str2.Substring(1, 2).Equals("HP") ? str2.Remove(1, 2) : str2); // Comprueba si "HP" aparece en la primera y segunda posicion y la elimina 
            Console.WriteLine(str2.IndexOf("HP") > 0 ? str2.Remove(str2.IndexOf("HP"), 2) : str2); // Busca en la cadena la primera aparicion de "HP" y lo elimina
            Console.WriteLine(str2.EndsWith("HP") ? str2.Remove(str2.Length - 2) : str2); // Verifica si "HP" está en la última posición y lo elimina

            // 38.Extraer 'PH' de String
            // Escribe un programa C# para obtener una cadena de dos caracteres de una cadena determinada. El primer y segundo caracteres de la cadena dada deben ser "P" y "H", por lo que PHP será "PH".
            Console.WriteLine("Extraer 'PH' de String");
            // Console.WriteLine("Ingrese un string: ");
            // string str = Console.ReadLine();
            string str3 = "Tutorial PHP";
            string strExtraer = str3.Substring(str3.IndexOf("PH"), 2); // Comprueba si la cadena contiene PH y la extrae (2 posiciones)
            Console.WriteLine(str3.IndexOf("PP") > 0 ? strExtraer : str3);

            // 39.El más Grande y el más Bajo de Tres Integers
            // Escriba un programa C# para encontrar los valores más grandes y más bajos de tres valores enteros.

            int num5 = 2; int num6 = 9; int num7 = 5; int num8 = 10;
            int mayor = Math.Max(num5, Math.Max(num6, num7)); // Encuentra el numero mas grande
            Console.WriteLine("El numero mas grande es: " + mayor);

            int menor = Math.Min(num5, Math.Min(num6, num7)); // Encuentra el numero mas pequeno
            Console.WriteLine("El numero mas pequeno es: " + menor);

            int numMayor = Math.Max(num5, Math.Max(num6, Math.Max(num7, num8)));
            Console.WriteLine("El numero mayor es:  " + numMayor);

            // 40.Más cercano a 20 o Retorno 0
            // Escriba un programa C# que verifique el valor más cercano de 20 de dos enteros dados y devuelva 0 si dos números son iguales.
            // int numCercano = 18;
            // int numCercano2 = 25;
            Console.WriteLine("Introduce un numero");
            int numCercano1 = Convert.ToInt32(Console.ReadLine());
            int numCercano2 = Convert.ToInt32(Console.ReadLine());
            if (numCercano1 == numCercano2)
                Console.WriteLine("Los numeros son iguales");
            else 
                Console.WriteLine(Math.Abs(numCercano1 - 20) < Math.Abs(numCercano2 - 20) ? $"El numero mas cercano es {numCercano1}" : $"El numero mas cercano es {numCercano2}");
            
            // Ejemplo de String Formtat
            var name = "Ramon";
            String format = String.Format("Mi nombre es {0}", name); // El 0 es el index de la variable name
             

            Console.ReadKey();
        }
    }
}
