using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Busqueda_TrueForAll
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Array.TrueForAll(array, predicate): Devuelve true si todos los elementos cumplen la condición.
            bool todosSonPares = Array.TrueForAll(numeros, n => n % 2 == 0);
            Console.WriteLine("\n¿Todos los números son pares? " + todosSonPares);
            // Salida: ¿Todos los números son pares? True

            Console.ReadKey();
        }
    }
}
