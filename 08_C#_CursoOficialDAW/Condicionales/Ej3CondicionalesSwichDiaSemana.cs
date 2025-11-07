using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Condicionales
{
    public class Ej3CondicionalesSwichDiaSemana
    {
        /**
         * Ejercicio 3: Crea un programa que pida un número del 1 al 7 y muestre el día de la semana
         * correspondiente usando switch.
         **/
        /**
         * Metodo que pide un numero del 1 al 7 valida y muestra el dia de la semana correspondiente.
         * return void Devuelve el dia de la semana correspondiente al numero introducido.
         */
        public static void DiaSemana()
        {
            while (true)
            {
                Console.Clear();
                Console.WriteLine("====================================");
                Console.WriteLine("   Ejercicio 3 - Dia de la semana ");
                Console.WriteLine("====================================");
                Console.WriteLine("Introduce un numero del 1 al 7 para obtener el dia de la semana o '0' para salir: ");
                
                // Validaciones de entrada
                if (!int.TryParse(Console.ReadLine(), out int opc))
                {
                    Console.WriteLine("Entrada no valida, introduce un numero entero.");
                    Console.WriteLine("Presiona cualquier tecla para reiniciar...");
                    Console.ReadKey();
                }
                else
                {
                    if(opc == 0)
                    {
                        Console.WriteLine("Saliendo del ejercicio...");
                        Console.ReadKey();
                        break;
                    }
                    switch (opc)
                    {
                        case 1:
                            Console.WriteLine("Lunes");
                            Console.WriteLine("Presiona cualquier tecla para reiniciar...");
                            Console.ReadKey();
                            break;
                        case 2:
                            Console.WriteLine("Martes");
                            Console.WriteLine("Presiona cualquier tecla para reiniciar...");
                            Console.ReadKey();
                            break;
                        case 3:
                            Console.WriteLine("Miercoles");
                            Console.WriteLine("Presiona cualquier tecla para reiniciar...");
                            Console.ReadKey();
                            break;
                        case 4:
                            Console.WriteLine("Jueves");
                            Console.WriteLine("Presiona cualquier tecla para reiniciar...");
                            Console.ReadKey();

                            break;
                        case 5:
                            Console.WriteLine("Viernes");
                            Console.WriteLine("Presiona cualquier tecla para reiniciar...");
                            Console.ReadKey();
                            break;
                        case 6:
                            Console.WriteLine("Sabado");
                            Console.WriteLine("Presiona cualquier tecla para reiniciar...");
                            Console.ReadKey();
                            break;
                        case 7:
                            Console.WriteLine("Domingo");
                            Console.WriteLine("Presiona cualquier tecla para reiniciar...");
                            Console.ReadKey();
                            break;
                        default:
                            Console.WriteLine("Numero fuera de rango, introduce un numero del 1 al 7.");
                            Console.WriteLine("Presiona cualquier tecla para reiniciar...");
                            break;
                    }
                }
            }
        }
    }
}
