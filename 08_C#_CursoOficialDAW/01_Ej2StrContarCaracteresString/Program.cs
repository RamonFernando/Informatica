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
            {   /*
                2. Escriba un programa C# Sharp para encontrar la longitud de una cadena sin utilizar una función de biblioteca.
                Datos de prueba:
                Ingrese la cadena: w3resource.com
                Salida esperada : La longitud de la cuerda es: 15
                */
                Console.WriteLine("01_Ej2 String Contar Caracteres");
                Console.WriteLine("Introduzca una frase: ");
                string frase = Console.ReadLine();
                while (frase.Length == 0 || frase == null)
                {
                    Console.WriteLine("No has introducido ninguna frase, intentalo de nuevo: ");
                    frase = Console.ReadLine();
                }
                // Console.WriteLine("La frase tiene: " + frase.Length + " caracteres");

                int contador = 0;
                for (int i = 0; i < frase.Length; i++)
                    contador++;

                Console.WriteLine("La cadena tiene: " + contador + " caracteres");


                Console.ReadKey();
            }
        }
    }
}