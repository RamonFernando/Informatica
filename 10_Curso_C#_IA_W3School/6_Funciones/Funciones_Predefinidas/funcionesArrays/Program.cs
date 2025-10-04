using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace funcionesArrays
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // 6.Funciones para trabajar con arreglos(Array)
            
            // a.Ordenar un arreglo
            int[] numeros = { 5, 2, 8, 1 };
            Array.Sort(numeros);
            Console.WriteLine(string.Join(", ", numeros)); // "1, 2, 5, 8"
            
            // b.Invertir un arreglo
            Array.Reverse(numeros);
            Console.WriteLine(string.Join(", ", numeros)); // "8, 5, 2, 1"

            // c.Obtener el tamaño de un arreglo
            Console.WriteLine(numeros.Length); // 4

            // d. Copiar un arreglo
            int[] copia = new int[numeros.Length];
            Array.Copy(numeros, copia, numeros.Length);
            Console.WriteLine(string.Join(", ", copia)); // "8, 5, 2, 1"

            // Buscar elementos en un arreglo
            
            // e.Obtener el índice de un elemento en un arreglo
            Console.WriteLine(Array.IndexOf(numeros, 8)); // 2

            // f. buscar coincidencias en un arreglo con find
            // find: Devuelve el primer elemento que cumple la condición
            Console.WriteLine(Array.Find(numeros, x => x == 8)); // 8
            
            // g. buscar coincidencias en un arreglo con findIndex
            // findIndex: Devuelve el índice del primer elemento que cumple la condición
            Console.WriteLine(Array.FindIndex(numeros, x => x == 8)); // 2

            // h. Contar el número de elementos que cumplen una condición
            // FindAll: Devuelve un arreglo con los elementos que cumplen la condición
            Console.WriteLine(Array.FindAll(numeros, x => x > 0).Length); // 4

            // i. Verificar si todos los elementos de un arreglo cumplen una condición
            // TrueForAll: Devuelve true si todos los elementos cumplen la condición
            Console.WriteLine(Array.TrueForAll(numeros, x => x > 0)); // true

            // j. Verificar si un arreglo contiene un elemento
            // Exists: Devuelve true si el elemento está en el arreglo
            Console.WriteLine(Array.Exists(numeros, x => x == 8)); // true

            
            


            
        }
    }
}
