using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Remoting.Messaging;
using System.Text;
using System.Threading.Tasks;

namespace Funciones
{
    public class Ej2FuncionesSum
    {
        /**
         * Ejercicio 2: Crea un método Sum(int a, int b) que devuelva la suma de dos números
         * y muestre el resultado.
        **/
        public static void Sum(int num1, int num2)
        {
            Console.Clear();
            Console.WriteLine("=====================================");
            Console.WriteLine("  Ejercicios 2 - Funciones - Sum");
            Console.WriteLine("=====================================");
            Console.WriteLine("2. Ejercicio 2 Sumar numeros.");

            int result = num1 + num2;
            Console.WriteLine(num1 + " + " + num2 + " = " + result);
            return;
        }

        // Evita crear duplicados de Random
        private static readonly Random random = new Random();
        // Crea un numero aleatorio
        public static int NumRandom () => random.Next(1, 100);
    }
}
