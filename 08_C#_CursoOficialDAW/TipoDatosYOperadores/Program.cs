using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TipoDatosYOperadores
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                // Ejercicios basicos de C#
                Console.Clear();
                Console.WriteLine("=======================================");
                Console.WriteLine("  Ejercicios de C# Datos y Operadores");
                Console.WriteLine("=======================================");
                Console.WriteLine("1. Ejercicio 1");
                Console.WriteLine("2. Ejercicio 2");
                Console.WriteLine("3. Ejercicio 3");
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
                        Console.WriteLine("\nEjercicio 1 - Declaracion de variables\n");
                        Ej1DeclaracionVariables.DeclaracionVariables();
                        
                        Console.WriteLine("Presiona cualquier tecla para volver al menu principal");
                        break;

                    case 2:
                        Console.WriteLine("\nEjercicio 2 - Operaciones matematicas\n");
                        Ej2EntradaConsola.OperacionesMatematicas();

                        Console.WriteLine("Presiona cualquier tecla para volver al menu principal");
                        break;
                    case 3:
                        Console.WriteLine("\nEjercicio 3 - Conversiones Fahrenheit a Celsius\n");
                        Ej3ConcersionesFaC.ConversionesFaC();

                        Console.WriteLine("Presiona cualquier tecla para volver al menu principal");
                        break;
                    default:
                        
                        Console.WriteLine("El numero ingresado esta fuera de rango, vuelve a introducir un numero.");
                        break;
                }
                //Console.WriteLine("Presiona cualquier tecla para volver al menu principal");
                Console.ReadKey();
            }
        }
    }
}
