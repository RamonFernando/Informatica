using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Condicionales
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int edad = 0;
            Console.Write("Introduce tu edad: ");
            string edadUsuario = Console.ReadLine();

            // Comprobamos si la edad introducida es válida
            if (int.TryParse(edadUsuario, out edad))
            {
                if (edad >= 18)
                {
                    Console.WriteLine("Eres mayor de edad.");
                }
                else
                {
                    Console.WriteLine("Eres menor de edad.");
                }
            }
            else
            {
                Console.WriteLine("Error. Introduce un número válido.");
                
            }

            Console.ReadKey();
        }
    }
}
