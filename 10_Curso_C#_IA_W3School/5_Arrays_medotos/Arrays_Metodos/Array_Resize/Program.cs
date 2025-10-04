using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Array_Resize
{
    internal class Program
    {
        static void Main(string[] args)
        {   
            /*
            Qué hace: Cambia la dimensión de un array a un tamaño específico.
            Cómo funciona: Se crea internamente un nuevo array con el tamaño indicado y se copian los valores del anterior.
            Tipo: Método genérico estático.
             */

            // Ejemplo 1
            int[] numeros = { 1, 2, 3 };
            Console.WriteLine("Tamaño inicial: " + numeros.Length);  // 3

            Array.Resize(ref numeros, 5);  // Redimensiona a 5
            numeros[3] = 4; // Aniadimos un elemento indicando que la posicion 3 tiene el valor 4
            numeros[4] = 8; // Aniadimos un elemento indicando que la posicion 4 tiene el valor 8

            Console.WriteLine("Tamaño después de Resize: " + numeros.Length);  // 5

            Console.WriteLine("Valores del array:");
            foreach (int num in numeros)
            {
                Console.Write(num + " ");
            }
            // Salida: 1 2 3 4 5

            // Ejemplo 2

            // 1. Creando un nuevo arreglo más grande y copiando los elementos:
            int[] originalArray = { 1, 2, 3 };
            int newSize = 5;

            // Crear un nuevo arreglo con el tamaño deseado
            int[] newArray = new int[newSize];

            // Copiar los elementos del arreglo original al nuevo
            Array.Copy(originalArray, newArray, originalArray.Length);

            // Los elementos adicionales del nuevo arreglo estarán inicializados en 0
            
            // 2. Utilizando la clase Array.Resize:
            int[] originalArray = { 1, 2, 3 };
            Array.Resize(ref originalArray, 5);

            // originalArray ahora tiene una longitud de 5, y los nuevos elementos son 0
            // Nota: Array.Resize es conveniente, pero modifica el arreglo original. Si necesitas preservar el arreglo original, copia los elementos como en el primer ejemplo.

            // 3. Utilizando la clase Array.Copy:
            int[] originalArray = { 1, 2, 3 };
            int newSize = 5;
            int[] newArray = new int[newSize];
            // Copiar los elementos del arreglo original al nuevo
            Array.Copy(originalArray, newArray, originalArray.Length);

            Console.ReadKey();
        }
    }
}
