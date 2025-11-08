using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Funciones
{
    public class Ej1FuncionesGreet
    {
        /**
         * Ejercicio 1: Crea un método llamado Greet() que muestre “¡Hola, mundo!” y llámalo
         * desde Main().
        **/
        public static void Greet()
        {
            Console.Clear();
            Console.WriteLine("=====================================");
            Console.WriteLine("  Ejercicios 1 - Funciones - Greet");
            Console.WriteLine("=====================================");
            Console.WriteLine("1. Ejercicio 1 Greet Hola Mundo!");
            
            string saludo = "Hola Mundo!";
            Console.WriteLine(saludo);
            return;
        }
    }
}
