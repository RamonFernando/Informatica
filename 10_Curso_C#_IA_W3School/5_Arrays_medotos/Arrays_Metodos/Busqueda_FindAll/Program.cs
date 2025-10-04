using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Busqueda_FindAll
{
    internal class Program
    {
        static void Main(string[] args)
        {
        // Array.FindAll(array, predicate): Devuelve todos los elementos que cumplan la condición en un nuevo array.
        int[] paresMayores5 = Array.FindAll(numeros, n => n > 5);
        Console.WriteLine("Todos los números mayores a 5:");
        foreach (var num in paresMayores5)
        {
            Console.Write(num + " ");
        }
        // Salida: 6 8 10
        }
    }
}
