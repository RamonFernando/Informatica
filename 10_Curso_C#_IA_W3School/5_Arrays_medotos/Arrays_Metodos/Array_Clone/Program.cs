using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Array_Clone
{
    internal class Program
    {
        static void Main(string[] args)
        {   
            /* 
            Qué hace: Crea una copia superficial del array (solo copia los elementos de primer nivel).
            Tipo: Método de instancia. 
            */
            int[] numeros = { 10, 20, 30 };
            int[] copia = (int[])numeros.Clone();

            copia[0] = 99;

            Console.WriteLine("Array original:");
            foreach (var num in numeros)
            {
                Console.Write(num + " ");
            }
            // Salida: 10 20 30

            Console.WriteLine("\nArray copiado (Clone):");
            foreach (var num in copia)
            {
                Console.Write(num + " ");
            }
            // Salida: 99 20 30

        }
    }
}
