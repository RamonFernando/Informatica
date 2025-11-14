using System;

namespace Arrays
{
    internal class Program
    {
        private const string MENSAJE_VOLVER_MENU = "Presiona cualquier tecla para volver al menu principal";

        static void Main(string[] args)
        {
            while (true)
            {
                // Ejercicios basicos de C#
                Console.Clear();
                MostrarMenu();

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
                        Console.WriteLine("\nEjercicio 1 - Arrays - Sumar (Variable acumulativa)\n");
                        Ej1ArraysSumaTotal.SumarNumeros();
                        Console.WriteLine(MENSAJE_VOLVER_MENU);
                        break;

                    case 2:
                        Console.WriteLine("\nEjercicio 2 - Arrays - Mayor numero\n");
                        Ej2ArraysMayorNum.MayorNumero();
                        Console.WriteLine(MENSAJE_VOLVER_MENU);
                        break;

                    case 3:
                        Console.WriteLine("\nEjercicio 3 - Arrays - Buscar palabra\n");
                        Ej3ArraysBuscarPalabra.BuscarPalabra();
                        Console.WriteLine(MENSAJE_VOLVER_MENU);
                        break;

                    case 4:
                        Console.WriteLine("\nEjercicio 4 - Arrays - Numeros Random (Mostrar pares)\n");
                        Ej4ArraysRandomMostrarPares.MostrarPares();
                        Console.WriteLine(MENSAJE_VOLVER_MENU);
                        break;

                    default:
                        Console.WriteLine("El numero ingresado esta fuera de rango, vuelve a introducir un numero.");
                        break;
                }

                Console.ReadKey();
            }
        }

        private static void MostrarMenu()
        {
            Console.WriteLine("============================");
            Console.WriteLine("  Ejercicios de C# Arrays");
            Console.WriteLine("============================");
            Console.WriteLine("1. Ejercicio 1 Sumar numeros");
            Console.WriteLine("2. Ejercicio 2 Mayor numero");
            Console.WriteLine("3. Ejercicio 3 Buscar palabra");
            Console.WriteLine("4. Ejercicio 4 Random");
            Console.WriteLine("0. Salir");
            Console.WriteLine("=======================================");
            Console.WriteLine("Introduce el numero del ejericio que quieres ver: ");
        }
    }
}
