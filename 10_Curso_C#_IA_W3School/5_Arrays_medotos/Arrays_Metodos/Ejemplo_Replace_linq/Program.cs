using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejemplo_Replace_linq
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            // Reemplazar con Linq y arrow function
            int[] numeros = { 1, 2, 3, 4, 2 };
            foreach (var numero in numeros) { Console.Write(numero + " "); }
            int[] resultado = numeros.Select(num => num == 2 ? 99 : num).ToArray(); // Reemplaza 2 con 99
            
            Console.Write("\nArray después de reemplazar: ");
            foreach (var numero in resultado){
                Console.Write(numero + " ");
            }
            Console.WriteLine("\n");

            // Método normal
            int[] numeros1 = { 1, 2, 3, 4, 2 };
            foreach (var numero in numeros1) { Console.Write(numero + " "); }
            for (int i = 0; i < numeros1.Length; i++){
                if (numeros1[i] == 2){
                    numeros1[i] = 36; // Reemplazar 2 por 99
                }
            }
            Console.WriteLine("\nArray después de reemplazar: ");
            foreach (var numero in numeros1){
                Console.Write(numero + " ");
            }


            Console.ReadKey();
        }
    }
}
