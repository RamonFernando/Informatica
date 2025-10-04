using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Array_Clear
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
            Qué hace: Establece en el valor predeterminado del tipo 
            (por ejemplo, 0 para int, null para objetos, false para bool, etc.) a los elementos del array en un rango específico.
            
            Array.Clear(array, startIndex, length) establece los elementos del arreglo (desde el índice startIndex durante length elementos) a sus valores predeterminados:
            Para tipos numéricos (int, double, etc.): 0
            Para valores booleanos (bool): false
            Para cadenas (string): null
            Para objetos: null
            Es importante notar que Array.Clear no elimina físicamente los elementos del array; simplemente sobrescribe esos elementos con el valor por defecto (o null si es referencia). El tamaño del array se mantiene igual.
             */
            int[] numeros = { 10, 20, 30, 40, 50 };
            Array.Clear(numeros, 1, 2);
            // Limpia 2 elementos desde el índice 1 (20 y 30 se vuelven 0)

            Console.Write("Array después de Array.Clear(): ");
            foreach (int num in numeros)
            {
                Console.Write(num + " ");
            }
            // Salida: 10 0 0 40 50
            Console.WriteLine();
            // 1. Limpiar (clear) todo un array de enteros
            int[] numeros1 = { 1, 2, 3, 4, 5 };
            Console.WriteLine("Array original: " + string.Join(", ", numeros1));

            // Limpiamos todo el array, sustituyendo cada elemento por el valor predeterminado (0 en este caso)
            Array.Clear(numeros1, 0, numeros1.Length);
            Console.WriteLine("Array después de Array.Clear: " + string.Join(", ", numeros1));
            // Salida: 0, 0, 0, 0, 0


            // 2. Limpiar solo una parte de un array de cadenas
            string[] nombres = { "Ana", "Juan", "Pedro", "Lucía" };
            Console.WriteLine("\nArray original: " + string.Join(", ", nombres));

            // Limpiamos los elementos desde el índice 1 (segundo elemento) durante 2 posiciones
            Array.Clear(nombres, 1, 2);
            Console.WriteLine("Array después de limpiar la sección [1..2]: " + string.Join(", ", nombres));
            // Salida (los indices 1 y 2 se ponen en null):
            // Ana, , , Lucía

            Console.ReadKey();
        }
    }
}
