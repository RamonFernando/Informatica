using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02_Ej3StringSepararCaracteres
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
            3. Escriba un programa C# Sharp para separar caracteres individuales de una cadena.
            Datos de prueba:
            Ingrese la cadena: w3resource.com
            Salida esperada :

            Los caracteres de la cadena son: 
            w 3 resource . com*/
            Console.WriteLine("02_Ej3 String Separar Caracteres");
            Console.WriteLine("Ingrese la cadena:");
            string cadena = Console.ReadLine();

            while (cadena.Length == 0)
            {
                Console.WriteLine("Cadena vacia, por favor vuelva a introducir la cadena:");
                cadena = Console.ReadLine();
            }

            foreach (var character in cadena)
                Console.Write(character + " ");
            

            Console.ReadKey();
        }
    }
}
