using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Array_Reverse
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
            Array.Reverse(array) invierte por completo el orden de los elementos del arreglo especificado.
            Array.Reverse(array, int startIndex, int length) invierte solo el rango de elementos que va desde el índice startIndex hasta startIndex + length - 1.
            Ten en cuenta que Array.Reverse modifica el array original; no devuelve una nueva instancia.
             */
            int[] numeros = { 1, 2, 3, 4, 5 };
            Array.Reverse(numeros);

            Console.Write("Array en orden inverso:");
            foreach (int num in numeros)
            {
                Console.Write(num + " ");
            }
            // Salida: 5 4 3 2 1

            Console.WriteLine("");

            // 1. Invertir todo el array
            int[] numeros1 = { 1, 2, 3, 4, 5 };
            Console.WriteLine("Array original: " + string.Join(", ", numeros1));

            Array.Reverse(numeros1);  // Invertimos todo el array
            Console.WriteLine("Array invertido: " + string.Join(", ", numeros1));
            // Salida: 5, 4, 3, 2, 1

            // 2. Invertir solo parte del array
            int[] otrosNumeros = { 10, 20, 30, 40, 50, 60 };
            Console.WriteLine("\nArray original: " + string.Join(", ", otrosNumeros));

            // Invertimos solo una sección: desde el índice 1 hasta 3 elementos
            // Es decir, invertimos la sub-sección [20, 30, 40]
            Array.Reverse(otrosNumeros, 1, 3); // Invierte de la posición 1 a 3
            Console.WriteLine("Array con sub-sección invertida: " + string.Join(", ", otrosNumeros));
            // Salida: 10, 40, 30, 20, 50, 60
            Console.ReadKey();
        }
    }
}
