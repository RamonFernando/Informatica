using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Array_ForEach
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
            Qué hace: Aplica una acción (delegado Action<T>) a cada elemento del array.
            Tipo: Método genérico estático de la clase Array.
             */
            int[] numeros = { 1, 2, 3, 4, 5 };
            Array.ForEach(numeros, n => Console.Write(n * 2 + " "));
            // Salida: 2 4 6 8 10

            Console.ReadKey();
        }
    }
}
