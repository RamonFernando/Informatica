using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Array_Bucles_For
{
    internal class Program
    {
        static void Main(string[] args)
        {

            int[] numeros = new int[5];

            Console.WriteLine("Introduzca 5 notas: ");
            try
            {
                // Bucle For
                for (int i = 0; i < numeros.Length; i++)
                {
                    Console.Write("Nota {0}: ", i + 1);
                    numeros[i] = Convert.ToInt32(Console.ReadLine());
                }
                int sumaNotas = 0;
                int media = 0;
                for (int i = 0; i < numeros.Length; i++) { sumaNotas += numeros[i]; }
                media = sumaNotas / numeros.Length;
                Console.WriteLine("La media de tus notas es: {0}", media);
                // Con metodo aggregate
                media = numeros.Aggregate((suma, nota) => suma + nota) / numeros.Length;
                Console.WriteLine("La media de tus notas es: {0}", media);
            }catch (Exception e)
            {
                Console.WriteLine("Error: " + e.Message);
                // throw e; // Muestra un mensaje especificado
            }finally
            {
                Console.WriteLine("Programa terminado");
                Console.ReadKey();
            }
        }
    }
}
