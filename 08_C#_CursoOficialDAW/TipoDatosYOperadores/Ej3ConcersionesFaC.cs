using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TipoDatosYOperadores
{
    public class Ej3ConcersionesFaC
    {/**
    * Ejercicio 3: Crea un programa que convierta grados Celsius a Fahrenheit. Fórmula: F =
    * (C * 9 / 5) + 32
    */
        /**
         * Metodo para la conversion de temperaturas
         * @return void Muestra por consola la conversion de Celsius a Fahrenheit
         */
        public static void ConversionesFaC()
        {
            while (true)
            {
                Console.Clear();
                Console.WriteLine("===================================");
                Console.WriteLine("  Conversiones Fahrenheit a Celsius");
                Console.WriteLine("===================================");
                Console.WriteLine("Ingresa la temperatura en Celsius: ('s' para salir)");
                
                string enter = Console.ReadLine();
                if (enter.ToLower() == "s")
                {
                    Console.WriteLine("Saliendo del ejercicio...");
                    return;
                }

                // Validaciones
                if (!double.TryParse(enter, out double celsius))
                {
                    Console.WriteLine("Debes introducir una temperatura valida.");
                    Console.WriteLine("Presiona cualquier tecla para volver al menu...");
                    Console.ReadLine();
                    continue;
                }

                double fahrenheit = (celsius * 9 / 5) + 32;
                Console.WriteLine(celsius + " grados Celsius son:  " + fahrenheit + " grados Fahrenheit.");
                Console.WriteLine("Presiona cualquier tecla para reiniciar...");
                Console.ReadLine();
            }
        
        }
    }
}
