using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Busqueda_Exist
{
    internal class Program
    {
        static void Main(string[] args)
        {   
            int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            foreach (var num in numeros) { Console.Write(num + " "); };
            
            // Array.Exists(array, predicate): Devuelve true si algún elemento del array cumple la condición.
            bool existeParMayor5 = Array.Exists(numeros, n => n > 5);
            Console.WriteLine("\n¿Existe un número mayor a 5? " + existeParMayor5);
            // Salida: ¿Existe un número mayor a 5? True

            Console.WriteLine("¿Existe un número mayor a 10? " + Array.Exists(numeros, num => num > 10));


            List<int> numbers = new List<int> { 1, 3, 5, 7, 8 };
            foreach (var num in numbers) { Console.Write(num + " "); };
            bool hasEven = numbers.Exists(num => num % 2 == 0);

            Console.WriteLine($"\n¿Hay algún número par? {hasEven}");

            Console.ReadKey();
        }
    }
}
