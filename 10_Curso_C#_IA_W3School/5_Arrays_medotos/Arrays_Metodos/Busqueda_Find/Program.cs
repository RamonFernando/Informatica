using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Busqueda_Find
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Array.Find(array, predicate): Devuelve el primer elemento que cumpla la condición.
            // Array.Find
            int primerParMayor5 = Array.Find(numeros, n => n > 5);
            Console.WriteLine("Primer número mayor a 5: " + primerParMayor5);
            // Salida: Primer número mayor a 5: 6
        }
    }
}
