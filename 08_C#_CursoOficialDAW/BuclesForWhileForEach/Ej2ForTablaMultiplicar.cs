using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BuclesForWhileForEach
{
    public class Ej2ForTablaMultiplicar
    {
        public static void TablaMultiplicar()
        {
            while (true)
            {
                Console.Clear();
                Console.WriteLine("========================================");
                Console.WriteLine(" Ejercicio 2 For - Tabla de Multiplicar");
                Console.WriteLine("========================================");
                Console.Write("Introduce un numero: o (0) para salir: ");

                if (!double.TryParse(Console.ReadLine(), out double num))
                {
                    Console.WriteLine("El numero introducido no es valido. Introduce un numero entero.");
                    Console.WriteLine("Presiona cualquier tecla para continuar...");
                    Console.ReadKey();
                    break;
                }
                else
                {
                    if (num == 0)
                    {
                        Console.WriteLine("Saliendo del ejercicio...");
                        break;
                    }
                    Console.WriteLine("Tabla de multiplicar del " + num + ":");
                    for (int i = 1; i <= 10; i++)
                    {
                        Console.WriteLine(i + "º: " + num + " x " + i + " = " + (num*i));
                    }
                    Console.WriteLine("Presiona cualquier tecla para continuar...");
                    Console.ReadKey();
                }
            }
        }
    }
}
