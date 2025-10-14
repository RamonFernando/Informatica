using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01_Ej2ContarCaracteresString
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Introduzca una frase: ");
            string frase = Console.ReadLine();
            while (frase.Length == 0 || frase == null)
            {   
                Console.WriteLine("No has introducido ninguna frase, intentalo de nuevo: ");
                frase = Console.ReadLine();
            }
            
            Console.WriteLine("La frase tiene: " + frase.Length + " caracteres");
            
                
            Console.ReadKey();
        }
    }
}
