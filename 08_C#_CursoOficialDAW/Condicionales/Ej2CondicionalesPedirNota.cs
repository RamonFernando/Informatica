using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Condicionales
{
    public class Ej2CondicionalesPedirNota
    {
        /**
         * Ejercicio 2: Pide una nota (0–10) y muestra:
            ● “Suspendido” si < 5
            ● “Aprobado” si >= 5 y < 7
            ● “Notable” si >= 7 y < 9
            ● “Sobresaliente” si >= 9
         * */

        /**
         * Método que pide una nota al usuario y muestra el resultado correspondiente.
         * return void Devuelve si esta suspendido, aprobado, notable o sobresaliente.
        */
        public static void pedirNota()
        {
            while (true)
            {
                Console.Clear();
                Console.WriteLine("=================================");
                Console.WriteLine("   Ejercicio 2 - Pedir nota ");
                Console.WriteLine("=================================");
                Console.WriteLine("Introduce tu nota (0 - 10) o 's' para salir: ");

                string entrada = Console.ReadLine();

                if (entrada.ToLower() == "s")
                {
                    Console.WriteLine("Saliendo del ejercicio...");
                    break;
                }
                if (!double.TryParse(entrada, out double nota) || nota < 0 || nota > 10)
                {
                        Console.WriteLine("Entrada no valida, introduce un numero real entre 0 y 10.");
                        Console.WriteLine("Presiona cualquier tecla para reiniciar...");
                        Console.ReadKey();
                        
                } else
                {
                    if (nota < 5)
                    {
                        Console.WriteLine("Suspendido");
                    } else if (nota >= 5 && nota < 7)
                    {
                        Console.WriteLine("Aprobado");
                    } else if (nota >= 7 && nota < 9)
                    {
                        Console.WriteLine("Notable");
                    } else if (nota > 9)
                    {
                        Console.WriteLine("Sobresaliente");
                    }
                    Console.WriteLine("Presiona cualquier tecla para reiniciar...");
                    Console.ReadKey();
                }               
            }
        }
    }
}
