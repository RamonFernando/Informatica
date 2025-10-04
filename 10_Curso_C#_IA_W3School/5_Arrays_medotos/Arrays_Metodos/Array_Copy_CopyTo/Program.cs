using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Array_Copy_CopyTo
{
    internal class Program
    {
        static void Main(string[] args)
        {   
            /*
            Qué hace: Copia un rango de elementos desde un array de origen a otro de destino.
            Tipo: Método estático sobrecargado.
             */
            int[] origen = { 10, 20, 30, 40, 50 };
            int[] destino = new int[5];

            Array.Copy(origen, destino, 3);  
            // Copia los primeros 3 elementos (10,20,30) de 'origen' a 'destino'

            Console.WriteLine("Array destino después de Array.Copy():");
            foreach (int num in destino)
            {
                Console.Write(num + " ");
            }
            // Salida: 10 20 30 0 0

            /*
            Qué hace: Similar a Array.Copy(), pero se llama desde la instancia origen para copiar al array de destino a partir de un índice.
            Tipo: Método de instancia de la clase Array.
             */
            int[] origen = { 1, 2, 3, 4, 5 };
            int[] destino = new int[5];

            // Copia los valores de 'origen' a 'destino' a partir del índice 0 de 'destino'
            origen.CopyTo(destino, 0);

            Console.WriteLine("Array destino después de CopyTo():");
            foreach (int num in destino)
            {
                Console.Write(num + " ");
            }
            // Salida: 1 2 3 4 5


        }
    }
}
