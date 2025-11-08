using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Funciones
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.Clear();
                Console.WriteLine("================================");
                Console.WriteLine("  Ejercicios de C# - Funciones");
                Console.WriteLine("================================");
                Console.WriteLine("1. Ejercicio 1 Greet");
                Console.WriteLine("2. Ejercicio 2 Sum");
                Console.WriteLine("3. Ejercicio 3 IsEven");
                Console.WriteLine("4. Ejercicio 4 Average");
                Console.WriteLine("0. Salir");
                Console.WriteLine("=======================================");
                Console.WriteLine("Introduce el numero del ejericio que quieres ver: ");
                if (!int.TryParse(Console.ReadLine(), out int opc) || opc < 0)
                {
                    Console.WriteLine("Opcion no valida, introduce un numero entero.");
                    Console.ReadKey();
                    continue;
                }

                switch (opc)
                {
                    case 0:
                        Console.WriteLine("Saliendo del programa...");
                        return;

                    case 1:
                        Console.WriteLine("\nEjercicio 1 - Funciones - Greet\n");
                        Ej1FuncionesGreet.Greet();

                        Console.WriteLine("Presiona cualquier tecla para volver al menu principal");
                        break;

                    case 2:
                        Console.WriteLine("\nEjercicio 2 - Funciones - Sum(int num1, int num2)\n");
                        int num1 = Ej2FuncionesSum.NumRandom();
                        int num2 = Ej2FuncionesSum.NumRandom();
                        Ej2FuncionesSum.Sum(num1, num2);
                        
                        Console.WriteLine("Presiona cualquier tecla para volver al menu principal");
                        break;

                    case 3:
                        Console.WriteLine("\nEjercicio 3 - Bucles - While Pedir numeros\n");
                        int num = Ej3FuncionesIsEven.NumRandom();
                        Console.WriteLine($"Numero {num} es Par? " + Ej3FuncionesIsEven.IsEven(num));

                        Console.WriteLine("Presiona cualquier tecla para volver al menu principal");
                        break;

                    case 4:
                        Console.WriteLine("\nEjercicio 4 - Bucles - Foreach Mostrar nombres\n");
                        double[] notas = new double[10];
                        Ej4FuncionesAverage.Average(notas);

                        Console.WriteLine("Presiona cualquier tecla para volver al menu principal");
                        break;
                    default:

                        Console.WriteLine("El numero ingresado esta fuera de rango, vuelve a introducir un numero.");
                        break;
                }

                Console.ReadKey();
            }
        }
    }
}
