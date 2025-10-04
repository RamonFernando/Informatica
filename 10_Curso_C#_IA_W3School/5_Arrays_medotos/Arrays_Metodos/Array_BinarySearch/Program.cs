using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Array_BinarySearch
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
            Qué hace: Retorna el último índice en el que aparece el valor especificado. Si no lo encuentra, devuelve -1.
            Qué hace: Busca un elemento en un array ordenado usando el algoritmo de búsqueda binaria.
            Requisito: El array debe estar ordenado previamente.
            Retorna: El índice del elemento si lo encuentra; de lo contrario, devuelve un valor negativo.
            divide repetidamente el conjunto de datos a la mitad hasta encontrar el elemento buscado o determinar que no existe.
            */
            // Ejemplo 1
            int[] numeros = { 1, 2, 5, 7, 9 };
            int indice = Array.BinarySearch(numeros, 7);

            if (indice >= 0)
                Console.WriteLine("Elemento encontrado en el índice: " + indice);
            else
                Console.WriteLine("Elemento no encontrado.");
            // Salida: Elemento encontrado en el índice: 3

            // Ejemplo 2
            string[] words = { "apple", "banana", "cherry", "date" };
            string wordToFind = "cherry";
            int index = Array.BinarySearch(words, wordToFind);

            if (index >= 0)
                Console.WriteLine("Palabra encontrada en el índice: " + index);
            else
                Console.WriteLine("Palabra no encontrada.");

            Console.ReadKey();
        }
    }
}
