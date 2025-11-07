using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BuclesForWhileForEach
{
    public class Ej3BuclesWhilePedirNumCont
    {
        public static void ContarNumeros()
        {
            /**
             * Ejercicio 3: Usando un while, pide números al usuario hasta que introduzca un número
             * negativo.Al final, muestra cuántos números positivos se introdujeron.
            **/
            int cont = 0;
            List<double> numeros = new List<double>();
            while (true)
            {
                Console.Clear();
                Console.WriteLine("========================================");
                Console.WriteLine("   Ejercicio 3 While - Contar Numeros");
                Console.WriteLine("========================================");
                Console.Write("Introduce un numero: o (-1) para salir: ");

                // Validaciones de entrada
                string entrada = Console.ReadLine();
                
                if (!double.TryParse(entrada, out double num))
                {
                    Console.WriteLine("Debe introducir un numero. Por favor vuelva a intentarlo.");
                    Console.ReadLine();
                    continue;
                }
                if (num == -1)
                {
                    Console.WriteLine("Saliendo del ejercicio...");
                    break;
                }
                if (num >= 0)
                {
                    numeros.Add(num);
                    cont++;
                }
                Console.WriteLine("Presiona enter para ingresar el siguiente numero.");
                Console.ReadLine();
            }
            Console.Clear();
            if (cont > 0)
            {
                Console.WriteLine($"Has introducido {cont} numeros positivos.");
                foreach (double n in numeros)
                {
                    Console.Write(n + " ");
                }
                Console.WriteLine("\nPresiona cualquier tecla para salir del ejercicio.");
                Console.ReadKey();
            }
            else
            {
                Console.WriteLine("No has introducido ningun numero positivo.");
            }
        }
    }
}
