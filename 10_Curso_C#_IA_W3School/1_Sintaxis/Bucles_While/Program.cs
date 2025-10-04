using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bucles
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int edad = 0;
            Console.WriteLine("Aplicacion mayor de Edad  ");
            string edadUsuario = Console.ReadLine();
            while (true)
            {
                if (edadUsuario == "") break;
                
                if (int.TryParse(edadUsuario, out edad))
                {
                    if (edad >= 18)
                    {
                        Console.WriteLine("Es mayor de edad");
                        break;
                    }
                    else
                    {
                        Console.WriteLine("Es menor de edad");
                        break;
                    }
                }
                else
                {
                    Console.WriteLine("Edad no valida, intentelo de nuevo: ");
                    edadUsuario = Console.ReadLine();
                    continue;
                }
            }
            Console.ReadKey();
        }
    }
}
