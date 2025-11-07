using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BuclesForWhileForEach
{
    public class Ej1BuclesForMostrarNum
    {
        /**
         * Ejercicio 1: Usando un for, muestra los números del 1 al 10.
         **/
        public static void MostrarNumeros()
        {
            while (true)
            {
                Console.Clear();
                Console.WriteLine("===================================");
                Console.WriteLine(" Ejercicio 1 For - Mostrar Numeros");
                Console.WriteLine("===================================");
                Console.WriteLine("Numeros del 1 al 10:");
                for (int i = 1; i <= 10; i++)
                {
                    Console.Write(i + " ");
                }
                Console.WriteLine();
                return;
            }
        }
    }
}
