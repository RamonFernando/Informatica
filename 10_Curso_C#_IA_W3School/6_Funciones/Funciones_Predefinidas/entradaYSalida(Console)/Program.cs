using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace entradaYSalida_Console_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // 5.Funciones de entrada y salida(Console)
            while (true)
            {
                // a.Leer y mostrar en consola
                Console.WriteLine("¿Cómo te llamas?");
                string nombre = Console.ReadLine();
                Console.WriteLine($"Hola, {nombre}!");

                // b.Limpiar consola
                Console.WriteLine("¿Desea limpiar la consola? (s/n)");
                nombre = Console.ReadLine();
                if (nombre.Equals("s"))
                {
                    Console.Clear();
                    break;
                }


            }
            // Console.ReadKey();
        }
    }
}
