using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Arrays
{
    public class Ej4ArraysRandomMostrarPares
    {
        /**
         * Ejercicio 4: Declara un array de 10 enteros aleatorios (usa Random) y muestra solo lo pares.
        **/
        /**
         * Declara un array de 10 enteros aleatorios (usa Random) y muestra solo lo pares.
         * return void Muestra solo los numeros pares
         */
        public static void MostrarPares()
        {
            Console.Clear();
            Console.WriteLine("==============================================");
            Console.WriteLine("  Ejercicio 4 Arrays - Numeros pares(Random)");
            Console.WriteLine("==============================================");
            Random random = new Random();
            int[] numeros = new int[10];

            for (int i = 0; i < numeros.Length; i++)
            {
                numeros[i] = random.Next(minValue: 0, maxValue: 101);
            }
            Console.WriteLine("Los numeros pares son: ");
            for (int i = 0; i < numeros.Length; i++)
            {
                if (numeros[i] % 2 == 0)                
                    Console.Write(numeros[i] + " ");

                // Console.WriteLine(numeros[i] + " "); // Muestra todos
            }
            Console.WriteLine($"\nEl menor valor es: { numeros.Min()} y el mayor es: { numeros.Max()}");
            return;
        }
    }
}
